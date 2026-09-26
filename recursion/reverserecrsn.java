//# revesing the whole paragraph:-
package recursion;
import java.util.Scanner;
public class reverserecrsn {
    public static void printreverse(int i, String s) {
        if (i<0) {
            return;
        }
        System.out.print(s.charAt(i));
        printreverse(i-1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string that you want to reverse for your your own choice :-");
        String s = sc.nextLine();
        printreverse(s.length()-1,s);
    }
}
