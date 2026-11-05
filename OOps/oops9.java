// // Concept of Static:-
// it says a member belongs to class so it belongs to class rather than belonging to a object and be access through class only.

// see example:-
class college{
    static String collegename="gurugram university";
    String name;
}
class add{
    static int addition(int a,int b){
        return a+b;
    }
}
public class oops9 {
    public static void main(String[]args){
        System.out.println(college.collegename);
        int result=add.addition(30, 400);
        System.out.println(result);
    }
    
}
