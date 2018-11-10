package com.nibm.features18;

public interface MyJ8InterfaceWithDefault
{
  void foo(); // abstract public (instance) (pre-JDK 8)

  // Default methods are marked by keyword "default"
  default void bar()
  { // public (instance) (post-JDK 8)
    System.out.println("MyJ8InterfaceWithDefault runs default bar()");
  }

  //default void bar1();
  // error: missing method body, or declare abstract
}