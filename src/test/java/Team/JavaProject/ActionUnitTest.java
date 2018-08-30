package Team.JavaProject;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ActionUnitTest
{
    @Rule
    public Timeout timeout = new Timeout(1000);

    @Test
    public void Action__creating_new_action_instance__new_object_should_be_not_null()
    {
        Action action = new Action();
        assertNotNull(action);
    }
}




