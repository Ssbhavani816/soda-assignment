package soda.bean;

public class SodaMachineContext {
	private State currentState;
	private int sodaCount;

	public SodaMachineContext(State initialState, int initialSodaCount) {
		currentState = initialState;
		sodaCount = initialSodaCount;
	}

	public void insertQuarter() {
		currentState.insertQuarter();
	}

	public void ejectQuarter() {
		currentState.ejectQuarter();
	}

	public void pushSodaButton() {
		currentState.pushSodaButton();
	}

	public void dispenseSoda() {
		currentState.dispenseSoda();
	}

	public void setState(State state) {
		currentState = state;
	}

	public int getSodaCount() {
		return sodaCount;
	}

	public void releaseSoda() {
		sodaCount--;
		System.out.println("Soda dispensed. Remaining sodas: " + sodaCount);
	}

	public State getSoldOutState() {
		return new SoldOutState(this);
	}

	public State getNoQuarterState() {
		return new NoQuarterState(this);
	}

	public State getHasQuarterState() {
		return new HasQuarterState(this);
	}

	public State getSoldState() {
		return new SoldState(this);
	}
}
