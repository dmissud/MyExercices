package org.dbs.huitreines;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doIt = true;

        while (doIt) {
            System.out.println("Nombre de reine (1 -> 14, <return> to quit) : ");
            String inputString = scanner.nextLine();
            DrawEchiquier drawEchiquier = new DrawEchiquier(System.out);
            if (!inputString.isEmpty()) {
                try {
                    int size = Integer.valueOf(inputString);
                    if ((size > 0) && (size < 15)) {
                        EchiquierForQueen echiquier = new EchiquierForQueen(size);
                        Solver solver = new Solver(echiquier);
                        int nbSolution = solver.solve();
                        boolean parseSolution = true;
                        while (parseSolution) {
                            int nbSolutions = solver.solve();
                            System.out.println("Il y a " + nbSolutions + " solution(s) : ");
                            inputString = scanner.nextLine();
                            if (!inputString.isEmpty()) {
                                int nbSol = Integer.valueOf(inputString);
                                if ((nbSol > 0) && (nbSol <= nbSolutions)) {
                                    EchiquierForQueen aSolution = solver.giveSolution(nbSol);
                                    if (aSolution != null) {
                                        drawEchiquier.draw(aSolution);
                                    }
                                }
                            } else {
                                parseSolution = false;
                            }
                        }
                    } else {
                        System.out.println("Uniquement des valeurs entre 1 et 14. Vous avez saisi : "
                                + inputString);
                    }
                } catch (NumberFormatException numberException) {
                    System.out.println("Quoi ??? je comprend pas. Vous avez saisi : " + inputString);
                }
            } else {
                doIt = false;
            }
        }

    }
}
