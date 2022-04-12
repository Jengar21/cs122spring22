package assignments.extraquestions;

public class Commission extends Hourly {
	double totalSalesMade;
	double comRate;
	
	public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate)
	{
		super (eName, eAddress, ePhone, socSecNumber,rate);
		comRate = rate;
	}
	
	public void addSales( double totalSaleMade)
	{
		totalSalesMade += totalSaleMade;
		
	}
	
	public double pay() {
		double payment = super.pay() + totalSalesMade + comRate;
		
		totalSalesMade = 0;
		return payment;
		
	}
	
	public String toString() {
		String result = super.toString();
		result += "Total Sales: "+ totalSalesMade;
		return result;
	}

}
