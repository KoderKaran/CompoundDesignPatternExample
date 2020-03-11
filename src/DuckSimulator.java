public class DuckSimulator {
	public void simulate(AbstractDuckFactory duckFactory){
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseToDuckAdaptor(new Goose());
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		Flock flockOfMallards = new Flock();
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		flockOfDucks.add(flockOfMallards);
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		System.out.println("Duck Simulator");
		System.out.println("Whole flock simulation:");
		simulate(flockOfDucks);
		System.out.println("The ducks quacked " + QuackCounter.getNumOfQuacks() + " times!");
	}

	private void simulate(Quackable quacker){
		quacker.quack();
	}

}
