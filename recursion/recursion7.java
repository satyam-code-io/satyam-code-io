// # Count total paths in a maze to move from (0,0) to(n,m) such that:-
// (i) you can go downwards and rightside only
package recursion;
public class recursion7 {
    public static int gridcalc(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 &&j==m-1){
            return 1;
        }
        // for downwards:-

        int downwards=gridcalc(i+1, j, n, m);

        // for right:-

        int right=gridcalc(i, j+1, n, m);

        // now total no of paths
        
        return downwards+right;
    }
    public static void main(String[]args){
        int n=3,m=3;
        System.out.println("the total no of ways to go there is:-");
        System.out.println(gridcalc(0, 0, n, m));
    }
    
}
