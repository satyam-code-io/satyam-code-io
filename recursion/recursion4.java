// import java.util.*;
// public class recursion4 {
//     public static void subsequence(int i, String s, String str){
//         if(i==s.length()){
//             System.out.println(str);
//             return;
//         }
//         char currchar=s.charAt(i);
//         subsequence(i+1, s, str+currchar);
//         subsequence(i+1, s, str);
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the string that you want subsquence of it::-");
//         String s=sc.next();
//         String str="";
//         subsequence(0, s, str);
//     }   
// }

// # if unique solution want:-
// import java.util.HashSet;
// import java.util.*;
// public class recursion4 {
//     public static void subsequence(int i, String s, String str,HashSet<String> set){
//         if(i==s.length()){
//             if(set.contains(str)){
//                 return;
//             }else{
//                 System.out.println(str);
//                 set.add(str);
//                 return;
//             }
//         }
        
//         char currchar=s.charAt(i);
//         subsequence(i+1, s, str+currchar,set);
//         subsequence(i+1, s, str,set);
//         }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the repeated string that you want subsquence of it:-");
//         String s=sc.next();
//         HashSet<String> set= new HashSet<>();
//         String str="";
//         subsequence(0, s, str,set);
//     }   
// }
