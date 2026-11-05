// // // concept of inheritance and composition:-

// // // 1.inheritance:-

// // class maths{
// //     int count(int a,int b){
// //         return a+b;
        
// //     }
// // }
// // class add extends maths{
// //     int count(int a,int b){
// //         int result=super.count(a, b);
// //         return result;
        
// //     }
// // }

// // public class oops8{
// //     public static void main(String[]args){
// //         add v1=new add();
// //         System.out.println(v1.count(2,3));
// //     }
    
// // }


// // concept of compositon:-
// // it means class "has a relation"("aapke paas kya hai that's important)

// class driver{
//     void start(){
//     }
// }

// class car extends driver{
//     void start(){
//         System.out.println("driver starts the car");
//     }
//     void driving(){
//          driver d1=new driver();
//          d1.start();
        
//     }
// }
// public class oops8{
//     public static void main(String[]args){
//         car d1=new car();
//         d1.start();

        

//     }
// }