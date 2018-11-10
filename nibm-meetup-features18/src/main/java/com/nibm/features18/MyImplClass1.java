package com.nibm.features18;

public class MyImplClass1 implements MyJ8InterfaceWithDefault {
  // Need to override all the abstract methods,
  //   but not necessarily for the default methods.
  @Override
  public void foo() {
     System.out.println("MyImplClass1 runs foo()");
  }

  // Test Driver
  public static void main(String[] args) {
     MyImplClass1 c = new MyImplClass1();
     c.foo();  // MyImplClass1 runs foo()
     c.bar();  // MyJ8InterfaceWithDefault runs default bar()
  }
}