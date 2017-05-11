package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYetTest(){

        Scanner in = new Scanner(System.in);
        String seed = "\" Are we there yet?\"";

        StringBuilder sb = new StringBuilder();

        do {
            System.out.print(seed);
            sb.append(in.next());

        }
        while (in.next() != "Yes");
    }

}
