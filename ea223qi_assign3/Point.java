package ea223qi_assign3;

public class Point {

    private double dist;
    private int x, y;


    public Point(){
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public boolean isEqualTo(Point p) {
        if (p.getX() == x && p.getY() == y){
            return true;
        } else return false;
        }

    public double distanceTo(Point p){
        int deltaX = x - p.getX();
        int deltaY = y - p.getY();

        dist = Math.sqrt(Math.pow(deltaX, 2.0) + Math.pow(deltaY, 2.0));
        dist = Math.round(dist * 1000);
        dist = (dist / 1000);

        return dist;
    }


    public void move(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public void moveToXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public String toString(){

        return "(" + getX() + ","+ getY() + ")";
    }

}
