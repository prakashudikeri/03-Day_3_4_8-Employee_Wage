
public class EmlpoyeeWage {

public static void main(String[] args) {
		
	int EMP_PART_TIME = 1;
	int EMP_FULL_TIME = 2;
	double empcheck = Math.floor(Math.random() * 10) %3;
	int WAGE_PER_HOUR = 20;
	int FULL_DAY_HOUR = 8;
	int empWage = 0;
			
	if(empcheck == EMP_PART_TIME) {
		System.out.println("Employee is Present & works Part Time");
		empWage = (WAGE_PER_HOUR * FULL_DAY_HOUR)/2;
		System.out.println("Employee Wage is: "+ empWage );
	}
	else if(empcheck == EMP_FULL_TIME) {
	System.out.println("Employee is Present & works Full Time");
	empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
	System.out.println("Employee Wage is: "+ empWage);	
	}
	else {
	System.out.println("Employee is Absent");	
		}
	}
}
