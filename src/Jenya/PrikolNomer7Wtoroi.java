package Jenya;

import java.util.Scanner;

public class PrikolNomer7Wtoroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int age = scanner.nextInt();
        if (age%4==0 && age%100!=0 || age%400==0) System.out.println("Да");
        else System.out.println("Нет");
    }
}
