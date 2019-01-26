
public class C extends B {
   public C() {  // Constructor
      super();
      System.out.println("Constructed C");
   }
   @Override
   public String toString() {
      return "This is C";
   }
}
