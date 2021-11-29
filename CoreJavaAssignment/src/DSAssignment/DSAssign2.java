package DSAssignment;
public class DSAssign2 {
	boolean isAmstrong(int n) {
		int r, s=0, x=n;
		while(n>0) {
			r=n%10;
			s+=(r*r*r);
			n/=10;
		}
		if(s==x)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		DSAssign2 ob= new DSAssign2();
		System.out.println("Amstrong Numbers in 100-999 are:");
		for(int n=100;n<1000;n++) {
			if(ob.isAmstrong(n)) {
				System.out.println(n);
			}
		}
	}

}
