import java.util.*;

public class LinkedList<DataType> {
  private Link head;
  private int size;

  public LinkedList() {
    this.head = null;
    this.size = 0;
  }

  public DataType get (int n) {
    Link current = head;
    while (n > 0 && current != null) {
      n--;
      current = current.getNext();
    }
    if (current != null && n == 0) return (DataType) current.getData();
    return null;
  }
  public DataType add (DataType data) {
    Link link = new Link(data);
    size++;
    if (head == null) {
      head = link;
      return;
    }
    Link current = head;
    while (current.getNext() != null) {
      current = current.getNext();
    }
      current.setNext(link);
    }

}


