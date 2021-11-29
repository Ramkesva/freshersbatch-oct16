package Java8lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaAssign6 {
	
	public static void main(String[] args) {
		List<String> list= new ArrayList<>(List.of("Predicate", "Supplier", "Interface", "Class", "Function"));
		System.out.println("Before Replacing: "+list);
		list.replaceAll(s -> s.toUpperCase());
		System.out.println("After Replacing: "+list);
	}

}
