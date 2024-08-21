package demo_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DanhSachSinhVien {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(1,"Cuong","Java"));
        list.add(new Student(2,"An",".Net"));
        list.add(new Student(3,"Binh","Java"));
        list.add(new Student(4,"Huyen",".Net"));
        list.add(new Student(5,"Tien","Java"));
        list.add(new Student(6,"Duc","Java"));
        list.add(new Student(7,"Dung",".Net"));

        for(Student s: list){
            System.out.println(s);
        }

        //Sap xep tang dan theo ten
        list.sort(Comparator.comparing(Student::getName)); //Sap xep tang dan
//        list.sort(Comparator.comparing(Student::getName).reversed()); //Sap xep giam dan
        System.out.println("\nDanh sách sắp xếp tăng dần theo tên: ");
        for(Student s: list){
            System.out.println(s);
        }

//        list.sort((s1, s2)-> s2.getName().compareTo(s1.getName()));  //Sap xep giam dan theo lambda
//        list.stream().sorted().forEach(e-> System.out.println(e));   //Sap xep va hien thi luon

    }
}
