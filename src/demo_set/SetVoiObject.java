package demo_set;

import demo_list.Student;

import java.util.HashSet;
import java.util.Set;

public class SetVoiObject {
    public static void main(String[] args) {
        Set<Student> list = new HashSet<>();

        list.add(new Student(1,"Cuong","Java"));
        list.add(new Student(2,"Cuong","Java"));

        for(Student s: list){
            System.out.println(s);
        }
    }
}
