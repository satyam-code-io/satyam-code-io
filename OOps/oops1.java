
// // public class oops1 {
// //     public static void main(String[] args) {
// //         student s1 = new student("Rohit", 101);
// //         s1.display();
// //     }
// // }
// //     class student {
// //         String name;
// //         int rollno;
// //     void display() {
// //         System.out.println("Name: " + name);
// //         System.out.println("Roll No: " + rollno);
// //     }

// //     student(String name, int rollno) {
// //         this.name = name;
// //         this.rollno = rollno;
// //         System.out.println("Constructor is called");
// //     }
// // }

// //# use of this-:
// // 1.(call current objects method)

// // public class oops1{
// //     public static void main(String[] args) {
// //         student s1=new student("satyam",20);
// //         s1.display();
// //         s1.run();
// //     }
// // }
// // class student{
// //     String name;
// //     int age;
// //     void run(){
// //         System.out.println("running");
// //         System.out.println("name"+" "+"="+name);
// //         System.out.println("age"+" "+"="+age);
// //     }
// //     void display(){
// //         this.run();
// //     }
// //     student(String name,int age){
// //         this.name=name;
// //         this.age=age;
// //     }
// // }

// //2.pass the current object:-

// public class oops1{
//     public static void main(String[]args){
//         Student sw=new Student  ();
//         sw.plays(sw);

//     }
// }
// class Student{
//     void plays(Student student){
//         System.out.println(student+" "+"learn");
//     }
//     void working(){
//         System.out.println(this);
       
//     }
//     Student getstudent(){
//         return this;
//     }
// }