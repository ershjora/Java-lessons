package lesson4;
/*
Ввести с клавиатуры целое число (Число 2). Для каждого из чисел от 1 до 10 выполнить:
Если Число1 четное, вывести сумму двух чисел (пр.1), если нет - разность (пр.2). Также если числа равны - вывести надпись Числа равны!.
пр1.: Число1 + Число2 = Сумма, где Число1 - значение 1-го числа (от 1 до 10), Число2 - значение введенного с клавиатуры числа, Сумма - результат сложения.
пр2.: Число1 - Число2 = Разность, где Число1 - значение 1-го числа (от 1 до 10), Число2 - значение введенного с клавиатуры числа, Разность - результат вычитания.
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;
        while (count < 10) {
            count++;
            if (number == count)
                System.out.println("Числа ровны!");
            else if (count % 2 == 0)
                System.out.println("Пр1. Число 1 " + count + " + число 2 " + number + " = " + (count + number));
            else
                System.out.println("Пр1. Число 1 " + count + " - число 2 " + number + " = " + (count - number));

        }
    }
}
