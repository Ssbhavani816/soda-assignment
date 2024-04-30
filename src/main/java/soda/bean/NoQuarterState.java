package soda.bean;

public class NoQuarterState implements State {
	private final SodaMachineContext context;

	public NoQuarterState(SodaMachineContext context) {
		this.context = context;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter.");
		context.setState(context.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("No quarter to eject.");
	}

	@Override
	public void pushSodaButton() {
		System.out.println("Please insert a quarter first.");
	}

	@Override
	public void dispenseSoda() {
		System.out.println("Please insert a quarter first.");
	}
}
