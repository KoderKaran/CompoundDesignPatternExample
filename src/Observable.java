import java.util.ArrayList;

public class Observable implements QuackObservable {
	ArrayList<Observer> observers;
	QuackObservable duck;

	public Observable(QuackObservable newDuck){
		duck = newDuck;
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs:observers){
			obs.update(duck);
		}
	}
}
