package Jenya;

import java.util.Scanner;

public class prikolNomerNeznau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Count = 0;
        System.out.println("Введите число : ");
        int Number = scanner.nextInt();
        int Number2 = 0;
        for (int i = 1; i < Number+1; i++) {
            if (Number%i ==0){
                Count++;
                Number2= i;
                System.out.print(Number2 + " ");
            }
        }
        if (Count ==2) System.out.println("Да");
        else System.out.println("Нет");
    }
}
