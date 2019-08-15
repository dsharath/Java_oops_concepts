package snippet;
/* 
 * Class contains the constructor, static and 
 * Instance control flows in the java
 * 
 */
public class InstanceStatic {
	
	{
		System.out.println("First Instance Block...");
	}
	
	
	static {
		System.out.println("Fisrt Static Block...");
	}
	InstanceStatic(){
		System.out.println("Constructor...");
	}

	public static void main(String[] args) {

		InstanceStatic is1 = new InstanceStatic();
		System.out.println("Main Method...");
		InstanceStatic is2 = new InstanceStatic();
	}

	static {
		System.out.println("Second Static Method...");
	}
	{
		System.out.println("Second Static Methdo...");
	}
}
