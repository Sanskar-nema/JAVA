import java.util.Scanner;

public class java  {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n = sc.nextInt();
int[] arr= new int[n];
for(int i=0;i<n;i++){
    System.out.println("Enter the number");
     arr[i]=sc.nextInt();

}
System.out.println("Array element is:");
for( int i=0;i<5;i++){
    System.out.println(arr[i]+" ");
}
    }
    
}
