package lesson5;
/*
Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.
Вариант 1: не используя переменную типа String;
Подсказка для варианта 2: создать пустую строку можно так: String s = "";
 */
public class Task1var1 {
    public static void main(String[] args) {
        char [] arr = {'G','e','o','r','g','i','i'};
        for (char i : arr)
            System.out.print(i);
    }
}
