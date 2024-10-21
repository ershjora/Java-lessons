package Jenya;

import java.util.Scanner;

public class prikolNomer8Wtoroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int Number = scanner.nextInt();
        int Degree = 0;
        int Answer =0;
        for (int i = 0; i < Number; ) {
            if (Number !=1 && Number %2 ==0){
                Answer= Number/=2;
                Degree++;
                if (Answer%2 !=0){
                    System.out.println("Нет!");
                }
            }
            else {
                break;
            }
        }
        System.out.println(Degree);
    }
}