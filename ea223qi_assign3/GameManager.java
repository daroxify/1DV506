package ea223qi_assign3;

import java.util.Random;

public class GameManager {
    public static void main (String[] ars){

        Random rand = new Random();
        int setWep = rand.nextInt(3) +1;
        int round = 1;

        Heroes hero = new Heroes("Lord Will", 50);
        Enemies enemy = new Enemies("Prince Senap", 30 );

        Weapons nonwep = new Weapons("No Weapon", 1);
        Weapons sallad = new Weapons("a sallad", 2);
        Weapons knife = new Weapons("a knife", 3);

        if(setWep == 1){            // slumpar fram ett vapen åt hero
            hero.addWeapons(nonwep);
        } else if (setWep == 2){
            hero.addWeapons(sallad);
        } else if(setWep == 3){
            hero.addWeapons(knife);
        }

        System.out.println("The game has begun!");
        System.out.println(hero.getName() + " has " + hero.getXP()
        + "XP and " + hero.getWeapons()[0].getSort() + " to fight with.");
        System.out.println(enemy.getName() + " has " + enemy.getXP()
        + " XP and his fists to fight with.");
        System.out.println("");

        do{
            //hero.getAttack();
            //enemy.getDefence();
            //enemy.getAttack();
            //hero.getDefence();
            //hero.getDamage();
            //enemy.getDamage();

            if(hero.getAttack() < enemy.getDefence()){      // när hero attackerar
                System.out.println("Round: " + round);
                System.out.println(hero.getName() + " gives his all, but " + enemy.getName() + " dodjes.");
            } else if (hero.getAttack() > enemy.getDefence()){
                System.out.println("Round: " + round);
                System.out.println(hero.getName() + " gives " + enemy.getName() + " a powerful blow!" );
                enemy.setXP(enemy.getXP() - hero.getDamage());
            }
            if(enemy.getAttack() < hero.getDefence()){      // när enemy attackerar
                System.out.println(enemy.getName() + " tries his best, but " + hero.getName() + " dodjes");
            } else if (enemy.getAttack() > hero.getDefence()){
                System.out.println(enemy.getName() + " manages to hit " + hero.getName());
                hero.setXP(hero.getXP() - enemy.getDamage());
            } else if (enemy.getAttack() == hero.getDefence()){
                System.out.println(enemy.getName() + "is still alive!");
            }
            System.out.println();
            round++;

        }while (enemy.getXP() > 0 && hero.getXP() > 0);     // tills någon av dem dör

        if(hero.getXP() <= 0){
            System.out.println(hero.getName() + " was defeated");
        } else if (enemy.getXP() <= 0) {
            System.out.println(enemy.getName() + " was defeated");
        }


    }

}
