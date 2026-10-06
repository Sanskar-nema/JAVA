
import java.util.Scanner;
public class string {
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
String S1= "Sanskar";//not pointing anything and  than stored in heap and store in scp
//if new string is there than both memory allocated and save in heap and scp
//also if anything is not pointing anything than memory is allocated in heap only and  not in scp. // like in line(11 and 12)
String S2= new String("Nema");
String S3= new String(S2);
S1.concat(S3);
S2.concat(S1);


S3=S1.concat(S2);

System.out.println(S3);

    }
    
}
