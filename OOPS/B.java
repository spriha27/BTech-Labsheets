public class B extends A {
   public B() {  // Constructor
      super();
      System.out.println("Constructed B");
   }
   @Override
   public String toString() {
      return "This is B";
   }
}
