package org.dbs.huitreines;

import java.util.ArrayList;
import java.util.List;

public class Solver {
    private EchiquierForQueen echiquierForQueen;
    private List<EchiquierForQueen> solutions;

    public Solver(EchiquierForQueen echiquierForQueen) {
        this.echiquierForQueen = echiquierForQueen;
        solutions = new ArrayList<>();
    }

    public int solve() {
        solutions.clear();

        this.findPlaceForQueen(0);

        return solutions.size();
    }

    public EchiquierForQueen giveSolution(int position) {
        if (position <= this.solutions.size()) {
            return new EchiquierForQueen(this.solutions.get(position - 1));
        } else {
            return null;
        }
    }

    private void findPlaceForQueen(int line) {
        if (line >= this.echiquierForQueen.getSize()) {
            memorizeNewSolution();
        } else {
            int wrkColumn = 0;
            while (wrkColumn < this.echiquierForQueen.getSize()) {
                if (echiquierForQueen.play(line, wrkColumn)) {
                    findPlaceForQueen(line + 1);
                    echiquierForQueen.unPlay(line);
                }
                wrkColumn++;
            }
        }
    }

    private void memorizeNewSolution() {
        EchiquierForQueen solution = new EchiquierForQueen(this.echiquierForQueen);
        solutions.add(solution);
    }
}
