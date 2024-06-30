package org.example;

public class Node<T> {
  T value;
  Node<T> next;

  public Node(T value, Node next) {
    this.value = value;
    this.next = next;
  }

  public Node() {
  }

  public boolean add(T t) {
    if (next == null) {
      next = new Node(t, null);
      return true;
    }
    else {
      return next.add(t);
    }
  }

  public T getValue(int index) {
    if (index == 0) {
      // This is the head of the linkedlist
      return this.value;
    }
      else if (next != null) {
        return next.getValue(index - 1);
      }
      else {
        return null;
      }
  }

  public T set(T element) {
    this.value = element;
    return element;
  }
}
