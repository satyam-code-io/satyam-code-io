import java.util.Scanner;
public class recursion3{
    public static void printreverse(int i,String s,int n,String x) {
        if (i ==n-1){
            return;
        }
        if(s.charAt(i)=='x'){
            System.out.println("the first occurence of the given  element at :-"+" "+i);
        }
      
        printreverse(i+1,s,n,x);;
        if(s.charAt(i)=='x'){
            System.out.println("the last occurence of the given  element at :-"+" "+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string that you want to reverse for your your own choice :-");
        String s = sc.nextLine();
        System.out.println("enter the element whosse first and last occurence you want :-");
        String x=sc.next();
        int n=s.length();
        printreverse(0,s,n,"x");
    }

}

    

