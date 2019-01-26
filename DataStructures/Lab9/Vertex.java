public class Vertex
{
    boolean value;
    char name;
    public Vertex(char name)
    {
      this.name=name;
     this.value=true;
    }
    public boolean getValue()
    {
        return value;
      }
    public void setValue(boolean x)
    {
        value=x;
      }
      public char getName()
      {
        return name;
      }
}