package snippet;


/*
 * These class contains a instance block
 * which counts no.of objects made (or)
 * no.of times the class is called.
 */
public class CountTheClassCalling {

	static int count =0;
	{
		count++;
	}
	CountTheClassCalling(){
	}
	
	CountTheClassCalling(int i){
		
	}
	CountTheClassCalling(double d){
		
	}
	public static void main(String[] args) {
		
		CountTheClassCalling ctc1=new CountTheClassCalling();
		CountTheClassCalling ctc2 = new CountTheClassCalling(10);
		CountTheClassCalling ctc3 = new CountTheClassCalling(10.5);
		System.out.println("No.of objects created..."+count);
	}

}
