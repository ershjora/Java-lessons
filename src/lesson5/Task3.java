package lesson5;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int number = 1;
        int count = 0;
        int length = 0;
        int index = 0;
        while (length < arr.length) {
            number +=1;
            for (int i = 1; i <= number ; i++) {
                if (number %i==0){
                    count++;
                }
            }
            if (count == 2){
               arr[index] =number;
               index++;
               length++;
            }
            count = 0;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}