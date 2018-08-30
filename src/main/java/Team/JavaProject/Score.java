package Team.JavaProject;

public class Score
{
    public Score()
    {
        scr = 0;
    }

    public int getScr()
    {
        return scr;
    }


    public void CountScore()
    {
        IIterator iter;
        for (iter = Facade.GetInstance().GetIterator(); iter.HasNext(); )
        {
            IColumn column = (IColumn) iter.Next();
            if (Facade.GetInstance().BirdGetX() == column.getX() + 65)
                scr++;
        }
    }


    private int scr;
}

