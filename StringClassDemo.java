package assignment;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringClassDemo obj = new StringClassDemo();
		
		
	}
	StringClassDemo() 
	{
		String m = "Hello I am new to Java";
		String n = "I am learning Java";
		System.out.println(m.compareTo(m));
		System.out.println(m.contains(n));
		System.out.println(m.indexOf('I'));
		System.out.println(m.isBlank());
		System.out.println(m.isEmpty());
		System.out.println(m.lastIndexOf('J'));
		System.out.println(m.length());
		System.out.println(m.startsWith(n));
		System.out.println(m.compareToIgnoreCase(n));
		System.out.println(n.contains(n));
		System.out.println(n.endsWith(n));
		System.out.println(m.concat(n));
		System.out.println(n.indexOf('e'));
		System.out.println(n.replace(m, n));
		System.out.println(m.replaceAll(m, n));
		System.out.println(n.replaceAll(m, n));
		System.out.println(n.substring(4));
		System.out.println(m.substring(10));
		
		
	}
	
	

}
