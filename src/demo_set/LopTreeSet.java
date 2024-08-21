package demo_set;

import java.util.SortedSet;
import java.util.TreeSet;

public class LopTreeSet {
    public static void main(String[] args) {
        SortedSet<String> list = new TreeSet<>();
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
