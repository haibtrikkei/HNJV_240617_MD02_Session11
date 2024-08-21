package demo_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LopArrayList {
    public static void main(String[] args) {
        //Khởi tạo danh sách
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = List.of(20,1,4,2,4,5,3,4);

        //Thêm phần tử vào danh sách
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println("Duyệt danh sách - cách 1 (for thường)");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("\nDuyệt theo for-each: cách 2");
        for(Integer i : list){
            System.out.println(i);
        }

        System.out.println("\nDuyệt theo iterator: cách 3");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nDuyệt theo stream api và biểu thức lambda");
        list.stream().forEach(e -> System.out.println(e));
    }
}
