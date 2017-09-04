
public class Demo {
public static void main(String[] args) {
	int i=Integer.parseInt("111");
	System.out.println(i);
	
	boolean b1= Boolean.parseBoolean("true");
	System.out.println(b1);
	
	boolean b2= Boolean.parseBoolean("TRUE");
	System.out.println(b2);
	
	boolean b3= Boolean.parseBoolean("False");
	System.out.println(b3);
	
	boolean b4= Boolean.parseBoolean("60");
	System.out.println(b4);
}
}
