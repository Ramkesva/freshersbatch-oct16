package DSAssignment;
import java.util.*;

public class DSAssign1 {
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
		Scanner sc = new Scanner(System.in);
		DSAssign1 ob= new DSAssign1();
		int n= sc.nextInt();
		if(ob.isAmstrong(n)) {
			System.out.println(n+" is an armstrong number");
		}
		else
			System.out.println(n+" is not an armstrong number");
		sc.close();
	}

}
