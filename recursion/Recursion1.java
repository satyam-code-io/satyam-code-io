// # using recursion find the sum of n natural no upto n:- 
package recursion;
import java.util.*;
public class Recursion1 {
    public static void printNumb(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);    //#Base Case
            return;
        }
        sum=sum+i;
        printNumb(i+1,n,sum);
        }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n upto you have to find the sum:-");
        int n=sc.nextInt();
        printNumb(1,n,0 );


    }

}
