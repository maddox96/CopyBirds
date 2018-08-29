package Team.JavaProject;

import java.awt.*;

public class LightColumn extends BaseColumn implements IPaintable
{
    public LightColumn()
    {
        x = 500;
        bl = false;
        System.out.println("LightColumn");
    }

    @Override
    public void Paint(Graphics image)
    {
        RandHeight();

        //Up column 1
        image.setColor(Color.LIGHT_GRAY);
        image.fillRect(x, 0, 65, h);

        //DownColumn 1
        image.setColor(Color.LIGHT_GRAY);
        image.fillRect(x, h + 150, 65, 500);
    }
}
