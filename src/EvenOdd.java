import java.util.Scanner;

public class EvenOdd {

    public static void findEvenOdd(int num) {

        if (num % 2 == 0)
            System.out.println(num + "is Even");
        else
            System.out.println(num + "is Odd");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");

        int num = sc.nextInt();
        findEvenOdd(num);

    }
}
