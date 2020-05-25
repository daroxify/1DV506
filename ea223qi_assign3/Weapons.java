package ea223qi_assign3;

public class Weapons {
    private String sort;
    private int power;

    public Weapons(String sort, int power){
        setSort(sort);
        setPower(power);
    }

    public String getSort(){
        if(sort.equals("")){
            return "Unknown weapon";
        } else return sort;
    }
    public void setSort(String sort){
        this.sort = sort;
    }
    public int getPower(){
        if(power < 0){
            return 0;
        } else return power;
    }
    public void setPower(int power){
        this.power = power;
    }
}
