package academy.leanprogramming;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString(){
        return "Player{name='"+ this.name +"', hitPoints=" +this.hitPoints+ ", strength=" +this.strength+
                ", weapon='" +this.weapon+ "'}";
    }

    @Override
    public List<String> write() {
        List<String> x = new ArrayList<String>();
        x.add(this.name);
        x.add(String.valueOf(this.hitPoints));
        x.add(String.valueOf(this.strength));
        x.add(this.weapon);
        return x;
    }

    @Override
    public void read(List savedValues) {
        if(savedValues != null && savedValues.size() != 0){
            this.name = (String) savedValues.get(0);
            this.hitPoints = (Integer) savedValues.get(1);
            this.strength = (Integer) savedValues.get(2);
            this.weapon = (String) savedValues.get(3);
        }
    }
}
