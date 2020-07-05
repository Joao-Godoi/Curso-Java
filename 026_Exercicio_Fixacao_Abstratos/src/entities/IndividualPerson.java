package entities;

public class IndividualPerson extends Contributors {

	private Double helthExpenditures;
	
	public IndividualPerson() {
		super();
	}
	
	public IndividualPerson(String name, Double annualIncome, Double helthExpenditures) {
		super(name, annualIncome);
		this.helthExpenditures = helthExpenditures;
	}

	public Double getHelthExpenditures() {
		return helthExpenditures;
	}

	public void setHelthExpenditures(Double helthExpenditures) {
		this.helthExpenditures = helthExpenditures;
	}

	@Override
	public double tax() {
		if (getAnnualIncome() < 20000.00) {
			return getAnnualIncome() * 0.15;
		}
		else {
			return (getAnnualIncome() * 0.25) - (helthExpenditures * 0.5);
		}
	}
}
