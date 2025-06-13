package oopsConcepts;

public class Student {
String sname;
int sage;

public Student(String name,int age)
    {
      sname=name;
      sage=age;
    }

    public void display()
    {
        System.out.println(sname);
        System.out.println(sage);
    }

    public static void main(String[] args)
    {

       Student s = new Student("tester",60);
           s.display();
    }
}
