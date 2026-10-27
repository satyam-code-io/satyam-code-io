// // // Topic of inheritance:-
// // // # example:-
// //  class Animal {
// //     public void eat(){
// //         System.out.println("animals are eating");
// //     }
    
// // }
// //  class Dog extends Animal{
// //     public void sound(){
// //         System.out.println("barking");
// //     }
// // }
// // public class oops5{
// //     public static void main(String[] args) {
// //         Dog dog=new Dog();
// //         dog.eat();
// //         dog.sound();
        
// //     }
// // }




// // # use of super in inheritance:-
// // super:-for imeediate change in method of parent class by child/sub class

//   class Animal {
//     public void eat(){
//         System.out.println("animals are eating");
//     }
//      void sounding(){
//         System.out.println("animals are sounding");
//     }
    
// }
//  class Dog extends Animal{
//      void sounding(){
//         super.sounding();
//         System.out.println("animals are quiet");
//     }
// }
// public class oops5{
//     public static void main(String[] args) {
//         Dog dog=new Dog();
//         dog.eat();
//         dog.sounding();
        
//     }
// }



// inheritance for constructor by super:-
// class Animal{
//     void sound(){
//         System.out.println("goods animal");
//     }
//     Animal(String name){
//         System.out.println(name);
//     }
// }
// class Dog extends Animal{
//     Dog(){
//         super("tommy");
//     }
// }
// public class oops5{
//     public static void main(String[]args){
//         Dog dog=new Dog();
//     }
// }






// concept of method overriding:-
// class Animal{
//     void sound(){
//         System.out.println("animals sound");
//     }
// }
// class Dog extends Animal{
//     @Override 
//     void sound(){
//         System.out.println("dogs barks");
//     }
// }
// public class oops5{
//     public static void main(String[] args) {
//         Animal animal=new Dog();
//         animal.sound();
//     }
// }