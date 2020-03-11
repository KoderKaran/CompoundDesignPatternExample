public class DuckTester {
	public static void main(String[] args){
		DuckSimulator sim = new DuckSimulator();
		sim.simulate(new CountingDuckFactory());
	}
}
