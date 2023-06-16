package String;
// Java StringBuffer class is used to create mutable (modifiable) String objects.
// The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
public class methods_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("Hello ");
        sb1.append("Java");
        System.out.println(sb1);

        StringBuffer sb2=new StringBuffer("Hello ");
        sb2.insert(1,"Java");
        System.out.println(sb2);

        StringBuffer sb3=new StringBuffer("Hello");
        sb3.replace(1,3,"Java");
        System.out.println(sb3);

        StringBuffer sb4=new StringBuffer("Hello");
        sb4.delete(1,3);
        System.out.println(sb4);

        StringBuffer sb5=new StringBuffer("Hello");
        sb5.reverse();
        System.out.println(sb5);
    }
}
