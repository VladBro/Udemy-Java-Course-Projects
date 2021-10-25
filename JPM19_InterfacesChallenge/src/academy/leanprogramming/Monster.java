package academy.leanprogramming;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    String name;
    int hitPoints;
    int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString(){
        return "Monster{name='"+ this.name +"', hitPoints=" +this.hitPoints+ ", strength=" +this.strength+ "}";
    }

    @Override
    public List write() {
        List<String> x = new ArrayList<String>();
        x.add(this.name);
        x.add(String.valueOf(this.hitPoints));
        x.add(String.valueOf(this.strength));
        return x;
    }

    @Override
    public void read(List savedValues) {
        if(savedValues != null && savedValues.size() != 0){
            this.name = (String) savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
}
