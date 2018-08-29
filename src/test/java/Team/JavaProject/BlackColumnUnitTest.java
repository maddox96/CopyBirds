package Team.JavaProject;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BlackColumnUnitTest
{
        @Test
        public void RandHeight__set_random_column_height__height_should_be_less_than_200()
        {
            BlackColumn column = new BlackColumn();
            int excpectedMaxColumnHeight = 199;

            column.RandHeight();
            int columnHeight = column.getH();
            boolean columnHeightLessThan200 = columnHeight <= excpectedMaxColumnHeight;

            assertTrue(columnHeightLessThan200);
        }

}
