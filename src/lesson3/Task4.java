package lesson3;
/*
Введите с клавиатуры два целых числа. Если первое – четное ИЛИ второе – кратно трем, выведите в консоль результат сравнения этих чисел в любом формате.
Например, Число1 больше Числа2. Или true (если числа равны) и false - если нет.
Если первое число кратно и двум, и трем – также выведите на экран число один, возведенное в степень N, где N – второе число.
В случае, если результат выражения выходит за пределы типа int (допустимые значения - [-2147483648; 2147483647]) – вывести сообщение Результат выражения слишком большой!
*/
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber =scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        if ((firstNumber % 2) == 0 && (firstNumber % 3) == 0) {
            if(Math.pow(firstNumber,secondNumber) > Integer.MAX_VALUE || Math.pow(firstNumber,secondNumber) < Integer.MIN_VALUE){
                System.out.println("Результат выражения слишком большой!");
            }
            else System.out.println(Math.pow(firstNumber,secondNumber));
    }   else if ((firstNumber % 2) == 0 || (secondNumber % 3) == 0) {
            System.out.println(firstNumber>secondNumber);
        }
}
}
