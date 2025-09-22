package no.hvl.dat100;

public class HelperMethods {
    public static int[][] deepCopy2DArray(int[][] arrayToCopy) {
        int rows = arrayToCopy.length;
        int[][] copy = new int[rows][]; // create new top-level array

        for (int i = 0; i < rows; i++) {
            copy[i] = arrayToCopy[i].clone(); // clone each inner array
        }

        return copy;
    }

}
