
public class EmlpoyeeWage {

	public static final int EMP_PART_TIME = 1;
	public static final int EMP_FULL_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;
	
	public static void main(String[] args) {
			
		int empCheck = (int) Math.floor(Math.random() * 10) %3;
		int empWage = 0;
		int empHrs = 0;
				
		switch (empCheck) {
		case EMP_PART_TIME:
			 empHrs = 4;
			 empWage = empHrs * WAGE_PER_HOUR;
			 System.out.println("Employee is Part Time & Wage is: " +empWage);
		break;
		case EMP_FULL_TIME:
			 empHrs = 8;
			 empWage = empHrs * WAGE_PER_HOUR;
			 System.out.println("Employee is Full Time & Wage is: " +empWage);
		break;
		default:
			 empHrs = 0;
			 empWage = empHrs * WAGE_PER_HOUR;
			 System.out.println("Employee is Absent & Wage is: " +empWage);
		}
	
	}
}
