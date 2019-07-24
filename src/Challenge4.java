
public class Challenge4 {

    static	int hourlyPay = 2000;
	static int slab_hike_percentage = 10;
	static int slab1 = 40;
	static int slab2 = 50;
	static int slab3 = 60;

	public static double calculateSalary(float hoursWorked) {
		double result = 0,r1=0,r2=0,r3=0;
		double pay=0,fine=0;
		pay=hoursWorked*hourlyPay;
	    if(hoursWorked<slab1)
		{
			fine=(slab1-hoursWorked)*pay/100;
			result=pay-fine;
		}
		
		else if(hoursWorked==slab1)
		{
			result=pay;
		}
		else if(hoursWorked>slab1&&hoursWorked<slab2)
		{
			result=pay+((hoursWorked-slab1)*2000*0.1);
		}
		else if(hoursWorked>slab2&&hoursWorked<slab3)
		{
			result=pay+(10*2000*0.1);
			result=result+((hoursWorked-slab2)*2000*0.21);
		}
		else
		{
			result=pay+(10*2000*0.1);
			result=result+(10*2000*0.21);
			result=result+((hoursWorked-slab3)*2000*0.331);
		}


		/*
		 * Complete this method to calculate the salary for the week.
		 * Note: An employee is expected to work for atleast 40 hours per week,
		                    failing to do so, a fine will be incurred. 
		 * Below is how the fine is calculated
		 * Fine = (40 - hours_worked) * gross_pay / 100
		 */

		return result;
	}
	
	
	public static void main (String arg[])
	{
		double pay1 = calculateSalary(36);
		System.out.println("Pay for 36 hours work: "+pay1);
		
		double pay2 = calculateSalary(45);
		System.out.println("Pay for 45 hours work: "+pay2);
		
		double pay3 = calculateSalary(54);
		System.out.println("Pay for 54 hours work: "+pay3);
		
		double pay4 = calculateSalary(68);
		System.out.println("Pay for 68 hours work: "+pay4);
	}

}
