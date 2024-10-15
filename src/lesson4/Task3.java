package lesson4;
/*
Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа). Нарисовать в консоли заданный прямоугольник, используя - и |.
Углы прямоугольника обозначить символом   (пробел). Каждая единица длины должна обозначаться одним символом -, каждая единица ширины – символом |.
*/
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну прямоугольника ");
        int length = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника ");
        int width = scanner.nextInt();
        System.out.print(" ");
        for (int i = length; i > 0; i--) {
            System.out.print("_");
        }
        System.out.println(" ");
        for (int i = width; i > 0; i--) {
            System.out.print("|");
            for (int j = length; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print(" ");
        for (int i = length; i > 0; i--) {
            System.out.print("_");
        }
    }
}
