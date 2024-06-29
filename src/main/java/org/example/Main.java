package org.example;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> listOne = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<>();

    linkedList.add("A");
    linkedList.add("B");
    linkedList.add("C");
    linkedList.add("D");

    System.out.println(linkedList.size());
    linkedList.clear();
    System.out.println(linkedList.size());
//    var isEmpty = linkedList.isEmpty();
//    System.out.println(isEmpty);
//    var result = linkedList.get(3);
//    System.out.println(result);
//
//    var size = linkedList.size();
//    System.out.println(size);
  }
}