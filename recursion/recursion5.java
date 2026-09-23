import java.util.*;
public class recursion5 {
    public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcombination(int i,String s,String newstr){
        if(i==s.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=s.charAt(i);
        String mapping=keypad[currchar-'0'];
        for(int j=0;j<mapping.length();j++){
            printcombination(i+1, s, newstr+mapping.charAt(j));
        }
    }
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
        System.out.println("enter the string no that you want subsquence of it:-");
        String s=sc.next();
        String str="";
        printcombination(0, s, str);               
    } 
}
