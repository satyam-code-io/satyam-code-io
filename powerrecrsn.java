// import java.util.Scanner;
// public class powerrecrsn {
//     public static int findpow(int n,int x){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         int pownm1=findpow(n-1, x);
//         int result=pownm1*x;

//         return result;
//     }
    
        
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the no on which power you want you want:-");
//         int x=sc.nextInt();
//         System.out.println("enter how many power you want :-");
//         int n=sc.nextInt();
//         int ans=findpow(n,x);
//         System.out.println(ans);
//     }
// }

// # if stack height in terms of log(n) then how to do:-
import java.util.Scanner;
public class powerrecrsn {
    public static int findpow(int n,int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return findpow(n/2,x)*findpow(n/2,x);
        }
        else{
            return findpow(n/2,x)*findpow(n/2,x)*x;
        } 
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no on which power you want you want:-");
        int x=sc.nextInt();
        System.out.println("enter how many power you want :-");
        int n=sc.nextInt();
        int ans=findpow(n,x);
        System.out.println(ans);
    }
}