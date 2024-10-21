package Jenya;

import java.util.Scanner;

public class prikolNomer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту пирамиды: ");
        int Height = scanner.nextInt();
        int indent =0;
        int count = Height*2;
        for (int i = 0; i < Height; i++) {
            indent= Height-i;

            for (int j = 0; j < indent; j++) {
                System.out.print(" ");
            }
            if (i==0)
                System.out.print("*");
            for (int j = 0; j < i*2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
