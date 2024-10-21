package Jenya;

import java.util.Scanner;

public class prikolNomer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heap1 = 0;
        System.out.println("Введите количество камней для первой кучи: ");
        int quantity1 = scanner.nextInt();
        System.out.println("Введите количество камней для второй кучи: ");
        int quantity2 = scanner.nextInt();
        int count = 0;
        while (true){
            if (quantity1 != 0 | quantity1 != 0) {
                System.out.println("Введите номер кучи: ");
                heap1 = scanner.nextInt();
                if (heap1 != 1 && heap1 != 2){
                    System.out.println("еблан, введи 1 или 2");
                    continue;
                }
                System.out.println("Введите количество забираемых камней: ");
                count = scanner.nextInt();
                if (heap1 == 1){
                    quantity1 -= count;

                } else {
                    quantity2 -= count;
                }
                System.out.println("Количество камней в первой куче = " + quantity1 + " Количество камне во второй куче = " + quantity2);
            } else break;
        }
    }
}