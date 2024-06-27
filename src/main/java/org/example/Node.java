package org.example;

public class Node<T> {
  T value;
  Node<T> next;
//  Node previous;

  public Node(T value, Node next) {
    this.value = value;
    this.next = next;
//    this.previous = previous;
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
    else {
      return next.getValue(index - 1);
    }
  }
}
