package org.dbs.noi;

public class Main {

    public static final String NOM_UN_TEXTE = "data/un_texte.txt";

    public static void main(String[] args) {
        Texte texte = new Texte(NOM_UN_TEXTE);
        texte.analyse();
        texte.saveAnalyse();
    }

}
