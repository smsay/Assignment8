package Assignment8;

import java.util.Scanner;

public class Quest6_Next3 {

	public static void main(String[] args) {
		next3(1);

	}

	public static void next3(int a) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println((num+1)+" "+(num+2)+" "+(num+3));
	}
}
