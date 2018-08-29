package Team.JavaProject;

import java.awt.*;

public class BlackColumn extends BaseColumn implements IPaintable
{
    public BlackColumn()
    {
        x = 500;
        bl = false;
        System.out.println("BlackColumn");
    }

    @Override
    public void Paint(Graphics image)
    {
        RandHeight();

        //Up column 1
        image.setColor(Color.DARK_GRAY);
        image.fillRect(x, 0, 65, h);

        //DownColumn 1
        image.setColor(Color.DARK_GRAY);
        image.fillRect(x, h + 150, 65, 500);
    }
}
