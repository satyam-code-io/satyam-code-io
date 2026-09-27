// # Print all the permutation of a string:-
package recursion;
import java.util.*;
public class recursion6{
    public static void calcperm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String new_str=str.substring(0,i) + str.substring(i+1);
            calcperm(new_str,permutation+curr);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string that you want the permutation:-");
        String str=sc.next();
        System.out.println("the permutation of the given string is:-");
        calcperm(str, " ");
    }   
}
