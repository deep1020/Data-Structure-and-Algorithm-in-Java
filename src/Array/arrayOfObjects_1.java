package Array;
// By using constructors

public class arrayOfObjects_1 {

	public static void main(String[] args) {
		Student[] arr;
        arr = new Student[2];
        arr[0] = new Student(10, "abc");
        arr[1] = new Student(20, "xyz");
        System.out.println("Student data in student arr 0: ");
        arr[0].display();
        System.out.println("Student data in student arr 1: ");
        arr[1].display();
	}
}
class Student {
	 
    public int id;
    public String name;
    // Student class constructor
    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public void display()
    {
        System.out.println("Student id is: " + id + " "
                           + "and Student name is: "+ name);
        System.out.println();
    }
}