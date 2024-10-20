package Jenya;

import java.util.Scanner;

public class prikolNomer8Wtoroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int Number = scanner.nextInt();
        int Degree = 0;
        int Count =0;
        for (int i = 0; i < Number; ) {
            if (Number !=1 && Number %2 ==0){
                Number/=2;
                Degree++;
            }
            else {
                System.out.println("");
                break;
            }
        }
        System.out.println(Degree);
    }
}