package soda.bean;

public class SoldState implements State {
	private final SodaMachineContext context;

	public SoldState(SodaMachineContext context) {
		this.context = context;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a soda.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank.");
	}

	@Override
	public void pushSodaButton() {
		System.out.println("Soda dispensing...");
		context.releaseSoda();
		if (context.getSodaCount() > 0) {
			context.setState(context.getNoQuarterState());
		} else {
			context.setState(context.getSoldOutState());
		}
	}

	@Override
	public void dispenseSoda() {
		System.out.println("No soda dispensed.");
	}
}
