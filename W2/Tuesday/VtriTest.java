package Tuesday;

import java.util.Scanner;

public class VtriTest {

	public static void main(String[] args) {
		int height;
		int type;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter height: ");
		height = input.nextInt();
		
		Vtri vtri1 = new Vtri(height,1);
		vtri1.draw();
		System.out.println("Height: "+vtri1.getHeight()+", Type: "+vtri1.getType());
		System.out.println();
		
		Vtri vtri2 = new Vtri(height,2);
		vtri2.draw();
		System.out.println("Height: "+vtri2.getHeight()+", Type: "+vtri2.getType());
		System.out.println();
		
		Vtri vtri3 = new Vtri(height,3);
		vtri3.draw();
		System.out.println("Height: "+vtri3.getHeight()+", Type: "+vtri3.getType());
		System.out.println();
		
		Vtri vtri4 = new Vtri(height,4);
		vtri4.draw();
		System.out.println("Height: "+vtri4.getHeight()+", Type: "+vtri4.getType());
		System.out.println();
	}
}
