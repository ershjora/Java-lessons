package lesson2;

public class Task3 {
    public static void main(String[] args) {
        int a = 1;
        int b = a++; //b=1, a=2
        b += a++; //step 1 b gives 0, a gives +1, now a=3. Step 2 b plussing with a when a is 2, 1+2=3,now b=3
        System.out.println(b + " " + a);

    }
}
