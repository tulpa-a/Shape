import java.awt.*;

public abstract class Shape {
    String color;
    public int x;
    public int y;
    public int a;
    public int b;

    void equals(){

    }

    abstract void draw(Graphics risovalka, int x, int y, int a, int b);
}