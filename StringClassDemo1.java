package assignment;

public class StringClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 10;
		int n = 20;
		StringClassDemo1 obj = new StringClassDemo1(m, n);

	}
	
	StringClassDemo1(int m, int n)
	{
		System.out.println("Maximum value - " +Math.max(m, n));
		System.out.println("Maximum value - " +Math.subtractExact(m, n));
		System.out.println("Maximum value - " +Math.abs(n));
		System.out.println("Maximum value - " +Math.abs(m));
		System.out.println("Maximum value - " +Math.addExact(m, n));
		
	}

	}


