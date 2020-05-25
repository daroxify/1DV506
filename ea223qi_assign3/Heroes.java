package ea223qi_assign3;

import java.util.ArrayList;
import java.util.Random;

public class Heroes {
    private String name;
    private int XP;
    private ArrayList<Weapons> wep;
    private int numOfWep = 1;
    private int sum;

    public Heroes() {
        wep = new ArrayList<Weapons>();
    }

    public Heroes(String name, int XP) {
        setName(name);
        setXP(XP);
        wep = new ArrayList<Weapons>();
    }

    public String getName() {
        if(name.equals("")){
            return "Unknown hero";
        } else
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXP() {
        if(XP < 0){
            return 0;
        } else
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }
    public void addWeapons(Weapons w){
        wep.add(w);
        numOfWep = wep.size();
    }
    public Weapons[] getWeapons(){
        Weapons[] w = new Weapons[1];
            w[0] = wep.get(0);
            return w;
    }

    public int getAttack() {        // 3 6sidiga tärningar
        Random rand = new Random();
        int sum = rand.nextInt(6)+1 + rand.nextInt(6)+1 + rand.nextInt(6)+1;
        return sum;
    }
    public int getDefence(){        // 3 6-sidiga tärningar
        Random rand = new Random();
        int sum = rand.nextInt(6)+1 + rand.nextInt(6) +1 + rand.nextInt(6)+1;
        return sum;
    }
    public int getDamage(){     // damage beror på vad för vapen hero har.
        Random rand = new Random();
        if(getWeapons()[0].getPower() == 1){    // eftersom denna är fist så är det slumptal
            int sum = rand.nextInt(3) +2;   // mellan 2-4
            return sum;
        } else if (getWeapons()[0].getPower() == 2){    // 2 6sidiga tärningar
            int sum = rand.nextInt(6)+1 + rand.nextInt(6)+1;
            return sum;
        } else if  (getWeapons()[0].getPower() == 3){ // 3 6sidiga tärningar
            int sum = rand.nextInt(6)+1 + rand.nextInt(6)+1 + rand.nextInt(6)+1;
            return sum;
        } else return 0;
    }
}
