package Team.JavaProject;

public class ColumnFactory
{
    public IColumn BuildColumn(String columnType)
    {
        if (columnType == null)
            return null;
        if (columnType.equalsIgnoreCase("BLACK"))
            return new BlackColumn();
        else if (columnType.equalsIgnoreCase("STANDARD"))
            return new StandardColumn();
        else if (columnType.equalsIgnoreCase("LIGHT"))
            return new LightColumn();

        return null;
    }
}
