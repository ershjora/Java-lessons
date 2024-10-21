package Jenya;

import java.util.Scanner;

public class prikolNomer8Wtoroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int degree = 0;
        int answer = 0;
        for (int i = 0; ; ) {
            if (number %2 ==0){
                answer= number/=2;
                degree++;


            } else {
                break;
            }
        }
        if (answer==1){
            System.out.println(degree);
        }
        else System.out.println("Нет!");
    }
}