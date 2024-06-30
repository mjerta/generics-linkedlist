package org.example;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<>();

    // Add method
    linkedList.add("A");
    linkedList.add("B");
    linkedList.add("C");
    linkedList.add("D");
    // A method to print out current items at this point
    linkedList.printOutAllItems();

    // Lets add another entry
    System.out.println("\nAdd entry example");
    linkedList.add("E"); // This add an E add the end.
    linkedList.printOutAllItems();

    // Lets remove this E
    System.out.println("\nRemove entry example");
    linkedList.remove("E");
    linkedList.printOutAllItems();

    // Lets add a entry add a certain index
    System.out.println("\nAdd entry add certian index( index 2)");
    linkedList.add(2,"added-entry");
    linkedList.printOutAllItems();

    // Lets add a whole array to this existing array
    System.out.println("\n Add array to existing array");
    linkedList.addAll(Arrays.asList("new-entry1", "new-entry2"));
    linkedList.printOutAllItems();

    // Lets add a whole array to this existing array at a specific index
    System.out.println("\n Add array to existing array at specific index");
    linkedList.addAll(3,Arrays.asList("new-entry3", "new-entry4"));
    linkedList.printOutAllItems();

    // Now we now how to add items to the array, lets do something else
    System.out.println("\nIs this array empty");
    System.out.println(linkedList.isEmpty());

    // Lets update an entry
    System.out.println("\nUpdate an entry");
    linkedList.set(2, "updated-entry");
    linkedList.printOutAllItems();

    // Lets get a specific entry
    System.out.println("\nGet a specific entry ( get index 2)");
    System.out.println(linkedList.get(2));

    // Lets remove a specific entry
    System.out.println("\nRemove an entry");
    linkedList.remove("updated-entry");
    linkedList.printOutAllItems();

    // Lets remove some more entries
    System.out.println("\nRemoving some more entries");
    linkedList.removeAll(Arrays.asList("new-entry3", "new-entry4"));
    linkedList.printOutAllItems();

    // Lets see how big the array is
    System.out.println("\nThe size of the current array");
    System.out.println(linkedList.size());

    // Lets remove all items from this array
    System.out.println("\nRemoving all items from this array");
    linkedList.clear();
    System.out.println("\nLets check if its really empty with the isEmpty and size method");
    System.out.println("is this empty? " + linkedList.isEmpty() + " - What is the current size of the array? " + linkedList.size() );
  }
}