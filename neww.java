//leave approval system, if less then or equal to 2 days than automatically approved, if 3-5 days then manager will approve, 
// if more than 5 days then hr will approve take no. of leaves and decide approval authorithy
import java.util.Scanner;
public class neww {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of leave days:");
        int leaveDays = sc.nextInt();
        if (leaveDays <= 2) {
            System.out.println("Leave automatically approved.");
        } else if (leaveDays >= 3 && leaveDays <= 5) {
            System.out.println("Leave needs manager approval.");
        } else if (leaveDays > 5) {
            System.out.println("Leave needs HR approval.");
        }
        sc.close();
    }
}
