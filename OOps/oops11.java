// concept of object class  in oops:-

// 1.concept of to string:-

// class programme{
//     String name;
//     String names;
//     @Override
//     public String toString() {
//         return "programme [name=" + name + ", names=" + names + "]";
//     }
// }
// public class oops11 {
//     public static void main(String[]args){
//         programme obj1=new programme();
//         obj1.name="satyam";
//         obj1.names="Satyam";
//         System.out.println(obj1);
//     }
    
// }

//2.concept of equals and hashcode:-

class programme{
    String name;
    String names;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((names == null) ? 0 : names.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        programme other = (programme) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (names == null) {
            if (other.names != null)
                return false;
        } else if (!names.equals(other.names))
            return false;
        return true;
    }
    
}
public class oops11 {
    public static void main(String[]args){
        programme obj1=new programme();
        programme obj2=new programme();
        obj1.name="satyam";
        obj2.name="satyam";
        boolean result=obj1.equals(obj2);
        System.out.println(result);
    }
    
}
