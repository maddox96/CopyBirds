package Team.JavaProject;

public class ColumnsRepository implements IContainer
{
    private ColumnFactory columnfactory = new ColumnFactory();
    private IColumn column1 = columnfactory.BuildColumn("BLACK");
    private IColumn column2 = columnfactory.BuildColumn("STANDARD");
    private IColumn column3 = columnfactory.BuildColumn("LIGHT");
    public IColumn columnstab[] = {column1 , column2, column3};

    public IIterator GetIterator() {
        return new NameIterator();
    }


    private class NameIterator implements IIterator
    {
        private int index;

        public boolean HasNext()
        {
            if(index < columnstab.length)
                return true;
            return false;
        }

        public Object Next()
        {
            if(this.HasNext())
                return columnstab[index++];
            return null;
        }
    }
}

