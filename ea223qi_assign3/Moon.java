package ea223qi_assign3;

public class Moon {
    private String name;
    private int diameter;

    public Moon(String name, int diameter){
        setName(name);
        setDiameter(diameter);
    }

    public String getName(){
        if(name.equals(" ")){
            return "Unknown Moon";
        } else {
            return name;
        }
    }
    public int getDiameter(){
        if(diameter < 0){
            return 0;
        } else {
            return diameter;
        }
    }
    public void setDiameter(int diameter){
        this.diameter = diameter;
    }
    public void setName(String name){
        this.name = name;
    }
}