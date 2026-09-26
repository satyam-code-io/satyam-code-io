package recursion;
// # For bubble sort:-
// import java.util.*;
// public class Sorting{
//     public static void printarray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+","+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of array:-");
//         int size=sc.nextInt();
//         int[] arr=new int[size];
//         System.out.println("now enter the element according to your given size:-");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         printarray(arr);
//     }
// }
            
//# For selecttion sort:-
// import java.util.*;
// public class Sorting{
//     public static void printarray(int arr[]){
//         for(int i=0;i<arr.length;i++){

//             System.out.print(arr[i]+","+" ");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of array:-");
//         int size=sc.nextInt();
//         int[] arr=new int[size];
//         System.out.println("now enter the element according to your given size:-");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<arr.length-1;i++){
//             int smallest=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest=j;
//                 }
//             }
//             int temp=arr[smallest];
//             arr[smallest]=arr[i];
//             arr[i]=temp;
//         }
//         printarray(arr);
//     }
// }

//# insertion sort:-
// import java.util.*;
// public class Sorting{
//     public static void printarray(int arr[]){
//         for(int i=0;i<arr.length;i++){

//             System.out.print(arr[i]+","+" ");
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of array:-");
//         int size=sc.nextInt();
//         int[] arr=new int[size];
//         System.out.println("now enter the element according to your given size:-");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=1;i<arr.length-1;i++){
//             int current=arr[i];
//             int j=i-1;
//             while(j>=0 && current<arr[j]){
//                 arr[j+1]=arr[j];
//                 j--;
//                 }
//             arr[j+1]=current;
//         }
//         printarray(arr);
//     }
// }


                    
                