package OOPSAssignment;

class Singleton{
	private static Singleton inst= null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(inst==null)
			inst= new Singleton();
		return inst;
	}
	public void message() {
		System.out.println("From Sigleton class");
	}
}

public class OOPSAssign1 extends Singleton{
	public static void main(String[] args) {
		OOPSAssign1 a= new OOPSAssign1();
		a.message();
	}
}
