package lesson2;

import java.util.Scanner;
/*
Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения
c = ba(a + b)/(a2)
Совпадает ли результат выражения, если a и b — переменные типа int (для проверки не забудьте также использовать подходящий метод Scanner)?
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        double c = b * a * (a + b) / (a * a);
        System.out.println(a + " " + b + " " + c);
    }
}
