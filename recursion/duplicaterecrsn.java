// # method to remove duplicate character from the string and print the reverse of it:-
package recursion;
import java.util.*;
public class duplicaterecrsn {
    public static void dplicatefind(int i,String s,String b,boolean [] map){
        if(i==0){
            System.out.print(b); 
            return;
        }
        char ch=s.charAt(i);
        if(map[ch-'a']==false){
            b+=ch;
            map[ch-'a']=true;       
        }
        dplicatefind(i-1,s,b,map);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string that you want to improve :-");
        String s=sc.next();
        boolean [] map=new boolean[26];
        dplicatefind(s.length()-1, s, "", map);
    }
}

    
    
// # another method for removing duplicate:-
// import java.util.*;
// public class duplicaterecrsn {
//     public static void removeduplicate(int i,String s,String b){
//         if(i==0){
//             System.out.println(b); 
//             return;
//         }
//         char ch=s.charAt(i);
//         if(b.indexOf(ch)==-1){
//             b+=ch;       
//         }
//         removeduplicate(i-1,s,b);
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the string that you want to improve :-");
//         String s=sc.next();
//         removeduplicate(s.length()-1, s, "");
//     }
// }
