package ejerciciosingles;

import java.util.Comparator;

public class ComparatorForEmployee implements Comparator<Employee>{

	
	public int compare(Employee o1, Employee o2) {
		
		String name1 = o1.getLastName() + " " + o1,getFirstName();
		String name2 = o1.getLastName() + " " + o2,getFirstName();
		
		return name1.compareTo(name2);
	}

}
