public class LinkedList implements IteratorList{
    private final Node start;
    private final Node end;
    private Node current;
    int index;
    private int count;
    public LinkedList() {
        this.start = new Node();
        count = 0;
        this.end = new Node();
        start.setNext(end);
        index = 0;
        current = start;
    }
    public int current(){
        return current.getData();
    }
    public int next(){
        current = current.getNext();
        index += 1;
        return current.getData();
    }
    public int previous(){
        current = current.getPrevious();
        index -= 1;
        return current.getData();
    }
    public boolean isEmpty(){
        return start.getNext() == end;
    }
    public void add(int elem){
        Node tmp = new Node(elem);
        Node current = this.start;
        while (current.getNext() != end){
            current = current.getNext();
        }
        end.setPrevious(tmp);
        current.setNext(tmp);
        count++;
    }
    public int previousIndex(){
        return index-1;
    }
    public boolean hasNext(){
        return current.next != null;
    }
    public boolean hasPrevious(){
        return current.previous != null;
    }
    public void remove(){
        if(current == start || current == end){
            System.out.println("Can't remove element");
        }else{
            current.previous.setNext(current.next);
            current.next.setPrevious(current.previous);
            count--;
        }

    }
    public int nextIndex(){
        return index+1;
    }

    public void clear(){
        start.setNext(end);
        count = 0;
        index = 0;
        current = start;
    }
    public int size(){ return count; }
}