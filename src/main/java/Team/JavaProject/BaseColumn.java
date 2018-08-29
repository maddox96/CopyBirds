package Team.JavaProject;

import java.util.Random;

public abstract class BaseColumn
{
    public int getX()
    {
        return x;
    }

    public int getH()
    {
        return h;
    }

    public void RandHeight()
    {
        Random rand = new Random();
        if (bl == false)
        {
            h = rand.nextInt(200);
            System.out.println(h);
            bl = true;
        }
    }

    public void DecrementX()
    {
        x--;
    }

    public void ReplayX()
    {
        if (x == -240)
        {
            x = 500;
            bl = false;
        }
    }

    protected int x;
    protected int h;
    protected boolean bl;
}
