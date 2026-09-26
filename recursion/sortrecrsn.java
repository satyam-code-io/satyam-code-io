package recursion;
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
//  import java.util.*;
// public class sortrecrsn{
//     public static boolean checksort(int[] arr,int i,int size){
//         if(i>=size-1){
//             System.out.println("sorted");
//             return true;
//         }
//         if(arr[i]<=arr[i+1]){
//             System.out.println("not sorted");
//             return false;
//         }
//         return checksort(arr, i+1, size);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int[]arr=new int[size];
//         for(int j=0;j<arr.length;j++){
//             arr[j]=sc.nextInt();
//         }
//         checksort(arr,0,size);
//     }
// }   


//# without asking from user:-
// public class sortrecrsn{
//     public static void checksort(int count,int i,int[]array){
//         if(i==array.length-1){
//             if (count==0) {
//                 System.out.println("your required array is in ascending order and sorted");    
//             } else{
//                 System.out.println("your required array is not in sorted");
//             }
//             return;
//         }
//         int curr=array[i];
//         if(curr>array[i+1]){
//             count+=1;
//         }     
//         checksort(count ,i+1, array);
//     }
//     public static void main(String[] args) {
//         int[]array={1,3,4,5,0};
//         checksort(0, 0, array);
//     }
// }