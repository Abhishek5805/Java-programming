package bit.OOPS;

public class constructor {
    public static void main(String[] args) {
        Student s1=new Student("abhishek");
        System.out.println(s1.name);
        
    }
    }
    class Student{
        String name;
        int rno;

        Student(String name){
            this.name=name;
        }

    }

