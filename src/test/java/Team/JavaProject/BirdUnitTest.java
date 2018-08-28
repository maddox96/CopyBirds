package Team.JavaProject;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

public class BirdUnitTest
{
    @Rule
    public Timeout time = new Timeout(1000);

    @Test
    public void getX__creating_new_bird_object__new_bird_getX_should_return_100()
    {
        Bird bird = new Bird();
        int expectedX = 100;

        int x = bird.getX();

        assertNotNull(bird);
        assertEquals(expectedX, x);
    }
}
