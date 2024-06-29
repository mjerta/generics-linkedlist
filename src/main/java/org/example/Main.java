package org.example;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    LinkedList<String> linkedList = new LinkedList<>();
    var firstAdd = linkedList.add("A");
    var secondAdd = linkedList.add("B");
    linkedList.add("C");
    linkedList.add("D");
    var isEmpty = linkedList.isEmpty();
    System.out.println(isEmpty);
//    var result = linkedList.get(3);
//    System.out.println(result);
//
//    var size = linkedList.size();
//    System.out.println(size);
  }
}