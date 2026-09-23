import java.util.Scanner;
public class recursion3{
    public static int first=-1;
    public static int last=-1;
    public static void printreverse(int i,String s,int n,String x){
        if(i==n){
            System.out.println("first occurence of "+x+" is at index:-"+first);
            System.out.println("last occurence of "+x+" is at index:-"+last);
            return;
        }
        char ch=s.charAt(i);
        if(ch==x.charAt(0)){
            if(first==-1){
                first=i;
            }
            else{
                last=i;
            }
        }
        
        printreverse(i+1,s,n,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string that you want to reverse for your your own choice :-");
        String s = sc.nextLine();
        System.out.println("enter the element whosse first and last occurence you want :-");
        String x=sc.next();
        int n=s.length();
        printreverse(0,s,n,x);
    }

}

    

