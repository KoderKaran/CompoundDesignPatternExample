import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
	private ArrayList<Quackable> quackers;
	private Observable observable;

	public Flock(){
		observable = new Observable(this);
		quackers = new ArrayList<>();
	}

	public void add(Quackable quacker){
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		for (Quackable quacker : quackers) {
			quacker.quack();
			observable.notifyObservers();
		}
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
