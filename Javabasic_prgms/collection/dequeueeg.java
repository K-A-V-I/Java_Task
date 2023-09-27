package collection;
import java.util.*;

public class dequeueeg {
    public static void main(String[] args) {
        Deque<String> tasks = new ArrayDeque<>(); 
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.pop();
        System.out.println("Tasks in the queue: " + tasks);
        Iterator<String> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            String task = iterator.next();
            System.out.println("Task: " + task);
        }

        tasks.add("New Task 11");
        tasks.add("New Task 12");
        tasks.addFirst("Task 001"); 
        tasks.addLast("Last Task");   
        System.out.println("Updated tasks in the queue: " + tasks);
        tasks.poll();
        System.out.println("Updated tasks in the queue: " + tasks);
    }
}

