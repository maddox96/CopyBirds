package Team.JavaProject;

import java.awt.*;

public final class Facade
{
    private static Facade _instance = null;


    public static synchronized Facade GetInstance()
    {
        if (_instance == null)
            _instance = new Facade();
        return _instance;
    }


    private Facade()
    {
        colRepository = new ColumnsRepository();
        bird = new Bird();
        gameover1 = new GameOver();
        score = new Score();
    }

    public IIterator GetIterator()
    {
        return colRepository.GetIterator();
    }

    public void BirdDown()
    {
        bird.BirdDown();

    }

    public void CountScore()
    {
        score.CountScore();
    }

    public boolean Check()
    {
        return gameover1.Check();
    }

    public int getScr()
    {
        return score.getScr();
    }


    public void BirdPaint(Graphics g)
    {
        bird.Paint(g);
    }

    public int BirdGetY()
    {
        return bird.getY();
    }

    public int BirdGetX()
    {
        return bird.getX();
    }

    public void BirdUp()
    {
        bird.BirdUp();
    }


    private ColumnsRepository colRepository;
    private Bird bird;
    private GameOver gameover1;
    private Score score;
}
