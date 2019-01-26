public class DFSVertex
{
    String color;
    char name;
    public DFSVertex(char name)
    {
      this.name=name;
     color="white";
    }
    public String getColor()
    {
        return color;
      }
    public void setColor(String x)
    {
        color=x;
    }
      public char getName()
      {
        return name;
      }
}