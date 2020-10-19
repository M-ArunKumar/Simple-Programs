/*

Given a 9×9 sudoku we have to evaluate it for its correctness. 
We have to check both the sub matrix correctness and the whole sudoku correctness.

*/

import java.util.HashSet;
import java.util.Set;

public class SudukoCorrectness {
    private static boolean evaluateSudoku() {
        int[][] Matrix = new int[][] {
                { 5, 1, 3, 6, 8, 7, 2, 4, 9 },
                { 8, 4, 9, 5, 2, 1, 6, 3, 7 },
                { 2, 6, 7, 3, 4, 9, 5, 8, 1 },
                { 1, 5, 8, 4, 6, 3, 9, 7, 2 },
                { 9, 7, 4, 2, 1, 8, 3, 6, 5 },
                { 3, 2, 6, 7, 9, 5, 4, 1, 8 },
                { 7, 8, 2, 9, 3, 4, 1, 5, 6 },
                { 6, 3, 5, 1, 7, 2, 8, 9, 4 },
                { 4, 9, 1, 8, 5, 6, 7, 2, 3 } };
        Set<Integer> RowSet = new HashSet<Integer>();
        Set<Integer> ColumnSet = new HashSet<Integer>();

        boolean haveDuplicate = true;

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                if(Matrix[i][j] > 0 && Matrix[i][j] < 10){
                    RowSet.add(Matrix[i][j]);
                }
            }

            for (int j = 0; j < Matrix[i].length; j++) {
                if(Matrix[j][i] > 0 && Matrix[j][i] < 10){
                    ColumnSet.add(Matrix[j][i]);
                }
            }

            if (RowSet.size() != 9 && ColumnSet.size() != 9) {
                return false;
            }
        }
        return haveDuplicate;
    }

    public static void main(String[] args) {
        evaluateSudoku();
        boolean answer = evaluateSudoku();
        if (answer){
            System.out.println("True");
        }else System.out.println("False");
    }
}
