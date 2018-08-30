package Team.JavaProject;

import java.awt.Graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Bird implements IPaintable
{
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }


    public Bird()
    {
        y = 200;
        x = 100;
    }


    public void Paint(Graphics image)
    {
        try
        {
            bird = ImageIO.read(new File("Images\\Bird.png"));
            image.drawImage(bird, x, y, null);
        }
        catch (Exception ex)
        {
            Logger.getLogger(Bird.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BirdDown()
    {
        y++;
    }

    public boolean BirdUp()
    {
        y -= 40;
        return true;
    }


    private int y;
    private int x;
    private BufferedImage bird;
}


