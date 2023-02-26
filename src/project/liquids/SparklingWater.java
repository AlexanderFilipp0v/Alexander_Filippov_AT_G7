package project.liquids;

public class SparklingWater extends Water {
    private Bubble[] bubbles;
    private boolean isOpened;

    public void pump(Bubbles[] bubbles) {
        this.bubbles = bubbles;
    }

    public void degas() {

        for (int i = 0; i < bubbles.length; i++) {
            if (bubbles[i] != null) {
                bubbles[i].cramp();
            }
        }
    }

    }

