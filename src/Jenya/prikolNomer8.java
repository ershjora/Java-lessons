package Jenya;

import java.util.Scanner;

public class prikolNomer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        int x= scanner.nextInt();
        System.out.println("Введите Y: ");
        int y= scanner.nextInt();
        if (x < 0 && y > 0) System.out.println("1/4");
        else if (x > 0 && y > 0) System.out.println("2/4");
        else if (x < 0 && y < 0) System.out.println("3/4");
        else System.out.println("4/4");

    }
}
