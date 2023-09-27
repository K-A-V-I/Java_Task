package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queueeg{
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 4");
        tasks.poll();
        System.out.println("Tasks in the queue: " + tasks);
        tasks.poll();
        Iterator<String> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            String task = iterator.next();
            System.out.println("Task: " + task);
        }
        while (!tasks.isEmpty()) {
            String task = tasks.poll(); 
            System.out.println("Processing task: " + task);
        }
        tasks.add("New Task 1");
        tasks.add("New Task 2");
        System.out.println("Updated tasks in the queue: " + tasks);
    }
}

