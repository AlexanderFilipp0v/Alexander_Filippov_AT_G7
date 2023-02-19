package baseTask;

public class TrainMethodsObjectsRunner {

	public static void main(String[] args) {
		
		
		Mouse mouseFirst = new Mouse("Мышка-норушка", 2);
		mouseFirst.printMouseDetails();
		
		Sauce firstSauce = new Sauce("British curry","red");
		firstSauce.printSauceDetails();
		
		Bee firstBee = new Bee("male", 5);
		firstBee.printBeeDetails();
		
		Obstacle firstObstacle = new Obstacle("наезд на пешехода", "серьезное");
		firstObstacle.printObstacleDetails();
		
		Pineapple firstPineapple = new Pineapple("Fresh", 2000f);
		firstPineapple.printPineappleDetails();
		
		
		
		TrainMethodsObjects first = new TrainMethodsObjects();
		first.processMouse(mouseFirst);
		first.processSauce(firstSauce);
		first.processBee(firstBee);
		first.processObstacle(firstObstacle);
		first.processPineapple(firstPineapple);
		

	}

}
