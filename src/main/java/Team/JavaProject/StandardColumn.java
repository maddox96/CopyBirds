package Team.JavaProject;

import java.awt.*;

public class StandardColumn extends BaseColumn implements IPaintable
{
    public StandardColumn()
    {
        x = 500;
        bl = false;
        System.out.println("StandardColumn");
    }

    @Override
    public void Paint(Graphics image)
    {
        RandHeight();

        //Up column 1
        image.setColor(Color.GREEN);
        image.fillRect(x, 0, 65, h);

        //DownColumn 1
        image.setColor(Color.GREEN);
        image.fillRect(x, h + 150, 65, 500);
    }
}
