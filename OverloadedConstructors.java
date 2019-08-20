package snippet;

public class OverloadedConstructors {
	
	OverloadedConstructors(){
		System.out.println("no-arg constructor");
	}
	OverloadedConstructors(int i){
		System.out.println("int-arg constructor");
	}
	OverloadedConstructors(double d){
		System.out.println("double-arg constructor");
	}

	public static void main(String[] args) {
		
		OverloadedConstructors olc1 = new OverloadedConstructors();
		OverloadedConstructors olc2= new OverloadedConstructors(10);
		OverloadedConstructors olc3= new OverloadedConstructors(10.5);
		OverloadedConstructors olc4 = new OverloadedConstructors(10l);

	}

}
