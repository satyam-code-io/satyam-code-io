// // 1.Get bit of a no:-

//  import java.util.*;
//  public class Bitmanipulation{
//      public static void main(String[]args){
//          Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//          int pos=sc.nextInt();
//         int a=sc.nextInt();
//         int bitmask=a<<pos;
//         if((bitmask & n)==0){
//             System.out.println("bit was zero");

//         }else{
//             System.out.println("bit was one");
            
//         }

//     }
// }

//2. Set bit of a no:-
//        int newno=(bitmask | n);
//        System.out.println(newno);
// }
//  }

//3. Clear bit of a no:-
//           int notbitmask=~bitmask;
//           int no=notbitmask & n;
//           System.out.println(no);
// }
//  }

//4. Update bit of a no:-
// import java.util.*;
//  public class Bitmanipulation{
//      public static void main(String[]args){

//         Scanner sc=new Scanner(System.in);

//         System.out.println("enter the binary no you have to update:");

//         int number=sc.nextInt();

//         System.out.println("enter the no in used to conversion:");

//         int n=sc.nextInt();
//         System.out.println("enter the position you want to shift:");
//         int pos=sc.nextInt();
//         System.out.println("enter the no you want for left or right shift via position:");
//         int a=sc.nextInt();
//         int bitmask=a<<pos;

//         if (number==0) {
//             int notbit=~bitmask;
//             int numbers= notbit&n;
//             System.out.println("your updated no is:"+" "+numbers);
            
//         }else if (number<0||number>1) {
//             System.out.println("invalid type"+" "+number +" " + "is not a binary no ");
            
        
//         }else {
//             int numb=bitmask|n;
//             System.out.println(numb);
//         }
//     }
// }
            
        
            