package org.example;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> listOne = new ArrayList<>();
    listOne.add("test");
    LinkedList<String> linkedList = new LinkedList<>();

    linkedList.add("A"); //0
    linkedList.add("B");
    linkedList.add("C");
    linkedList.add("D"); // 3

    var getitem =  linkedList.get(0);
    System.out.println(getitem);

//    linkedList.addAll(Arrays.asList("H","4","K"));

//    linkedList.set(0, "T");

//    linkedList.add(0,"Z");

//    linkedList.set(1,"M");
//    System.out.println("test");;
//    System.out.println(linkedList.size());
//    linkedList.removeAll(Arrays.asList("D", "D", "D", "D", "D"));
//    System.out.println(linkedList.size());
//    for (int i = 0; i < linkedList.size(); i++) {
//      System.out.println(linkedList.get(i));
//    }

//    linkedList.clear();
//    System.out.println(linkedList.size());
//    var isEmpty = linkedList.isEmpty();
//    System.out.println(isEmpty);
//    var result = linkedList.get(3);
//    System.out.println(result);
//
//    var size = linkedList.size();
//    System.out.println(size);
  }
}