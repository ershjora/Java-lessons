package lesson3;
/*
Ввести с клавиатуры два целых числа. Если Число1 четное, вывести произведение двух чисел
, если нет - частное. Также если числа равны - вывести надпись Числа равны!
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        int x = num1 % 2;
        if (x == 0) {
            System.out.println(num1 * num2);
        } else if (x != 0 && num1 != num2) {
            double z = (double) num1 / num2;
            System.out.println(z);
        } else System.out.println("Числа ровны!");
    }

}