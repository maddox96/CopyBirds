package Team.JavaProject;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DarkColumnUnitTest
{
        @Test
        public void randHeight__set_random_column_height__height_should_be_less_than_200()
        {
            DarkColumn column = new DarkColumn();
            int excpectedMaxColumnHeight = 199;

            column.randHeight();
            int columnHeight = column.getH();
            boolean columnHeightLessThan200 = columnHeight <= excpectedMaxColumnHeight;

            assertTrue(columnHeightLessThan200);
        }

}
