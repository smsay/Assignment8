package Assignment8;

public class Quest15_validateTask {

	public static void main(String[] args) {
		
		System.out.println(validateTask(true,8,7));
		System.out.println(validateTask(true,8,9));
		System.out.println(validateTask(false,8,7));
	}

	public static boolean validateTask(boolean b,int nextId,int currentId) {
		
		if(b==true && nextId==currentId+1 ) {
			return true;
		}else {
			return false;
		}
	}
}
