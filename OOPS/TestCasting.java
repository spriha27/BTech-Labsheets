public class TestCasting {
   public static void main(String[] args) {
      A a1 = new C();   // upcast
      System.out.println(a1);  // run C's toString()
      B b1 = (B)a1;     // downcast okay
      C c1 = (C)b1;     // downcast okay

      A a2 = new B();  // upcast
      System.out.println(a2);  // run B's toString()
      B b2 = (B)a2;    // downcast okay
      C c2 = (C)a2;    // compilation okay, but runtime error ClassCastException
   }
}
