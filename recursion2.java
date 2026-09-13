import java.util.Scanner;

public class recursion2{
    public static void towerofhanoi(int n,String src,String helper,String destination){
        if(n==1){
            System.out.println("desired no of stack"+" "+n+" "+"is tranfereed from source"+" "+src+" "+"to destination"+" "+destination);
            return;
        }
        towerofhanoi(n-1,src,destination,helper);
        System.out.println("desired no of stack"+" "+n+" "+"is tranfereed from source"+" "+src+" "+"to destination"+" "+" "+destination);
        towerofhanoi(n-1, helper, src, destination);      
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no stack you want to use :-");
        int n=sc.nextInt();
        towerofhanoi(n, "S", "H", "D");
    }   
}
