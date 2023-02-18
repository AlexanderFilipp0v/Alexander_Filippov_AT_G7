package baseTask;

public class TrainMethodsObjects {
	
	public void processMouse(Mouse Mouse) {
		System.out.println(Mouse.getName());
		System.out.println(Mouse.getAge());
		Mouse.printMouseDetails();		
	}
	
	public void processSauce(Sauce Sauce) {
		System.out.println(Sauce.getName());
		System.out.println(Sauce.getColor());
		Sauce.printSauceDetails();
	}
	
	public void processBee(Bee Bee) {
		System.out.println(Bee.getGender());
		System.out.println(Bee.getWeight());
		Bee.printBeeDetails();
	}
	
	public void processObstacle(Obstacle Obstacle) {
		System.out.println(Obstacle.getDescription());
		System.out.println(Obstacle.getSeverity());
		Obstacle.printObstacleDetails();		
	}
	
	public void processPineapple(Pineapple Pineapple) {
		System.out.println(Pineapple.getGrade());
		System.out.println(Pineapple.getHeatCapacity());
		Pineapple.printPineappleDetails();
	}
	
	

}
