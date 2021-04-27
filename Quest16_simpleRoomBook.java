package Assignment8;

public class Quest16_simpleRoomBook {

	public static void main(String[] args) {
		
		System.out.println(simpleRoomBook(false,2,1,2018));
		System.out.println(simpleRoomBook(true,2,1,2018));
		System.out.println(simpleRoomBook(true,7,2,2018));

	}

	public static boolean simpleRoomBook(boolean b,int month,int day,int year) {
		
		if(b==true && year==2018 ) {
			if(month==7&&day<8) {
				return false;
			}else {
				return true;
			}
			
		}else {
			return false;
		}
	}
}
