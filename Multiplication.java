import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i <= 10; i++) {
           int ans = number * i;
            System.out.println(ans);
        }
    }
}
