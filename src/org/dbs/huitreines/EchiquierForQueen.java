package org.dbs.huitreines;

public class EchiquierForQueen {
    private int size;

    public EchiquierForQueen(EchiquierForQueen echiquierForQueen) {
        this.echiquier = new int[echiquierForQueen.getSize()];
        System.arraycopy(echiquierForQueen.getEchiquier(),0, this.echiquier, 0, echiquierForQueen.getSize());
        this.size = echiquierForQueen.getSize();
    }

    int getSize() {
        return size;
    }

    private int[] echiquier;

    int[] getEchiquier() {
        return echiquier;
    }

    public EchiquierForQueen(int size) {
        this.size = size;
        this.echiquier = new int[this.size];
    }

    boolean place(int line, int column) {
        boolean isPlace = true;
        int posLine = 0;
        int posColumn;
        while (isPlace && (posLine < line)) {
            posColumn = echiquier[posLine];
            isPlace = isPlace && (posColumn != column);
            isPlace = isPlace && (Math.abs(line - posLine) != Math.abs(column - posColumn));
            posLine++;
        }
        return isPlace;
    }

    public boolean play(int line, int column) {
        if (place(line, column)) {
            echiquier[line] = column;
            return true;
        }
        return false;
    }

    void unPlay(int line) {
        echiquier[line] = 0;
    }
}