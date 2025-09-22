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
        for (int num : tabell) {
            sum += num;
        }
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        // TODO
        for (int num : tabell) {
            if (tall == num) {
                return true;
            }
        }
        return false;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        // TODO
        int index = 0;
        for (int num : tabell) {
            if (num == tall) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // f)
    public static int[] reverser(int[] tabell) {

        // TODO
        int length = tabell.length;
        int[] reversed = new int[length];
        int i = 0;
        while (length> 0) {
            reversed[i] = tabell[length-1];
            length--;
            i++;

        }
        return reversed;
    }

    // g)
    public static boolean erSortert(int[] tabell) {

        // TODO
        if(tabell.length == 0){
            return true;
        }
        int refNumber = tabell[0];
        for(int i = 1; i<tabell.length; i++){
                if(tabell[i] > refNumber){
                    refNumber = tabell[i];
                }
                else{
                    return false;
                }
        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        // TODO
        int[] result = new int[tabell1.length + tabell2.length];
        for(int i = 0; i<tabell1.length; i++){
            result[i] = tabell1[i];
        }
        for(int j = 0; j<tabell2.length; j++){
            result[tabell1.length + j] = tabell2[j];
        }
        return result;

    }
}
