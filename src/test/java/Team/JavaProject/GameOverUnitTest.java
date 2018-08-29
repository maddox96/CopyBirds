package Team.JavaProject;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameOverUnitTest
{
    @Test
    public void Check__checking_if_new_up_GameOver_object_indicates_over_of_a_game__expected_return_false()
    {
        GameOver gameOver = new GameOver();

        boolean ifOver = gameOver.Check();

        assertFalse(ifOver);
    }
}
