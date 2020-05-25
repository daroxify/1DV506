package ea223qi_assign3;

import java.util.Random;

public class Enemies {
    private String name;
    private int XP;

    public Enemies(){

    }
    public Enemies(String name, int XP){
        setName(name);
        setXP(XP);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        if(name == null){
            return "Unknown Enemy";
        } else return name;
    }
    public int getXP(){
        if(XP < 0){
            return 0;
        } else return XP;
    }
    public void setXP(int XP){
        this.XP = XP;
    }
    public int getAttack() {        // 3 5-sidiga tärningar för attack
        Random rand = new Random();
        int sum = rand.nextInt(5)+1 + rand.nextInt(5)+1 + rand.nextInt(5)+1;
        return sum;
    }
    public int getDamage(){         // ett random number mellan 1-14.
        Random rand = new Random();
        int sum = rand.nextInt(14)+1;
        return sum;
    }
    public int getDefence(){        // 2 5sidiga tärningar

        Random rand = new Random();
        int sum = rand.nextInt(5)+1 + rand.nextInt(5)+1;
        return sum;
    }
}
