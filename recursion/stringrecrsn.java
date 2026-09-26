package recursion;
import java.util.*;
public class stringrecrsn {
    public static void addrecrsn(int i,String s,String str,String a,char b){
        if(i==s.length()){
            System.out.println(str+" "+a);
            return;
        }
        if(s.charAt(i)==b){
            a+=b;     
        }else{
            str+=s.charAt(i);
        }
        addrecrsn(i+1, s, str,a,b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:-");
        String s=sc.nextLine();
        String str="";
        String a="";
        System.out.println("enter the character that you want to add at the last in the string :-");
        char b=sc.next().charAt(0);
        addrecrsn(0, s, str, a, b);
    }   
}
