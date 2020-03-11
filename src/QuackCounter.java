public class QuackCounter implements Quackable {
	private Quackable duck;
	private static int numOfQuacks;
	private Observable observable;

	public QuackCounter(Quackable quacker){
		duck = quacker;
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		duck.quack();
		numOfQuacks++;
		observable.notifyObservers();
	}

	public static int getNumOfQuacks(){
		return numOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
