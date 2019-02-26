package inheritance;

public class Vtri extends Shape{
	private int type;
	
	public Vtri(int h, int t) {
		height = h;
		type = t;
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void draw() {
		switch(type) {
		case 1:
			for(int i=1; i<=height; i++) {
				prChar("*",i);
				System.out.println();
			}
			break;
		case 2:
			for(int i=1; i<=height; i++) {
				prChar(" ",height-i);
				prChar("*",i);
				System.out.println();
			}
			break;
		case 3:
			for(int i=1; i<=height; i++) {
				prChar("*",height-i+1);
				System.out.println();
			}
			break;
		case 4:
			for(int i=1; i<=height; i++) {
				prChar(" ",i-1);
				prChar("*",height-i+1);
				System.out.println();
			}
			break;
			
		}
	}
	
	void prChar(String C, int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(C);
		}
	}
}
