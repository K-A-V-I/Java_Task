package collection;
import java.util.LinkedList;

public class Linkedlisteg {
	    public static void main(String[] args) {
	
	        LinkedList<String> fantasyMovies = new LinkedList<>();

	        fantasyMovies.add("The Lord of the Rings");
	        fantasyMovies.add("Harry Potter ");
	        fantasyMovies.add("Narnia");
	        fantasyMovies.add("Pans Labyrinth");

	        System.out.println("No. of fantasy movies: " + fantasyMovies.size());
	        System.out.println("first movie: " + fantasyMovies.peekFirst());
	        System.out.println("last movie: " + fantasyMovies.peekLast());

	        fantasyMovies.pollFirst();
	      
	        System.out.println("after removing fn.");
	        System.out.println(fantasyMovies);

	        fantasyMovies.addFirst("fantastic Beasts");
	        fantasyMovies.addLast("Narnia-Prince Caspian");
	        System.out.println(fantasyMovies);

	        LinkedList<String> reversedMovies = new LinkedList<>(fantasyMovies);
	        reversedMovies.descendingIterator();

	        System.out.println("Reversed movies order:");
	        System.out.println(reversedMovies);
	    }
}