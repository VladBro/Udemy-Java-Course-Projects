package academy.leanprogramming;

public class Room {
    private double width;
    private double length;
    private double height;
    private Sofa theSofa;

    public Room(double width, double length, double height, Sofa theSofa) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.theSofa = theSofa;
    }

    public void enterRoom(){
        System.out.println("You entered the room");
    }

    public void useSofa(){
        theSofa.sitOnSofa();
    }
}
