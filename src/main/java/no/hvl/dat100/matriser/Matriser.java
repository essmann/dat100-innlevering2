package no.hvl.dat100.matriser;

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
		for(int[] array : matrise){
            for(int num : array){
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
		for(int[] array : matriseCopy){

            for(int i = 0; i<array.length; i++){
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

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
