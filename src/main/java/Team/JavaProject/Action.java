package Team.JavaProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Action extends JPanel implements Runnable, IPaintable
{
    private static final long serialVersionUID = 1L;


    public Action()
    {
        bl = false;
        threadA = new Thread(this);
        threadA.start();

    }

    public void Paint(Graphics g)
    {
        try
        {
            //Background
            g.setColor(Color.cyan);
            g.fillRect(0, 0, getWidth(), getHeight());

             //Columns
            for(iter = Facade.GetInstance().GetIterator(); iter.HasNext();)
            {
                IPaintable column = (IPaintable)iter.Next();
                column.Paint(g);
            }

            ground = ImageIO.read(new File("Images\\grow.png"));
            g.drawImage(ground, 0, 400, null);

            //Bird
            Facade.GetInstance().BirdPaint(g);

            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Score: " + Facade.GetInstance().getScr(), 10, 20);

            if (bl == true)
            {
                gameover = ImageIO.read(new File("Images\\go.png"));
                g.drawImage(gameover, 120, 175, null);
            }
        }
        catch (Exception ex)
        {
            Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    @SuppressWarnings("deprecated")
    public void run()
    {
        while (true)
        {
            repaint();
            for(iter = Facade.GetInstance().GetIterator(); iter.HasNext();)
            {
                IColumn column = (IColumn)iter.Next();
                column.DecrementX();
            }

            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
            }

            for(IIterator iter = Facade.GetInstance().GetIterator(); iter.HasNext();)
            {
                IColumn column = (IColumn)iter.Next();
                column.ReplayX();
            }

            Facade.GetInstance().BirdDown();
            Facade.GetInstance().CountScore();

            if (Facade.GetInstance().Check() == true)
            {
                bl = true;
                repaint();
                threadA.stop();
            }
        }
    }


    private boolean bl;
    private BufferedImage  ground, gameover;
    private Thread threadA;
    private IIterator iter;
}
