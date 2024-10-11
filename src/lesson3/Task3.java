package lesson3;
//Заведите три переменные типа String. С клавиатуры введите в них вашу фамилию, имя и отчество соответственно. Выведите в консоль ваше ФИО в одну строку.
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = scanner.next();
        System.out.println("Введите вашу фамилию");
        String surname = scanner.next();
        System.out.println("Введите ваше отчество");
        String patronymic = scanner.next();
        System.out.println(surname + " " + name + " " + patronymic);
    }
}
