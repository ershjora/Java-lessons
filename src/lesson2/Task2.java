package lesson2;

import java.util.Scanner;
/*
Введите с клавиатуры целые числа a и b. Выведите на экран результат сравнения:
a3 > b2
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        boolean c = (a * a * a) > (b * b);
        System.out.println(c);
    }
}
