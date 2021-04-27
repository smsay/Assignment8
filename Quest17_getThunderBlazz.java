package Assignment8;

public class Quest17_getThunderBlazz {

	public static void main(String[] args) {
		System.out.println(getThunderBlazz(true,false,1,2,3));
		System.out.println(getThunderBlazz(false,false,1,2,3));
		System.out.println(getThunderBlazz(false,false,1,5,3));
		System.out.println(getThunderBlazz(false,false,3,1,2));
		System.out.println(getThunderBlazz(false,false,3,1,1));
		System.out.println(getThunderBlazz(false,true,9,7,3));
		
		
		
		
	}
	
	public static boolean getThunderBlazz(boolean avaliable,boolean gift, int ingr1 , int ingr2, int ingr3) {
		
		if(avaliable==true || gift==true){
			return true;
			}else if((ingr1==1&&ingr2==2&&ingr3==3)||(ingr1==3&&ingr2==1&&ingr3==2)){
					return true;
				}else {
					return false;
			}
	}}

	



