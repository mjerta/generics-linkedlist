package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<T> implements List<T> {
  private Node<T> node;

  public LinkedList() {
  }

  @Override
  public int size() {
    int count = 0;
    if (node != null) {
      // Check if the head of the list is not null and add to the iterator variable
      count++;
      // The next object of the first node will be stored in a Node referene object variable
      Node<T> next = node.next;
      // If the next node keeps on returning an object it will return keep on repeating the cycle until the next will turn null
      while (next != null) {
        next = next.next;
        count++;
      }
    }
    // Eventually all iterations will return. Even there was no items in the linkedlist at all.
    return count;
  }

  @Override
  public boolean isEmpty() {
    return node == null;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator<T> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T1> T1[] toArray(T1[] a) {
    return null;
  }

  @Override
  public boolean add(T t) {
    if (node == null) {
      node = new Node<>(t, null);
      //  This is because its being added by the inferace, this methods has return type of boolean
      return true;
    }
    else {
      // This also returns true
      return node.add(t);
    }
  }

  @Override
  public boolean remove(Object o) {
    System.out.println("test To remove");

    Node<T> nodeLookUp = this.node;
    Node<T> previousNode = null;

    while (true) {
      // This will return false if in the first place no node has been found.
      // Second of all it will return false if there is no other entries has beend found.
      if (nodeLookUp == null) {
      System.out.println("test1");
        return false;
      }
      if (nodeLookUp.value.equals(o)) {
        System.out.println(previousNode.value);
        if (previousNode == null) {
          System.out.println(node.value);
          System.out.println(nodeLookUp.value);
          node = node.next;
          System.out.println(node.value);
        }
        previousNode.next = nodeLookUp.next;
        return true;
      }

      previousNode = nodeLookUp;
      System.out.println("previous node "  + previousNode.value);
      nodeLookUp = nodeLookUp.next;
      System.out.println("nodeToLookup "  + nodeLookUp.value);
    }
//    We loopen door de nodes heen, waarbij we de huidige en de vorige Node bijhouden.
//    Node<T> toRemove = node;
//    Node<T> previous = null;
//
//    //We maken hier een while(true) loop, wat gevaarlijk is, dus daar moeten we heel bewust mee omgaan.
//    while(true){
//      //Dit eerste if-statement zorgt er voor dat we niet oneindig blijven loopen.
//      if(toRemove == null){
//        return false;
//      }
//      //Als het object uit de parameter is gevonden als value van de Node, dan willen we die Node verwijderen
//      if(toRemove.value.equals(o)){
//        if(previous == null){
//          node = node.next;
//          return true;
//        }
//        previous.next = toRemove.next; // zorg dat de next van de vorige wijst naar de next van de huidige. Daarmee haal je effectief
//        de huidige Node tussen de lijst uit en is het verwijderd. (het maakt niet uit of de volgende node null is)
//        return true;
//      }
//      //Als het object uit de parameter niet gevonden is, dan kijken we of het in de volgende Node wel gevonden wordt. (tot
//      previous = toRemove;
//      toRemove = toRemove.next;
//    }

  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends T> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends T> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {
    if (node != null) {
      node = null;
    }
  }

  @Override
  public T get(int index) {
    if (node == null) {
      return null;
    }
    return node.getValue(index);
  }

  @Override
  public T set(int index, T element) {
    return null;
  }

  @Override
  public void add(int index, T element) {

  }

  @Override
  public T remove(int index) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<T> listIterator() {
    return null;
  }

  @Override
  public ListIterator<T> listIterator(int index) {
    return null;
  }

  @Override
  public List<T> subList(int fromIndex, int toIndex) {
    return List.of();
  }
}
