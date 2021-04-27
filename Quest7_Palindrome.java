package Assignment8;

public class Quest7_Palindrome {

	public static void main(String[] args) {
			isPalindrome(1001);
			isPalindrome(1002);
		
    }


	
		public static boolean isPalindrome (int a) {
			int palindrome = a; 
	        int reverse = 0;

	        while (palindrome != 0) {
	            int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
	        }
	        if (a == reverse) {
	        	  System.out.println("Number : " + a + " is a palindrome");
	            return true;
	        }else {
	        	System.out.println("Number : " + a + " is not a palindrome");
	        return false;
	           
	        } }}

	       
		




	

	


