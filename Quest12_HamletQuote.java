package Assignment8;

public class Quest12_HamletQuote {

	public static void main(String[] args) {
		System.out.println(hamletQuote(false,true));
		System.out.println(hamletQuote(true,true));
		System.out.println(hamletQuote(false,false));

	}
	
		public static boolean hamletQuote(boolean a,boolean b) {
			if(a||b) {
				return true;
			}else {
				return false;
			}
		}
}
