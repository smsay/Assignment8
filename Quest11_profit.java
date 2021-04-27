package Assignment8;

public class Quest11_profit {

	public static void main(String[] args) {
		System.out.println(c_profis(100,1500));
	}
	
	public static String c_profis(int buyPrice,int sellPrice) {
		String output="";
		if(sellPrice>buyPrice) {
			output="profit";
		}else if(sellPrice<buyPrice) {
			output="loss";
		}else {
			output="noloss";
			
	}
		return output;
		
	}
}
