import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first number: ");
        int number1 = input.nextInt();

        System.out.println("enter second number: ");
        int number2 = input.nextInt();

        System.out.println("enter a third number: ");
        int number3 = input.nextInt();

        if(number1 > number2 & number1 > number3){
            System.out.println(" largest number:  " + number1);
        } else if (number2 > number1 & number2 > number3) {
            System.out.println("largest number: " + number2);

        }else {
            System.out.println("largest number:  " + number3);
        }

    }

}
