package inheritance;

public class Rect extends Shape{
	private int width;
	
	public Rect(int h, int w) {
		super(h);
		width = w;
	}
	
	public void draw() {
		for(int i=1; i<=height;i++) {
			for(int j=1; j<=width; j++)
				System.out.printf("*");
			System.out.println();
		}
	}

	public Rect() {
		
	}
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int w) {
		width = w;
		
	}
}
