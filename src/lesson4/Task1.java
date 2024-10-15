package lesson4;
/*
Ввести с клавиатуры целое число.
Вывести в консоль его факториал.
*/
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для которого будет выведен факториал");
        int factorial = scanner.nextInt();
        int result = 1;
        for (int i = factorial; i > 0; i--) {
            result *= i;
        }
        System.out.println("факториал числа " + factorial + " = " + result);
    }
}

