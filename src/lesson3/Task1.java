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
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNum = scanner.nextInt();
        int even = firstNum % 2;
        if (firstNum==secondNum) {
            System.out.println("Числа ровны!");
        } else if (even == 0) {
            System.out.println(firstNum*secondNum);
        } else System.out.println((double) firstNum / secondNum);
    }

}