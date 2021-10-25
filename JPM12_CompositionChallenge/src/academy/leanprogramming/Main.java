package academy.leanprogramming;

public class Main {

    public static void main(String[] args) {
        Sofa theSofa = new Sofa("Ikea", 5);
        Room newRoom = new Room(12,13,2, theSofa);
        newRoom.enterRoom();
        newRoom.useSofa();
    }
}
