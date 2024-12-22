public class Node {
    int data;
    Node next;
    Node previous;

    public Node(int newData){
        this.data = newData;
        this.next = null;
        this.previous = null;
    }
    public Node(){}
    public void setData(int n){
        this.data = n;
    }
    public Node getNext(){
        return next;
    }
    public Node getPrevious(){
        return previous;
    }
    void setNext(Node st){
        this.next = st;
        st.previous = this;
    }
    void setPrevious(Node st){
        this.previous = st;
        st.next = this;
    }

    public int getData() {
        return data;
    }
}
