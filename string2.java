import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your string:");
String s1=sc.nextLine();
System.out.println("Enter your second string:");
String s2= sc.nextLine();
    




      

        if (s1.length() != s2.length()) {
            System.out.println("strings are not equal");
        } else {
            boolean isEqual = true;

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                System.out.println("strings are equal");
            } else {
                System.out.println("strings are not equal");
            }
        }

        sc.close();
    }

    }
    

