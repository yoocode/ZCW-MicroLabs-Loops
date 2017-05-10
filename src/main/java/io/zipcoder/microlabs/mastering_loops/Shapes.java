package io.zipcoder.microlabs.mastering_loops;


public class Shapes {


    public String triangle(){

        String seed = "triangle()\n*** Output ***\n";

        StringBuilder sp = new StringBuilder();

        for (int i = 1; i < 6; i ++){
            for (int j = 1; j<=i; j++){
                sp.append("*");
            }
            if (i != 5) sp.append("\n");
        }
        return seed + sp.toString();

    }

    public String tableSquare() {
        String seed = "tableSquare()\n*** Output ***\nA 4 x 4 table square\n";

        StringBuilder sb = new StringBuilder();
        int mult;

        for (int row = 1; row < 5; row++) {
            sb.append("|");
            for (int col = 1; col < 5; col++) {
                mult = row * col;
                if (col == 1) sb.append(" " + mult + " |");
                else {
                    if (mult < 10) sb.append("  " + mult + " |");
                    else sb.append(" " + mult + " |");
                }
            }
            sb.append("\n");
        }
        return seed + sb.toString() + "";
    }


    public String tableSquares(int n){
        return "";
    }

    public static void main (String[] args){
        Shapes shapes = new Shapes();
        System.out.println(shapes.triangle());
    }
}
