public class LinkedList<DataType> {
  private DataType data;
  private Link next;

  public Link(DataType data){
    this.data = data;
  }

  public Link(DataType data, Link next){
    this(data);
    this.next = next;
  }

  public void setData(DataType data){
    this.data = data;
  }

  public DataType getData(){
    return data;
  }

  public void setNext(Link){
    this.next = next;
  }

  public Link getNext(){
    return next;
  }
