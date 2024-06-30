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

    linkedList.add("A");
    linkedList.add("B");
    linkedList.add("C");
    linkedList.add("D");

    linkedList.set(1,"M");
    System.out.println("test");;
//    System.out.println(linkedList.size());
//    linkedList.removeAll(Arrays.asList("D", "D", "D", "D", "D"));
//    System.out.println(linkedList.size());
    for (int i = 0; i < linkedList.size(); i++) {
      System.out.println(linkedList.get(i));
    }

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