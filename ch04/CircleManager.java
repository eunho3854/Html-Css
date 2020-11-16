package ch04;

import java.util.Scanner;

class Circle5 {
	private double x, y;
	private int radius;
	
	public Circle5() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle5(double x, double y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("(" + x + ", " + y + ") " + radius);
	}
	
	
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle5 c [] = new Circle5[2];
		for(int i=0; i<3; i++) {
			System.out.println("x, y, radius >> ");
			c[i] = sc.c 
		}
		
		sc.close();
	}

}
