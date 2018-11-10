package com.nibm.features18;

public interface MyJ8InterfaceWithStatic
{
  void foo(); // abstract public (instance) (pre-JDK 8)

  static void bar()
  { // public (class) (post-JDK 8)
    System.out.println("MyJ8InterfaceWithStatic runs static bar()");
  }

  //static void bar1();
  // error: missing method body, or declare abstract   
}