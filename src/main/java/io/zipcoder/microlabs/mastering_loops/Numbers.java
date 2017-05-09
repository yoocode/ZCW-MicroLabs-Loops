package io.zipcoder.microlabs.mastering_loops;


import java.util.Random;

public class Numbers {


    public String oneToTen() {
        String numberString = "oneToTen\n*** Output ***\n";

        for (int i = 1; i <= 10; i++) {
            if (i != 10) {
                numberString += i + "\n";
            } else {
                numberString += i;
            }
        }return numberString;
    }

    public String oddNumbers(){
        String numberString = "oddNumbers()\n*** Output ***\n";

        for (int i = 1; i <= 19; i +=2){
            if (i != 19) {
                numberString += i + "\n";
            }else {
                numberString += i;
            }
        }return numberString;
    }

    public String squares(){
        String numberString = "squares()\n*** Output ***\n";

        for (int i = 1; i <= 10; i ++){
            if(i != 10){
                numberString += (int)Math.pow (i, 2) + "\n";
            }else {
                numberString += (int)Math.pow(i, 2);
            }
        }return numberString;

    }

    public String random4() {
        Random random = new Random();
        String numberString = "random4()\n*** Output ***\n";

        for (int i = 0; i < 4; i++) {
            if (i != 3) {
                numberString += random.nextInt(10) + "\n";
            } else {
                numberString += random.nextInt(10);
            }
        }
        return numberString;
    }

    public String even(int n){

        String numberString = "even(20)\n*** Output ***\n";

        for (int i = 2; i < n; i +=2){
            if (i != n-2) {
                numberString += i + "\n";
            }else {
                numberString += i;
            }
        }return numberString;
    }

    public String powers(int n){
        String numberString = "powers(8)\n*** Output ***\n";
        for (int i = 1; i <= n; i++){
            if (i != n) {
                numberString += (int)Math.pow(2, i) + "\n";
            }else {
                numberString += (int)Math.pow(2, i);
            }
        }return numberString;
    }

}
