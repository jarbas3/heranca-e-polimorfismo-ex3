package entities;

public class Individual extends Person {

	private Double healthExpenses;
	
	public Individual() {
		super();
	}	
	
	public Individual(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double tax() {
		double tax;
		if (getAnnualIncome() < 20000.0) {
			tax = getAnnualIncome() * 0.15 - getHealthExpenses() * 0.50; 
		}
		else {
			tax = getAnnualIncome() * 0.25 - getHealthExpenses() * 0.50;
		}
		return tax;
	}
}
