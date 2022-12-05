// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Queue;

public class zad_2 {

    public static void main(String[] args) {

        Queue<String> turn = new LinkedList<String>();
        turn.add("Мурлоки из мурчизании");
        turn.add("Настырный бард");
        turn.add("Веселые гноллы");
        turn.add("Дворфы из дворфомёта");
        turn.add("Гном из конца очереди");
        System.out.println(turn);
        
        String test_element = "Гоблин, который точно выживет";

        enqueue(turn, test_element);
        System.out.println(turn);

        dequeue(turn);
        System.out.println(turn);

        first(turn);
        

    }

    private static Queue first(Queue turn) {
        System.out.println(turn.peek());
        return turn;
    }

    private static Queue dequeue(Queue turn) {
        System.out.println(turn.poll());
        return turn;
    }

    private static Queue enqueue(Queue turn, String test_element) {
        turn.add(test_element);
        return turn;
    }
}
