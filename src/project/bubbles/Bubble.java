package bubbles;

public class Bubble {
    private double volume;
    private String gas;

    public double getVolume() {
        return volume;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public Bubble(String gas) {
        this.volume = 0.3d;
        this.gas = gas;
    }
    
    public void processBubble(Bubble Bubble) {
        System.out.println(Bubble.getVolume());
        System.out.println(Bubble.getGas());
    }

    public void printCramp() {
        System.out.println("Cramp");
    }
}
