import java.util.Scanner;

public class newwwwww {
    public static void main(String[] args) {

        int[] marks = new int[5]; 
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

                for (int i = 0; i < 5; i++) {

            System.out.println("Total Sum = " +(sum = sum + marks[i]));

        }

        
    }
}