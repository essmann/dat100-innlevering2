package no.hvl.dat100.matriser;

//class HelperMethods {
//    static int[][] deepCopy2DArray(int[][] arrayToCopy) {
//        int rows = arrayToCopy.length;
//        int[][] copy = new int[rows][]; // create new top-level array
//
//        for (int i = 0; i < rows; i++) {
//            copy[i] = arrayToCopy[i].clone(); // clone each inner array
//        }
//
//        return copy;
//    }
//
//}

import no.hvl.dat100.HelperMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {

        // TODO
        System.out.println(matrise);
    }

    // b)
    public static String tilStreng(int[][] matrise) {

        // TODO
        String tmp = "";
        for (int[] array : matrise) {
            for (int num : array) {
                tmp += num + " ";
            }
            tmp += "\n";
        }
        return tmp;

    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        // TODO
        int[][] matriseCopy = HelperMethods.deepCopy2DArray(matrise);
        int row = 0;
        for (int[] array : matriseCopy) {

            for (int i = 0; i < array.length; i++) {
                matriseCopy[row][i] = matrise[row][i] * tall;
            }
            row++;
        }
        return matriseCopy;

    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        // TODO
        throw new UnsupportedOperationException("Metoden erLik ikke implementert");

    }

    // e)
    public static int[][] speile(int[][] matrise) {

        // TODO
        //{1,2,3} {4,5,6} {7,8,9} -> {1,4,7}, {2,5,8}, {3,6,9}
        int[][] matriseCopy = HelperMethods.deepCopy2DArray(matrise);
        int i = 0;
        int j = 0;
        int col = matrise.length;
        int row = matrise[0].length;
        while (i < row) {

            while (j < col) {
                matriseCopy[i][j] = matrise[j][i]; //sort of swapping them
                j++;
            }
            i++;
            j = 0;
        }
        return matriseCopy;

        //select each array, one element, go to next, do this for inner array length times.
    }

    public static int[][] multipliser(int[][] a, int[][] b) {

        // TODO
        // a = {1,2,3} {4,5,6} {7,8,9}
        //b = {10,11,12} {13,14,15} {16,17,18}

        // a*b =  {84,90,96}, {201,216,231}, {318,342,366}


        if (a[0].length != b.length) {
            throw new IllegalArgumentException("The number of columns in the first matrix must equal the number of rows in the second matrix.");
        }

        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            int sum = 0;
            for (int j = 0; j < colsB; j++) {

                for (int k = 0; k < colsA; k++) {

                    int leftNum = a[i][k]; // 1 , 2 , 3
                    int rightNum = b[k][j];
                    sum += leftNum * rightNum;


                }
                result[i][j] = sum;
                sum = 0;
            }
        }
        return result;
    }

}


// f)

