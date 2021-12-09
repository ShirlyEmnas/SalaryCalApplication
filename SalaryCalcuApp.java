import java.util.Scanner;
class SalaryCal
{
	public static void main(String[] args)	
	{
	  double Ansl,Mtr,Dlr,Hlr,Atd,Mtd,Ntp;
	  Scanner input = new Scanner(System.in);
	  System.out.println("\t\t\tSHIRLY EMNAS EXAM");
	  System.out.println("Enter Annual Salary:");
      Ansl = input.nextDouble();
	  System.out.println("Your Annual Salary: " + String.format("%.2f", Ansl));
		
	  Mtr = Ansl/12;
	  System.out.println("Your Monthly Rate: " + String.format("%.2f", Mtr));

    Dlr = Mtr/22;
    System.out.println("Your Daily Rate: " + String.format("%.2f", Dlr));

    Hlr = Dlr/8;
    System.out.println("Your Hourly Rate: " + String.format("%.2f", Hlr));

    Atd = 0;
    if (Ansl<= 250000){
      Atd = 0;
    }else if (Ansl >= 250000 && Ansl < 400000){
     Atd = 30000 * 0.2;
    }else if (Ansl >= 400000 && Ansl < 800000){
      Atd = 30000 + (0.25 * (Ansl - 400000));
    }else if (Ansl >= 800000 && Ansl < 20000000){
      Atd = 130000 + (0.3 * (Ansl- 800000));
    }else if (Ansl >= 250000 && Ansl < 400000){
      Atd = 490000 + (0.32 * (Ansl
      - 2000000));
    }else if (Ansl >= 250000 && Ansl < 400000){
      Atd = 2410000 + (0.35 * (Ansl - 8000000));
    }
    System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", Atd));

    Mtd = Atd/12;
    System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", Mtd));

    Ntp = Mtr-Mtd;
    System.out.println("Net Pay: " + String.format("%.2f", Ntp));
	}
}