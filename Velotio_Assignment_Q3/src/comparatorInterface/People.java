package comparatorInterface;

public class People {
	private int totalAccountBalance;
	private int age;
	private int salary;
	private int numberOfDependents;
	
	public People(int totalAccountBalance, int age, int salary, int numberOfDependents) {
		super();
		this.totalAccountBalance = totalAccountBalance;
		this.age = age;
		this.salary = salary;
		this.numberOfDependents = numberOfDependents;
	}

	public int getTotalAccountBalance() {
		return totalAccountBalance;
	}

	public void setTotalAccountBalance(int totalAccountBalance) {
		this.totalAccountBalance = totalAccountBalance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getNumberOfDependents() {
		return numberOfDependents;
	}

	public void setNumberOfDependents(int numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	@Override
	public String toString() {
		return "People [totalAccountBalance=" + totalAccountBalance + ", age=" + age + ", salary=" + salary
				+ ", numberOfDependents=" + numberOfDependents + "]";
	}
	
	
	
	

}
