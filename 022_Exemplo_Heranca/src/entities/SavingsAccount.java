package entities;

public class SavingsAccount extends Account {
	
	private Double interesrRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interesrRate) {
		super(number, holder, balance);
		this.interesrRate = interesrRate;
	}

	public Double getInteresrRate() {
		return interesrRate;
	}

	public void setInteresrRate(Double interesrRate) {
		this.interesrRate = interesrRate;
	}
	
	public void updateBalance() {
		balance += balance * interesrRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
