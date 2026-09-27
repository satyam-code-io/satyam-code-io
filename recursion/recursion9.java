// # no of ways to invite a people:-
package recursion;
public class recursion9 {
    public static int invite(int n){
        if(n<=1){
            return 1;
        }
        // for single type:-
        int single=invite(n-1);
        //  for couple:-
        int couple=(n-1)*invite(n-2);
        // now total ways:-
        return single+couple;
    }
    public static void main(String[]args){
        int n=4;
        System.out.println("total no of ways to invite:-");
        System.out.println(invite(n));
    }   
}
