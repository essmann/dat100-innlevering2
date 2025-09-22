package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        // TODO
        String str = " [";
        for (int num : tabell) {
            str += num + " ";
        }
        str += "]";
        System.out.println(str);

    }

    // b)
    public static String tilStreng(int[] tabell) {

        // TODO
        if (tabell.length == 0) {
            return "[]";
        }
        String numString = "";
        String resultString = "[@]";
        for (int num : tabell) {
            numString += num + ",";
        }
        numString = numString.substring(0, numString.length() - 1);
        resultString = resultString.replace("@", numString);
        return resultString;
    }

    // c)
    public static int summer(int[] tabell) {

        // TODO
        int sum = 0;
        for(int num : tabell){
            sum += num;
        }
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        // TODO
        throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        // TODO
        throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
    }

    // f)
    public static int[] reverser(int[] tabell) {

        // TODO
        throw new UnsupportedOperationException("Metoden reverser ikke implementert");
    }

    // g)
    public static boolean erSortert(int[] tabell) {

        // TODO
        throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        // TODO
        throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

    }
}
