/**
 * Created by adaml on 10/20/2017.
 */
public class Link<DataType> {
    private DataType data;
    private Link next;
    // Reference the private DataType data instead of the one in scope
    public Link (DataType data) { this.data = data; }

    public Link (DataType data, Link next){
        // Call the Constructor Passing in data
        this(data);
        // Set next to next
        this.next = next;
    }
    // Set the Data
    public void setData(DataType data) { this.data = data; }

    // Get the Data
    public DataType getData() { return data; }

    // Set the Next node
    public void setNext(Link next) { this.next = next; }

    // get the Next Node
    public Link getNext() { return next; }

}
