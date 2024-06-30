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

    Node<T> nodeLookUp = node; // node is the original node and nodeLookUp is just a reference to this.
    Node<T> previousNode = null;

    while (true) {
      // This will return false if in the first place no node has been found.
      // Second of all it will return false if there is no other entries has beend found.
      if (nodeLookUp == null) {
        return false;
      }
      if (nodeLookUp.value.equals(o)) {
        if (previousNode == null) {
          node = node.next;
          return true;
        }
        // In this case the next entry of the previouos( the value that we are looking for) will be replaced byt the current next one. So
        // this item is deleted.
        // The reference of the copy and the original node both share the same reference. So the value of the reference will change.
        // This could not have happen if you directly change a reassigned a variable to a different object. This reference is not the same.
        previousNode.next = nodeLookUp.next;
        return true;
      }

      previousNode = nodeLookUp;
      nodeLookUp = nodeLookUp.next;
    }
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
    boolean ableToRemove = true;

    for (Object o : c) {
      // Added a condition to make sure to check every single removal is successful.
      if (!remove(o)) {
        ableToRemove = false;
      }
    }
    return ableToRemove;
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
    int i = 0;
    Node<T> currentNode = node;

    while (index > i) {
      currentNode = currentNode.next;
      i++;
    }
    return currentNode.set(element);
  }

  @Override
  public void add(int index, T element) {
    if (index < 0) {
      System.out.println("Index out of bounds");
      return;
    }
    Node<T> currentNode = node;
    Node<T> previousNode = null;

    for (int i = 0; i < index; i++) {
      if (currentNode == null) {
        System.out.println("Index out of bounds");
        return;
      }
      previousNode = currentNode;
      currentNode = currentNode.next;
    }
    Node<T> newNode = new Node<>(element, currentNode);

    if (previousNode != null) {
      previousNode.next = newNode;
    }
    else {
      node = newNode;
    }
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
