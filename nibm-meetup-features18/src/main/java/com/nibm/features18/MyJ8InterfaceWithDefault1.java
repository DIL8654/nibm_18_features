package com.nibm.features18;

public interface MyJ8InterfaceWithDefault1 {
  // Same signature (but different implementation) as the default method in MyJ8InterfaceWithDefault
  default void bar() {   // public (instance) (post-JDK 8)
     System.out.println("MyJ8InterfaceWithDefault1 runs default bar() too!");
  }
}
