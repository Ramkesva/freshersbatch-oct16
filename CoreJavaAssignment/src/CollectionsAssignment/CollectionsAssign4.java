package CollectionsAssignment;
import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class CollectionsAssign4 {
	static boolean isLeap(int year) {
		if((year%4==0 && year%100!=0) || year%400==0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		List<LocalDate> list= new LinkedList<>();
		list.add(LocalDate.of(2010, 05, 09));
		list.add(LocalDate.of(2011, 12, 25));
		list.add(LocalDate.of(1999, 07, 06));
		list.add(LocalDate.of(1998, 08, 19));
		for(LocalDate d: list) {
			System.out.print("Your date of birth is "+d.format(DateTimeFormatter.ofPattern("dd-MM-yy")));
			if(isLeap(d.getYear()))
				System.out.println(" and it was a leap year");
			else
				System.out.println(" and it was not a leap year");
		}
	}

}
