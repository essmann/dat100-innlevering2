package no.hvl.dat100.matriser;
 class HelperMethods{
     static int[][] deepCopy2DArray(int[][] arrayToCopy) {
         int rows = arrayToCopy.length;
         int[][] copy = new int[rows][]; // create new top-level array

         for (int i = 0; i < rows; i++) {
             copy[i] = arrayToCopy[i].clone(); // clone each inner array
         }

         return copy;
     }

 }
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
        int[][] matriseCopy = matrise.clone();
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
        int i = 0; int j = 0;
        int col = matrise.length;
        int row = matrise[0].length;
        while(i < row){

            while(j < col){
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
        throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

    }


}

// f)

