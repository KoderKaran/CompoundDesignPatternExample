public class Quackologist implements Observer {
	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist just observed a " + duck + " quack!");
	}
}
