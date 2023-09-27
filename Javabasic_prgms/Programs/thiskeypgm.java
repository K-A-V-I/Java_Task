package Programs;

public class thiskeypgm {
	int width, height, depth;
	
	 thiskeypgm (int w, int h, int d)
	 {
	  this.width = w;
	  this.height = h;
	  this.depth = d;
	 }
	 public static void main(String[] args) {
		 thiskeypgm d = new thiskeypgm(10,20,30);
		 System.out.println("width = "+d.width);
		 System.out.println("height = "+d.height);
		 System.out.println("depth = "+d.depth);
	 }

	

}
