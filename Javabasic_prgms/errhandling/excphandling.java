package errhandling;

import java.util.Scanner;

class excphandling {
    private String name;
    private int age;

    public excphandling(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        try {
            System.out.print("Enter employee age: ");
            int age = Integer.parseInt(sc.nextLine());
            if (age < 25 || age > 60) {
                throw new IllegalArgumentException("Invalid age entered.");
            }
            excphandling employee = new excphandling(name, age);
            employee.displayDetails();
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid age format. Please enter a valid integer.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please enter a valid age. Eligible age is between 25 to 60.");
        } 
        finally {
            sc.close();
        	System.out.println("ABC Company");
    
        }
    }
}



