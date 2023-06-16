package entities;

public class Company extends Person {

	private Integer employeeQuantity;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, Integer employeeQuantity) {
		super(name, annualIncome);
		this.employeeQuantity = employeeQuantity;
	}
	
	@Override
	public double tax() {
		double tax;
		if (employeeQuantity > 10) {
			tax = getAnnualIncome() * 0.14;
		}
		else {
			tax = getAnnualIncome() * 0.16;
		}
		return tax;
	}
}
