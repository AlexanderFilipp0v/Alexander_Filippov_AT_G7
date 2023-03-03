package homework.day7.playground.processors;

import homework.day7.playground.essence.Flyable;
import homework.day7.playground.utils.DirectionGenerator;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        runFlyable(flyable, DirectionGenerator.generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }
}
