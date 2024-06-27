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

    if(node != null) {
      // Check if the head of the list is not null and add to the iterator variable
      count++;
      // The node variable is being replaced by the next in the node available.
      node = node.next;

      // If the next node keeps on returning an object it will return keep on repeating the cycle until the next will turn null
      while (node != null) {
        node = node.next;
        count++;
      }
    }
    // Eventually all iterations will return. Even there was no items in the linkedlist at all.
    return count;
  }

  @Override
  public boolean isEmpty() {
    return false;
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
    return false;
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
