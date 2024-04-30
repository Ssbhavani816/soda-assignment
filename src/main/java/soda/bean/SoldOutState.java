package soda.bean;

public class SoldOutState implements State {
	private final SodaMachineContext context;

	public SoldOutState(SodaMachineContext context) {
		this.context = context;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Sorry, the soda machine is sold out.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("No quarter to eject.");
	}

	@Override
	public void pushSodaButton() {
		System.out.println("Sorry, the soda machine is sold out.");
	}

	@Override
	public void dispenseSoda() {
		System.out.println("Sorry, the soda machine is sold out.");
	}
}
