import java.util.Scanner;
public class fibonaccirecursion {
    public static void calcfibonacci(int i,int a,int b,int n){
        int c=0;
        if(i==n){
           c=a+b;
            a=b;
            b=c;
            return;
        }
        c=a+b;
        System.out.print(c+","+" ");
        b=a;
        a=c;
        calcfibonacci(i+1, a, b, n);
    }
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of term you want:-");
        int n=sc.nextInt();
        System.out.print("0"+","+" ");
        calcfibonacci(1, 0, 1, n);
    }
    
}
