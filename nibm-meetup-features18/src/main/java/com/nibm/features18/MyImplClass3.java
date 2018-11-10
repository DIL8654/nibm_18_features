package com.nibm.features18;

public class MyImplClass3 implements MyJ8InterfaceWithStatic {
  @Override
  public void foo() {
     System.out.println("MyImplClass3 run foo()");
  }

  // Test Driver
  public static void main(String[] args) {
     MyImplClass3 c = new MyImplClass3();
     c.foo();  // MyImplClass3 run foo()
     MyJ8InterfaceWithStatic.bar();  // MyJ8InterfaceWithStatic runs static bar()

     // Interface's static methods are NOT inherited (Unlike Superclass)!!!
     // MyImplClass3.bar();
     // c.bar();
           // error: cannot find symbol bar()
     // MyJ8InterfaceWithStatic c1 = new MyImplClass3();
     // c1.bar();
           // error: illegal static interface method call
  }
}