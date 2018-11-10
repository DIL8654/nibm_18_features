package com.nibm.features18;

public class MyImplClass2 implements MyJ8InterfaceWithDefault, MyJ8InterfaceWithDefault1 {
  @Override
  public void foo() {
     System.out.println("MyImplClass2 runs foo()");
  }

  @Override
  public void bar() {
     System.out.println("MyImplClass2 runs overridden bar()");
  }
  // bar() exists in both interfaces.
  // MUST override, or
  //    error: class MyImplClass2 inherits unrelated defaults for bar()
  //    from types MyJ8InterfaceWithDefault and MyJ8InterfaceWithDefault1

  public static void main(String[] args) {
     MyImplClass2 c = new MyImplClass2();
     c.foo();   // MyImplClass2 runs foo()
     c.bar();   // MyImplClass2 runs overridden bar()
  }
}