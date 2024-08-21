package demo_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LopLinkedHashSet {
    public static void main(String[] args) {
        Set<String> list = new LinkedHashSet<>();
        list.add("One");
        list.add("Two");
        list.add("One");
        list.add("Three");
        list.add("Three");
        list.add("Three");
        list.add("Four");
        list.add("Three");
        list.add("Five");
        list.add("Six");
        list.add("Three");

        for(String e : list){
            System.out.println(e);
        }

    }
}
