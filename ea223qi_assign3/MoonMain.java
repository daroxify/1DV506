package ea223qi_assign3;

public class MoonMain {
    public static void main(String[] args){

        Moon Ganymede = new Moon("Ganymede", 5262);

        System.out.println("Largest moon in the solar system is " + Ganymede.getName()
                            + " which is " + Ganymede.getDiameter()
                            + " km in diameter");
    }
}
