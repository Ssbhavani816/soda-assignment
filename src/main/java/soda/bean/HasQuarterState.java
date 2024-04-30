package soda.bean;

public class HasQuarterState implements State {
	private final SodaMachineContext context;

	public HasQuarterState(SodaMachineContext context) {
		this.context = context;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert another quarter.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned.");
		context.setState(context.getNoQuarterState());
	}

	@Override
	public void pushSodaButton() {
		System.out.println("You pushed the soda button.");
		context.setState(context.getSoldState());
		context.pushSodaButton();
	}

	@Override
	public void dispenseSoda() {
		System.out.println("Please push the soda button.");
	}
}