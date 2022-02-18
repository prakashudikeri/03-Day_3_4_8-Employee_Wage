public class EmlpoyeeWage {

	public static int NUM_OF_WORKING_DAYS = 20, MAX_HRS_IN_MONTH = 100;
	public static void main(String[] args) {
		int totalWorkingDays = 0;
	while (totalWorkingDays < NUM_OF_WORKING_DAYS  && EmpCalculation.totalEmpHrs < MAX_HRS_IN_MONTH) {
		totalWorkingDays++;
			System.out.println("For DAY"+totalWorkingDays);
		EmpCalculation emp = new EmpCalculation();
		emp.empCheck();
		DailyWage wage = new DailyWage();
		wage.dailyWageCalculation();
		wage.totalEmpWage();
		}
			System.out.println("Employee's total working Hours = "+EmpCalculation.totalEmpHrs);
			System.out.println("Total Wage of employee in a month = "+DailyWage.totalEmpWage);
	}
}
class EmpCalculation 
{
	public static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	public static int empHrs, totalEmpHrs = 0;
	public void empCheck() {
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		switch(empCheck) {
		case IS_FULL_TIME:
			System.out.println("Employee is present and worked full-time");
			empHrs = 8;
			break;
		case IS_PART_TIME:
			System.out.println("Employee is present and worked part-time");
			empHrs = 4;
			break;		
		default:
			System.out.println("Employee is absent");
			empHrs = 0;
		}
		totalEmpHrs = totalEmpHrs + empHrs;
	}
}
class DailyWage{
	public static final int EMP_RATE_PER_HOUR = 20;
	static int totalEmpWage = 0;
	int totalDailyWage;
	public void dailyWageCalculation() {
	totalDailyWage = EmpCalculation.empHrs * EMP_RATE_PER_HOUR;
	System.out.println("Daily employee wage is "+totalDailyWage);
	}
	public void totalEmpWage() {
		totalEmpWage = totalEmpWage + totalDailyWage; 
	}	
}
