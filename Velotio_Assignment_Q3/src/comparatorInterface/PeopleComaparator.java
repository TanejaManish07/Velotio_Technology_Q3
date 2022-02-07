package comparatorInterface;

import java.util.Comparator;

class PeopleComaparator implements Comparator<People> {
	@Override
	public int compare(People p1, People p2) {
		int result = 0;
		
		result = p1.getTotalAccountBalance() - p2.getTotalAccountBalance();
		
		if(result == 0) {
			result = p1.getAge() - p2.getAge();
		}
		
		if(result == 0) {
			result = p1.getSalary() - p2.getSalary();
		}
		
		if(result == 0 ) {
			result = p1.getNumberOfDependents() - p2.getNumberOfDependents();
		}
		
		return result;
	}
	
}
