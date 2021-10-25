package academy.leanprogramming;

public class Sofa {
    private String model;
    private int numberOfPillows;

    public Sofa(String model, int numberOfPillows) {
        this.model = model;
        this.numberOfPillows = numberOfPillows;
    }

    public Sofa(){

    }

    private int getNumberOfPillows() {
        return numberOfPillows;
    }

    private String getModel() {
        return model;
    }

    private void describeTheSofa(){
        System.out.println("The sofa has " + getNumberOfPillows() + " pillows and its model is " + getModel());
    }

    public void sitOnSofa(){
        describeTheSofa();
        System.out.println("You sit on the "+ getModel() +" sofa");
    }
}
