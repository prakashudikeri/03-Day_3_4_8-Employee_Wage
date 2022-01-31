
public class EmployeeAttendance {

public static void main(String[] args) {
		
		int IS_EMP_PRESENT = 1;
		double empcheck = (int) Math.floor(Math.random() * 10) %2;
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int empWage = 0;
				
		if(empcheck == IS_EMP_PRESENT) {
			System.out.println("Employee is Present");
			empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
			System.out.println("Employee Wage: "+ empWage );
		}
		else {
		System.out.println("Employee is Absent");	
		}
	}
}
