import java.util.Iterator;
import java.util.Stack;
public class Main{
    public static void main(String[] args) {
        Stack<Integer> si = new Stack<>();

        int[] mas = {1,2,3,4,5,6};
        for (int i = 0;i < (mas.length / 2);i++){
            si.push(mas[mas.length - i - 1]);
            si.push(mas[i]);
            Iterator<Integer> iterator = si.iterator();
            while (iterator.hasNext()){
                mas[i] = iterator.next();
                mas[mas.length - i - 1] = iterator.next();
            }
        }
        System.out.println("Array:");
        for (int i = 0; i < 6; i++) {
            System.out.println(mas[i]);
        }
        LinkedList l = new LinkedList();
        l.add(5);
        l.add(9);
        l.add(10);
        l.add(3);
        System.out.println("First el: " + l.next());
        System.out.println("Second el: " + l.next());
        System.out.println("Third el: " + l.next());
        System.out.println("Second el: " + l.previous());
        System.out.println("Index of next el: " + l.nextIndex());
        System.out.println("Index of previous el: " + l.previousIndex());
        l.remove();
        System.out.println("Current: " + l.current());
        System.out.println("Has next: " + l.hasNext());
        System.out.println("Has previous: " + l.hasPrevious());
        System.out.println("Clearing...");
        l.clear();
        System.out.println("Is empty: " + l.isEmpty());
        System.out.println("Size: " + l.size());
    }
}