package lesson4;

import java.util.Scanner;

/*
 * Ввести с клавиатуры целое число.
 * Вывести в консоль сумму цифр введенного числа.
 */
public class Task2While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        int summ = 0;
        while (number != 0) {
            summ += number % 10;
            number /= 10;
        }
        System.out.println(summ);
    }
}