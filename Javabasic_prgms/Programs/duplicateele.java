package Programs;

public class duplicateele {
	public static void main (String args[]) {
	
	String [] movie = { "Harry potter", "POC","Frozen", "spideman", "POC", "Homealone","Frozen"};
	
		for(int i=0; i<movie.length; i++) {
			for(int j=i+1 ; j<movie.length; j++) {
				if (movie[j] == movie [i])
				System.out.println( movie[j]);
				
			}
		}	
	}
}
