package inhertance;

class Office {
    private String officeName;
    private String address;

    public Office(String officeName, String address) {
        this.officeName = officeName;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Office: " + officeName);
        System.out.println("Address: " + address);
    }
}

class Employee extends Office {
    private String name;
    private int employeeId;

    public Employee(String officeName, String address, String name, int employeeId) {
        super(officeName, address);
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class Manager extends Office {
    private String department;

    public Manager(String officeName, String address, String department) {
        super(officeName, address);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

}


public class hierachial {
    public static void main(String[] args) {
     
        Manager manager = new Manager("Capgemini", "HQ Building", "App Developer");
        manager.displayInfo();
    
        System.out.println();

        Employee employee = new Employee("Capgemini", "Main Street", "Jessica", 2001);
        employee.displayInfo();
    }
}

