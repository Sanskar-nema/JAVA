
import java.util.Scanner;
public class string1 {
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
System.out.println("Enter the name:");
String name=sc.nextLine();
int length = 0;
for(char c : name.toCharArray()){
    length++;
}
System.out.println("lenght of String are:" + length);


    }
    
}
