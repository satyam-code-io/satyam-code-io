// concept of nested class in oops:-

class student{
    class college{
        void name(){
            System.out.println("satyam,gurugram university");
        }
    }
}
public class oops10 {
    public static void main(String[]args){
        student st = new student();
        student.college s1 = st.new college();
            s1.name();
        
    }
}
