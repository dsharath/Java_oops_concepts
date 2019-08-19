package snippet;

public class CustomSingleton {
	private static CustomSingleton singleton = null;
	
	private Singleton() {
		
	}

	public static CustomSingleton getCustomSingleton() {
  
		if(singleton == null){
     singleton = new CustomSingleton();
    }
		return singleton;
	}
}
