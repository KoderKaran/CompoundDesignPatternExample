public class GooseToDuckAdaptor implements Quackable {
	private Observable observable;
	private Goose goose;

	public GooseToDuckAdaptor(Goose newGoose) {
		observable = new Observable(this);
		goose = newGoose;
	}
	@Override
	public void quack() {
		goose.honk();
		notifyObservers();
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
