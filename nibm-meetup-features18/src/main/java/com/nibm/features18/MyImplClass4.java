package com.nibm.features18;

public class MyImplClass4 implements MyJ8InterfaceWithStatic {
  @Override
  public void foo() {
     System.out.println("MyImplClass4 run foo()");
  }

  //@Override  // error: static methods cannot be annotated with @Override
  public static void bar() {
     System.out.println("MyImplClass4 run bar()");
  }

  // Test Driver
  public static void main(String[] args) {
     MyImplClass4 c = new MyImplClass4();
     c.foo();  // MyImplClass3 run foo()

     MyJ8InterfaceWithStatic.bar();  // MyJ8InterfaceWithStatic runs static bar()
     MyImplClass4.bar(); // MyImplClass4 run bar()
     c.bar();            // MyImplClass4 run bar()
  }
}
