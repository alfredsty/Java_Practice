package Tutorial.ch01.ex_square;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int w = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == 1 || i == h ) {
                    System.out.print("*");
                }else {
                    if (j == 1 || j == w) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
    }

