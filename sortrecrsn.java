// first method to check:-
// import java.util.*;
// public class sortrecrsn{
//     public static void checksort(int[] arr,int count,int i,int size){
//         if(i>=size-1){
//             if(count==0){
//                 System.out.println("sorted");
//             }
//             else{
//                 System.out.println("not sorted");
//             }
//             return;
//         }
//         if(arr[i]<arr[i+1]){
//             count++;
//         }
//         checksort(arr, count, i+1, size);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int[]arr=new int[size];
//         for(int j=0;j<arr.length;j++){
//             arr[j]=sc.nextInt();
//         }
//         checksort(arr,0,0,size);
//     }
// }

// # another method to solve to check sorting in recursion:-
 import java.util.*;
public class sortrecrsn{
    public static boolean checksort(int[] arr,int i,int size){
        if(i>=size-1){
            System.out.println("sorted");
            return true;
        }
        if(arr[i]<=arr[i+1]){
            System.out.println("not sorted");
            return false;
        }
        return checksort(arr, i+1, size);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int j=0;j<arr.length;j++){
            arr[j]=sc.nextInt();
        }
        checksort(arr,0,size);
    }
}   
