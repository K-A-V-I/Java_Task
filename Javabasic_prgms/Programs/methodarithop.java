package Programs;

import java.util.*;

public class methodarithop {
	  public static void main(String[] args) {

	    String operator;
	    Double number1, number2, result;
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next();

	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) {

	      case "add":
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      case "sub":
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      case "mul":
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      case "div":
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	  }
}

