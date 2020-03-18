package org.dbs.noi;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Texte {
    private final Path path;
    private final boolean valid;
    private final TreeMap<String, Integer> dico;
    private int nbLine;
    private int nbWords;
    private final List<String> lstPopWorld;
    private int bigOne;

    public Texte(String nom) {
        this.path = Paths.get(nom);
        this.valid = Files.exists(path);
        dico = new TreeMap<>();
        lstPopWorld = new ArrayList<>();
    }

    public boolean isValid() {
        return valid;
    }

    public void saveAnalyse() {
        List<String> lines = new ArrayList<>();
        Set<Map.Entry<String, Integer>> set = dico.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : set) {
            lines.add("w:" + stringIntegerEntry.getKey() + " found " + stringIntegerEntry.getValue());
        }
        lines.add("Nombre de ligne(s) : " + this.nbLine);
        lines.add("Nombre de mot(s) : " + this.dico.keySet().size());
        lines.add("Nombre de mot(s) dans le texte : " + this.nbWords);
        lines.add("Mot(s) populaires : "+ this.bigOne+ " "+this.lstPopWorld);
        Path desc = Paths.get(path.getParent()+"\\ana_"+path.getFileName());
        try {
            Files.write(desc, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Nombre de ligne(s) : " + this.nbLine);
        System.out.println("Nombre de mot(s) : " + this.dico.keySet().size());
        System.out.println("Nombre de mot(s) dans le texte : " + this.nbWords);
        System.out.println("Mot(s) populaires : "+ this.bigOne+ " "+this.lstPopWorld);
    }

    public void analyse() {
        if (isValid()) {
            doAnalyse();
        }
    }

    private void doAnalyse() {
        this.nbLine = 0;
        try {
            nbLine = analyseFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.nbWords = analyseStatDico();
    }

    private int analyseStatDico() {
        int nbWords = 0;
        this.bigOne = 0;
        this.lstPopWorld.clear();
        Set set = dico.entrySet();
        for (Object o : set) {
            Map.Entry mentry = (Map.Entry) o;
            int val = (int) mentry.getValue();
            nbWords = nbWords + val;
            if (val > bigOne) {
                this.lstPopWorld.clear();
                this.bigOne = val;
                this.lstPopWorld.add((String) mentry.getKey());
            } else {
                if (val == bigOne) {
                    this.lstPopWorld.add((String) mentry.getKey());
                }
            }
        }
        return nbWords;
    }

    private int analyseFile() throws IOException {
        BufferedReader bufferedReadeFiles;
        bufferedReadeFiles = Files.newBufferedReader(this.path);
        String line;
        int nbLine = 0;
        while ((line = bufferedReadeFiles.readLine()) != null) {
            doAnalyseLine(line);
            nbLine++;
        }
        return nbLine;
    }

    private void doAnalyseLine(String line) {
        String delimiters = "\\\"|\\:|\\.|\\,|\\s+|[-_«*»()!%£$/&;?…“– \\[\\]]|[0-9][0-9]h[0-9][0-9]|[0-9]+";
        String[] words = line.split(delimiters);
        for (String word : words) {
            addDico(word.toLowerCase());
        }
    }

    private void addDico(String word) {
        if (word.length() > 0) {
            int value = 1;
            if (dico.containsKey(word)) {
                value = dico.get(word) + 1;
            }
            dico.put(word, value);
        }
    }
}
