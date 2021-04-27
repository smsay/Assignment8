package Assignment8;

public class Quest8_Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib(9));

	}
	
	public static int fib(int n) {
    
        if (n == 1) {
            return 0;
             
        }else if (n == 2 || n == 3) {
            return 1;
      
        }else{
        	int preFib = 0, nowFib = 1;
        for (int i = 1; i < n - 1; i++)
        {
            int newFib = preFib + nowFib;
            preFib = nowFib;
            nowFib = newFib;
        }
     
        return nowFib;
    }
        }

			
		}

