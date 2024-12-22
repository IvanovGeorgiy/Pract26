public interface IteratorList {
    void add(int element);
    boolean hasNext();
    boolean hasPrevious();
    int next();
    int nextIndex();
    int previous();
    int previousIndex();
    void remove();
}