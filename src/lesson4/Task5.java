package lesson4;
/*
Выводить на экран Не угадал! до тех пор, пока с клавиатуры не будет введено число 1. Запрашивать число с клавиатуры:
Вариант 1: перед выводом на экран Не угадал!
Вариант 2: после вывода на экран Не угадал!
Подумать, где стоило бы использовать цикл do-while, а где – нет.
 */
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        do {
            System.out.println("Не угадал!");
        } while (scanner.nextInt() != 1);
        System.out.println("Угадал, молодец!");

    }
}
