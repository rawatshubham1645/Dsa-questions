package Evaluation_Problems.Taxation;

interface Taxation
{
	// write code here
	public double calculateTax();

}

class SalariedPeople implements Taxation
{
	// write code here
	int annualIncome;

	public SalariedPeople(int annualIncome)
	{
		this.annualIncome = annualIncome;
	}

	public double calculateTax()
	{
		if (annualIncome <= 250000)
		{
			return 0.0;
		}
		else if (annualIncome > 250000 && annualIncome <= 500000)
		{
			return 0.1 * (annualIncome - 250000);
		}
		else if (annualIncome > 500000 && annualIncome <= 1000000)
		{
			return 0.2 * (annualIncome - 500000) + 0.1 * (250000);
		}
		else if (annualIncome > 1000000 && annualIncome <= 10000000)
		{
			return 0.3 * (annualIncome - 1000000) + 0.2 * (500000) + 0.1 * (250000);
		}
		else 
		{
		    return (double)750000;
		}
	}
}

class BusinessPeople implements Taxation
{

	
	int sales;
	int Tpurchase;
	int Oexpenses;

	public BusinessPeople(int sales, int Tpurchase, int Oexpenses)
	{
		this.sales = sales;
		this.Tpurchase = Tpurchase;
		this.Oexpenses = Oexpenses;
	}

	public double calculateTax()
	{
		double profits = sales - (Tpurchase + Oexpenses);

		if (profits <= 500000)
		{
			return 0.0;
		}
		else if (profits > 500000 && profits <= 1500000)
		{
			return 0.1 * (profits - 500000);
		}
		else if (profits > 1500000 && profits <= 5000000)
		{
			return 0.22 * (profits - 1500000) + 0.1 * (1000000);
		}
		else if (profits > 5000000)
		{
			return 0.32 * (profits - 5000000) + 0.22 * (1500000) + 0.1 * (1000000);
		}
		else 
		{
		    return (double) 1250000;
		}
		
	}
}

