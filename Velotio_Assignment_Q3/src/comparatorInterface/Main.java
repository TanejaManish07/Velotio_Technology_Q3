package comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List <People> peopleList = new ArrayList<People>();
		
		People s1 = new People(1000000,24,475000,2);
		People s2 = new People(1000000,40,6598456,4);
		People s3 = new People(1000000,86,566669,0);
		People s4 = new People(1000000,35,6523140, 4);
		
		People s5 = new People(1236500,50,656231,2);
		People s6 = new People(54656482,36,2514360,2);
		People s7 = new People(365210020,54,653298,2);
		People s8 = new People(654412200,65,998745,2);
	
		People s9 = new People(1000000,24,275000,2);
		People s10 = new People(50000000,24,4755000,2);
		People s11 = new People(70000000,24,4750000,2);
		People s12 = new People(60000000,24,4769532,2);
		
		peopleList.add(s1); peopleList.add(s2); peopleList.add(s3); peopleList.add(s4); peopleList.add(s5);
		peopleList.add(s10); peopleList.add(s9); peopleList.add(s8); peopleList.add(s7); peopleList.add(s6);
		peopleList.add(s11); peopleList.add(s12);
		
		Collections.sort(peopleList, new PeopleComaparator());
		for(People p : peopleList) {
			System.out.println(p);
		}
	}
}
