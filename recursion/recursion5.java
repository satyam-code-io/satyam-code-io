// # advance version of sequence printing of a string all the unique sequence of keyboard combination:-
package recursion;
import java.util.*;
public class recursion5 {
    public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcombination(int i,String s,String newstr){
        if(i==s.length()){
            System.out.println(newstr);  //{keep this one also it is base case}
            return;
        }
        String mapping=keypad[s.charAt(i)-'0'];
        for(int j=0;j<mapping.length();j++){                  //* this is the most important rule we used here keep in mind.
            printcombination(i+1, s, newstr+mapping.charAt(j));
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string no that you want subsquence of it:-");
        String s=sc.next();
        printcombination(0, s, "");               
    } 
}
