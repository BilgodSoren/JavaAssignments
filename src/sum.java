import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int sum = 0;
        for (int i = 1; i <= 10; i= i+1) { // calculate the sum up to the input number
            sum =  sum + i;

        }
        System.out.println("The sum of numbers from 1 to 10 " + " is: " + sum);
    }
}