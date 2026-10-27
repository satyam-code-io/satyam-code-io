// # Uses of encapsulation in real life:-


//1.Bank account system

//  class Bankaccount{
//     private double balance;
//     public double getBalance(){
//         return balance;
//     }
//     public void deposit(double amount){
//         if(amount>0){
//             balance+=amount;
//         }else{
//             System.out.println("invalid amount to deposit");
//         }
//     }
//     public void withdraw(double amount){
//         if(amount>0&&amount<=balance){
//             balance-=amount;
//         }else{
//             System.out.println("invalid amount to withdraw");
//         }
//     } 
// }
// public class oops4{
//     public static void main(String[]args){
//         Bankaccount account=new Bankaccount();
//         account.deposit(1000000);
//         System.out.println("your current balance is"+account.getBalance());
//         account.withdraw(400000);
//         System.out.println("your current balance is");
//         System.out.println(account.getBalance());
//     }
// }


// 2.Student marks system:-
class Student{
    private int marks;

    public void setmarks(int marks){
        if (marks >= 0 && marks <= 100){
            this.marks = marks;
        } else {
            System.out.println("the given marks is invalid");            
        }
    }
    public int getmarks(){
        return marks;
    }
}
 class oops4{
    public static void main(String[]args){
        Student s1=new Student();
        s1.setmarks(90);
        System.out.println(s1.getmarks());
        s1.setmarks(140);
    }
}