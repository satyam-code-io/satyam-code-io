import java.util.*;
public class factorialrecursion {
    public static int calcfactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact=calcfactorial(n-1);
        int factorial=n*fact;
        return factorial;
        
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find the factorial:-");
        int n=sc.nextInt();
        System.out.println("the factorial of "+n+" is:-");
        System.out.println(calcfactorial(n));
    }
    
}
