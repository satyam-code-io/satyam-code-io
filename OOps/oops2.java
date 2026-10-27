// // // // // # Acess modifier in java:-
// // // // // 1. private:-
// // // // public class oops2{ // private access modifier is used to restrict the access of a class, method, or variable to only within the class in which it is defined. It cannot be accessed from outside the class.(ye hamare class ke bahar access nhi kar sakte)
// // // //     private String password="2006@satyam";
// // // //         void security(){
// // // //             System.out.println("your required password"+" "+password);
// // // //         }
// // // //     }
// // // //     class checksecurity{// default access modifier is used to restrict the access of a class, method, or variable to only within the same package in which it is defined. It cannot be accessed from outside the package.(ye hamare package ke bahar access nhi kar sakte)
// // // //         public static void main(String[]args){
// // // //             oops2 user=new oops2();
// // // //             user.security();
// // // //         }
// // // //     }

// // // 2.public:- public access modifier is used to allow access to a class, method, or variable from any other class or package. It can be accessed from anywhere in the program.(ye hamare class ke bahar bhi access kar sakte,also in java by default class is public class hota hai,agar humne access modifier nhi diya to by default public class hota hai)

// // // 3.protected:- protected access modifier is used to allow access to a class, method, or variable from within the same package and also from subclasses (child classes) in other packages. It cannot be accessed from outside the package unless it is through inheritance.(ye hamare package ke bahar access kar sakte but only through inheritance)
// // example:-

// package oops;
// public class oops2{
//     protected String name="satyam";  
//     }

