package Assignment8;

public class Quest14_truthTable {

	public static void main(String[] args) {
		System.out.println(threeLocks(true,false,true));
		System.out.println(threeLocks(false,false,true));
		System.out.println(threeLocks(true,false,false));

	}

	public static boolean threeLocks(boolean a,boolean b,boolean c) {
		
		    if ((a && b) || c) {
		        return true;
		    }
		    else{
		        return false;
	
}
}}