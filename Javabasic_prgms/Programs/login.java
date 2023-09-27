package Programs;

import java.util.Scanner;

public class login {

public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String enteredUsername = scanner.next();
    System.out.print("Enter password: ");
    String enteredPassword = scanner.next();
    scanner.close();

    userLogin user = new userLogin("Kavi", "Kavi4321");
    if (user.validateLogin(enteredUsername, enteredPassword)) 
    {
        System.out.println("login successfully");
    } 
    else {
        System.out.println("login failed");
    }
}


}
