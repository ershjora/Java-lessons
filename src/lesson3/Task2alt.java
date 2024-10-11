package lesson3;
/*
Написать программу, которая принимает строку с клавиатуры:
Если введенная строка равна Hi - вывести в консоль Hello;
Если Bye - Good bye;
Если How are you - How are your doing;
Если любая другая строка - вывести Unknown message.
реализция через switch-case
 */

import java.util.Scanner;

public class Task2alt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст...");
        String str = scanner.nextLine();
        switch (str) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are your doing");
                break;
            default:
                System.out.println("Unknown message");
                break;
        }

    }
}
