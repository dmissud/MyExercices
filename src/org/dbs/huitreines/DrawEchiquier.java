package org.dbs.huitreines;

import java.io.PrintStream;

public class DrawEchiquier {
    private PrintStream out;

    public DrawEchiquier(PrintStream out) {
        this.out = out;
    }

    public void draw(EchiquierForQueen echiquier) {
        int[] posQueen = echiquier.getEchiquier();
        // Affichage numerotation collone
        this.out.print("     ");
        for (int column = 0; column < echiquier.getSize(); column++) {
            this.out.print(" ");
            if (column < 9) {
                this.out.print(" ");
            } else {
                this.out.print(1);
            }
            this.out.print(" ");
        }
        this.out.println(" ");

        this.out.print("     ");
        for (int column = 0; column < echiquier.getSize(); column++) {
            this.out.print(" ");
            if (column < 9) {
                this.out.print(column+1);
            } else {
                this.out.print(column-9);
            }
            this.out.print(" ");
        }
        this.out.println();

        for (int line = 0; line < echiquier.getSize(); line++) {
            this.out.print("  " + (char)('A' + line) + "  ");
            for (int column = 0; column < echiquier.getSize(); column++) {
                if (column == posQueen[line]) {
                    this.out.print(" Q ");
                } else {
                    this.out.print(" - ");
                }
            }
            this.out.println();
        }
    }
}
