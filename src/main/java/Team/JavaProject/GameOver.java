package Team.JavaProject;

public class GameOver
{
    public boolean Check()
    {
        //Bird is dropped
        if (Facade.GetInstance().BirdGetY() + 45 >= 400)
            bl = true;

        if (Facade.GetInstance().BirdGetY() < 0)
            bl = true;

        for(iter = Facade.GetInstance().GetIterator(); iter.HasNext();)
        {
            IColumn column = (IColumn)iter.Next();
            if (Facade.GetInstance().BirdGetY() <= column.getH()
                    && (((Facade.GetInstance().BirdGetX() + 45) >= column.getX()))
                    && Facade.GetInstance().BirdGetX() <= (column.getX() + 65))
                        bl = true;

            if ((Facade.GetInstance().BirdGetY() + 45) >= (column.getH() + 150)
                    && ((Facade.GetInstance().BirdGetX() + 45) >= column.getX()
                    && Facade.GetInstance().BirdGetX() <= (column.getX() + 65)))
                        bl = true;
        }
        return bl;
    }


    private IIterator iter;
    private boolean bl;
}
