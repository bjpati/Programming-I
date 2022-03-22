package OU5a;

public class Punkt
{
    private int x;
    private int y;
    private String name;

    public Punkt(String name, int x, int y)
    {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public Punkt(Punkt p)
    {
        name = p.getName();
        x = p.getX();
        y = p.getY();
    }

    public String toString()
    {
        return "(" + name + " " + x + " " + y + ")";
    }

    public double distance(Punkt p)
    {
        return Math.sqrt(  Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2)  );
    }
    public boolean equal(Punkt p)
    {
        return p.getX() == x && p.getY() == y;
    }

    public String getName()
    {
        return this.name;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setX(int v)
    {
        x = v;
    }
    public void setY(int v)
    {
        y = v;
    }
}