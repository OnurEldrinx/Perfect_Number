import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number,divider=1,sum=0;

        System.out.print("Enter a number:");
        number = scanner.nextInt();

        while (divider < number){

            if (number % divider == 0){

                sum = sum + divider;

            }

            divider++;


        }

        if (number == sum){

            System.out.println(number + " is a perfect number!");

        }else{

            System.out.println(number + " is not a perfect number!");

        }









    }
}
