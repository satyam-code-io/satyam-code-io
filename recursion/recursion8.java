//# Place tiles of size 1*m in a floor of size n*m:-
package recursion;
public class recursion8{
    public static int tiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // for vertical:-
        int vertical=tiles(n-m, m);
        // for horizontal:-
        int horizontal=tiles(n-1, m);
        // total tiles:-
        return vertical+horizontal;
    }
    public static void main(String[]args){
        int n=4,m=2;
        System.out.println("the total no of tile used is:-");
        System.out.println(tiles(n, m));
    }    
}
