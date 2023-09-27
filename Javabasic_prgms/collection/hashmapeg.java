package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapeg {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Harry");
        studentMap.put(104, "Joe");

        System.out.println("student with ID 102: " + studentMap.get(102));   
        System.out.println("Student information ");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        int searchID = 103;
        System.out.println("Does student with ID " + searchID + " exist? " + studentMap.containsKey(searchID));
        studentMap.remove(102);
        System.out.println("No of students " + studentMap.size());
        studentMap.clear();
        System.out.println("Student map is empty: " + studentMap.isEmpty());
        studentMap.put(201, "Don");
        studentMap.put(202, "Jessica");
        studentMap.put(203, "Jam");
        Set<Integer> studentIDs = studentMap.keySet();
        System.out.println("Student IDs: " + studentIDs);
        String searchName = "Sail";
        System.out.println("Does student with name " + searchName + " exist? " + studentMap.containsValue(searchName));
    }
}

