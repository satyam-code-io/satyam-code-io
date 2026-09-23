//# problem no 1:-
// add two no:-

// import java.util.*;
// public class revisions{
//     public static int add(int num1,int num2){
//         int sum=num1+num2;
//         return(sum);
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         System.out.println(add(num1, num2));
//     }
// }


//problem no 2:-
//find pattern of *:-

// import java.util.*;

// public class pattern {
//     public static void revizions= (String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter how many * you want to print");
//         int n=sc.nextInt();
        
//         for(int i=1;i<n+1;i++){
//             for(int j=0;j<=(n-i);j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//# problem no 3:-
// import java.util.*;
// public class revisions{
//     public static void printfactorial(int n){
//         int factorial=1;
//         for(int i=n;i>=1;i--){
//             factorial=factorial*i;
//         }
//           System.out.println(factorial);
//     }
//     public static void main(String[]args){
//          Scanner sc=new Scanner(System.in);
//          int n= sc.nextInt();
//          printfactorial( n);
//     }
// }
          
//# problem statement no 4:-
// import java.util.*;
// public class {
//     public static void check(int a){
//         if(a<=0){
//             System.out.println("invalid");
//         }
//         if (a%2==0){
//             System.out.println("ye you got a even no");
//         }
        
//         else{
//             System.out.println("you got a odd no");
//         }
//     }
        
        
        
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the no you want to check");
//         int a =sc.nextInt();
//         check(a);
//     }
// }
    

//# problem statement no 5:-

// import java.util.Scanner;

// public class revisions{
//     public static int summation(int n){
//         int sum=0;
//         if (n<=0){
//             System.out.println("invalid");
//         }
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 sum=sum+i;
//             }
//         }
//             return(sum);
//         }        
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the no max to find the sum of odd no");
//         int n=sc.nextInt();
//         int summ=summation(n);
//         System.out.println(summ);
//     }
// }
    
                   
 //# problem no 6 :-
 
//  import java.util.*;
//  public class revisions{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size you want");
//         int size=sc.nextInt();
//         int[]number=new int[size];
//         for(int i=0;i<size;i++){
            
//             number[i]=sc.nextInt();
//         }
//         System.out.println("enter the value you want to find at index");
//         int x=sc.nextInt();
//         for(int i=0;i<number.length;i++){
//             if(number[i]==x){
//                 System.out.println(x +" " +"found at index"+" " + i);
//             }
//         }
//     }
//  }
          
// # problem no 7:-
//# find the max/min value:-
// import java.util.*;
// public class pattern{
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the size of your array :-");
//         int size=sc.nextInt();
//         System.out.println("now put element of your required size :-");
//         int [] number= new int[size];
//         for(int i=0;i<size;i++){
//             number[i]=sc.nextInt();
//         }
//         int max=number[0];
//         int min=number[0];
//         for(int i=1;i<number.length;i++){
//             if(number[i]>max){
//                 max=number[i];
                
//             }else if (number[i]<min){
//                 min=number[i];
//             }
//         }
//         System.out.println("the max element in your array is"+" "+max);
//         System.out.println("the min element in your array is"+" "+min);

//     }
// }  

// # problem no 8 :-

// import java.util.*;
//   public class revisions{
// public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//          System.out.println("enter the rows you want");
//          int row=sc.nextInt();
//           System.out.println("enter the column you want");
//           int column=sc.nextInt();
//         int[][]number=new int[row][column];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//                 number[i][j]=sc.nextInt();
                
//             }
//         }
//     }
// }

// # problem no 9 :-
// import java.util.*;
// public class revisions{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the values of rows :-");
//         int rows=sc.nextInt();
//         System.out.println("enter the value of column :-");
//         int column=sc.nextInt();
//         int [][]number=new int[rows][column];
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<column;j++){
//                 number[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("enter the value you want to find at any index :-");
//         int x=sc.nextInt();
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<column;j++){
//                 if(number[i][j]==x){
//                     System.out.println(x+" "+"found at rows no"+" " +i+" "+"and column no"+" "+j);
//                 }
//             }
//         }
        
//     }
// }            
    
//# problem no 10:-
// import java.util.*;
// public class revisions{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the values of rows :-");
//         int rows=sc.nextInt();
//         System.out.println("enter the value of column :-");
//         int column=sc.nextInt();
//         int [][]number=new int[rows][column];
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<column;j++){
//                 number[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("transpose of matrix is");
//         for(int i=0;i<column;i++){
//             for(int j=0;j<rows;j++){
//                 System.out.print(number[j][i]+" ");
//             }
//             System.out.println();

//         }
        
//     }
// }
        
// # problem no 11:-
// import java.util.*;
// public class revisions{
//     public static void main(String[] args){

//         Scanner sc=new Scanner(System.in);

//         String str="";

//         String name=sc.nextLine();

//         for(int i=0;i<name.length();i++){
            
//             if(name.charAt(i)=='i'){
//             continue;
//         }
//         else{
//             str=str+name.charAt(i);
//         }
        
//     }
//     System.err.println(str);
// }

//     }

 // # problem no 12:-
// import java.util.*;
// public class pattern{
//     public static void main(String[] args){

//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         int n=name.length();
//         String str="";
//         System.out.println(n);
//         for(int i=n-1;i>=0;i--){
//             str=str+name.charAt(i);
//         }
//         System.out.print(str);
//     }
// }
            
// # problem no 13:-    
// import java.util.*;
// public class pattern{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         int size=name.length();
//         int counts=0;
//         int count=0;
//         int counta=0;
//         int counti=0;
//         for(int i=0;i<size;i++){
//             if(name.charAt(i)=='s'){
//                 counts++;
//             }else if (name.charAt(i)=='t'){

//                 count++;
//         }else{
//             if(name.charAt(i)=='a'){
//             counta++;
//         }else{
//             if(name.charAt(i)=='i');
//             counti++;
//         }
//     }
// }
// System.out.println("total no of s in the given string is :-"+" "+counts);
// System.out.println("total no of t in the given string is :-"+" "+count);
// System.out.println("total no of a in the given string is :-"+" "+counta);
// System.out.println("total no of i in the given string is :-"+" "+counti);
//     }
// }

// #problem no 14:-
// import java.util.*;
// public class revisions {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int size=sc.nextInt();
//         String array[]=new String[size];
//         int totallen=0;
//         for(int i=0;i<size;i++){
//             array[i]=sc.next();
//             totallen+=array[i].length();
//         }
//         System.out.println("total legth of the given array is"+" "+totallen);
       
//     }
    
// }    


    






            
        
    
    


        


          

        
        
        
    

//# problem no 1:-
// add two no:-

// import java.util.*;
// public class revisions{
//     public static int add(int num1,int num2){
//         int sum=num1+num2;
//         return(sum);
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         System.out.println(add(num1, num2));
//     }
// }


//problem no 2:-
//find pattern of *:-

// import java.util.*;

// public class pattern {
//     public static void revizions= (String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter how many * you want to print");
//         int n=sc.nextInt();
        
//         for(int i=1;i<n+1;i++){
//             for(int j=0;j<=(n-i);j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//# problem no 3:-
// import java.util.*;
// public class revisions{
//     public static void printfactorial(int n){
//         int factorial=1;
//         for(int i=n;i>=1;i--){
//             factorial=factorial*i;
//         }
//           System.out.println(factorial);
//     }
//     public static void main(String[]args){
//          Scanner sc=new Scanner(System.in);
//          int n= sc.nextInt();
//          printfactorial( n);
//     }
// }
          
//# problem statement no 4:-
// import java.util.*;
// public class {
//     public static void check(int a){
//         if(a<=0){
//             System.out.println("invalid");
//         }
//         if (a%2==0){
//             System.out.println("ye you got a even no");
//         }
        
//         else{
//             System.out.println("you got a odd no");
//         }
//     }
        
        
        
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the no you want to check");
//         int a =sc.nextInt();
//         check(a);
//     }
// }
    

//# problem statement no 5:-

// import java.util.Scanner;

// public class revisions{
//     public static int summation(int n){
//         int sum=0;
//         if (n<=0){
//             System.out.println("invalid");
//         }
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 sum=sum+i;
//             }
//         }
//             return(sum);
//         }        
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the no max to find the sum of odd no");
//         int n=sc.nextInt();
//         int summ=summation(n);
//         System.out.println(summ);
//     }
// }
    
                   
 //# problem no 6 :-
 
//  import java.util.*;
//  public class revisions{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size you want");
//         int size=sc.nextInt();
//         int[]number=new int[size];
//         for(int i=0;i<size;i++){
            
//             number[i]=sc.nextInt();
//         }
//         System.out.println("enter the value you want to find at index");
//         int x=sc.nextInt();
//         for(int i=0;i<number.length;i++){
//             if(number[i]==x){
//                 System.out.println(x +" " +"found at index"+" " + i);
//             }
//         }
//     }
//  }
          
// # problem no 7:-
//# find the max/min value:-
// import java.util.*;
// public class pattern{
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter the size of your array :-");
//         int size=sc.nextInt();
//         System.out.println("now put element of your required size :-");
//         int [] number= new int[size];
//         for(int i=0;i<size;i++){
//             number[i]=sc.nextInt();
//         }
//         int max=number[0];
//         int min=number[0];
//         for(int i=1;i<number.length;i++){
//             if(number[i]>max){
//                 max=number[i];
                
//             }else if (number[i]<min){
//                 min=number[i];
//             }
//         }
//         System.out.println("the max element in your array is"+" "+max);
//         System.out.println("the min element in your array is"+" "+min);

//     }
// }  

// # problem no 8 :-

// import java.util.*;
//   public class revisions{
// public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//          System.out.println("enter the rows you want");
//          int row=sc.nextInt();
//           System.out.println("enter the column you want");
//           int column=sc.nextInt();
//         int[][]number=new int[row][column];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//                 number[i][j]=sc.nextInt();
                
//             }
//         }
//     }
// }

// # problem no 9 :-
// import java.util.*;
// public class revisions{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the values of rows :-");
//         int rows=sc.nextInt();
//         System.out.println("enter the value of column :-");
//         int column=sc.nextInt();
//         int [][]number=new int[rows][column];
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<column;j++){
//                 number[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("enter the value you want to find at any index :-");
//         int x=sc.nextInt();
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<column;j++){
//                 if(number[i][j]==x){
//                     System.out.println(x+" "+"found at rows no"+" " +i+" "+"and column no"+" "+j);
//                 }
//             }
//         }
        
//     }
// }            
    
//# problem no 10:-
// import java.util.*;
// public class revisions{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the values of rows :-");
//         int rows=sc.nextInt();
//         System.out.println("enter the value of column :-");
//         int column=sc.nextInt();
//         int [][]number=new int[rows][column];
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<column;j++){
//                 number[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("transpose of matrix is");
//         for(int i=0;i<column;i++){
//             for(int j=0;j<rows;j++){
//                 System.out.print(number[j][i]+" ");
//             }
//             System.out.println();

//         }
        
//     }
// }
        
// # problem no 11:-
// import java.util.*;
// public class revisions{
//     public static void main(String[] args){

//         Scanner sc=new Scanner(System.in);

//         String str="";

//         String name=sc.nextLine();

//         for(int i=0;i<name.length();i++){
            
//             if(name.charAt(i)=='i'){
//             continue;
//         }
//         else{
//             str=str+name.charAt(i);
//         }
        
//     }
//     System.err.println(str);
// }

//     }

 // # problem no 12:-
// import java.util.*;
// public class pattern{
//     public static void main(String[] args){

//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         int n=name.length();
//         String str="";
//         System.out.println(n);
//         for(int i=n-1;i>=0;i--){
//             str=str+name.charAt(i);
//         }
//         System.out.print(str);
//     }
// }
            
// # problem no 13:-    
// import java.util.*;
// public class pattern{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         int size=name.length();
//         int counts=0;
//         int count=0;
//         int counta=0;
//         int counti=0;
//         for(int i=0;i<size;i++){
//             if(name.charAt(i)=='s'){
//                 counts++;
//             }else if (name.charAt(i)=='t'){

//                 count++;
//         }else{
//             if(name.charAt(i)=='a'){
//             counta++;
//         }else{
//             if(name.charAt(i)=='i');
//             counti++;
//         }
//     }
// }
// System.out.println("total no of s in the given string is :-"+" "+counts);
// System.out.println("total no of t in the given string is :-"+" "+count);
// System.out.println("total no of a in the given string is :-"+" "+counta);
// System.out.println("total no of i in the given string is :-"+" "+counti);
//     }
// }

// #problem no 14:-
// import java.util.*;
// public class revisions {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int size=sc.nextInt();
//         String array[]=new String[size];
//         int totallen=0;
//         for(int i=0;i<size;i++){
//             array[i]=sc.next();
//             totallen+=array[i].length();
//         }
//         System.out.println("total legth of the given array is"+" "+totallen);
       
//     }
    
// }    


    






            
        
    
    


        


          

        
        
        
    

  