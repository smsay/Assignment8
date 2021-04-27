package Assignment8;

import java.util.Scanner;

public class Quest2_cube {

	public static void main(String[] args) {
		cube();

	}
	public static void cube() {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int cube=input*input*input;
		System.out.println(cube);
	}

}
