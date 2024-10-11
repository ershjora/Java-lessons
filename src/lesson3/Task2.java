package lesson3;
/*
Написать программу, которая принимает строку с клавиатуры:
Если введенная строка равна Hi - вывести в консоль Hello;
Если Bye - Good bye;
Если How are you - How are your doing;
Если любая другая строка - вывести Unknown message.
реализция через If
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст...");
        String str = scanner.nextLine();
        if (str.equals("Hi")) {
            System.out.println("Hello");
        } else if (str.equals("Bye")) {
            System.out.println("Good bye");
        } else if (str.equals("How are you")) {
            System.out.println("How are your doing");
        } else System.out.println("Unknown message");
    }
}
