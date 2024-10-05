package lesson1;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }
}