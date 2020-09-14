public class Main {
    public static void main (String args[]){


        int Array [][] = new int [4][4];

        for (int i = 0; i < Array.length;i++){
            for (int j = 0; j < Array.length; j++){
                Array [i][j] = i*j;
                System.out.print(Array[i][j]);
            }

            System.out.println();
        }

    }
}