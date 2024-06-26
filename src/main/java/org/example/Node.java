package org.example;

public class Node<T>  {
  Node next;
  Node previous;
  T value;

  public Node(Node next, Node previous, T value) {
    this.next = next;
    this.previous = previous;
    this.value = value;
  }

  public Node(){};

  public boolean add(T b) {
    if(next == null) {
      value = b;
      return true;
    } else {
      return next.add(b);
    }
  }

  public Node getNext() {
    return next;
  }

  public Node getPrevious() {
    return previous;
  }

  public T getValue() {
    return value;
  }
}
