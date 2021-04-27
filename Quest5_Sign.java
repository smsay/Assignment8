package Assignment8;

import java.util.Scanner;

public class Quest5_Sign {

	public static void main(String[] args) {
		
		sign(5);
	}

	public static void sign(int a) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(1);
		 }else if(num<0) {
				System.out.println(-1);
		 }else {
			 System.out.println(0);
		 }
	}
}

