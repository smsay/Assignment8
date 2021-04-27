package Assignment8;

public class Quest13_waterTax {

	public static void main(String[] args) {
	
		System.out.println(waterTax(55));
		System.out.println(waterTax(101));
		System.out.println(waterTax(151));
	}

	public static double waterTax(double units) {
		double bill=0;
		if(units<50) {
			bill=units*0.6;
		}else if(units>50&&units<100) {
			bill=units*0.9;
		}else if(units>100&&units<150) {
			bill=units*0.9+50;
		}else if(units>150) {
			bill=units*0.9+100;
		}
		return  bill;
		
		
	}
}
