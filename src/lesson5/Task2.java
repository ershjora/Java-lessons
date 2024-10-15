package lesson5;
/*
Создать массив int из 5 элементов. Заполнить его значениями, введенными с клавиатуры. Вывести на экран сумму каждого значения с предыдущим.
Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива.
ЕБАТЬ Я ГОРЖУСЬ СОБОЙ ЧТО НАПИСАЛ ЭТО ПРАВИЛЬНО БЕЗ ПОДСКАЗОК!
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i< arr.length ;i++) {
            System.out.println("Введите число в массив: ");
            arr[i]=scanner.nextInt();
        }
        int lastnumber = arr[arr.length-1];
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ = lastnumber + arr[i];
            System.out.println("summ = "+summ);
            lastnumber = arr[i];
        }
       for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
