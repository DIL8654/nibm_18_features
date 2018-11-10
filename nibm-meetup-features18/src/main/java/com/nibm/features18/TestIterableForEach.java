package com.nibm.features18;

import java.util.*;
import java.util.function.*;

public class TestIterableForEach
{
  public static void main(String[] args)
  {
    List<Person> pList = new ArrayList<>();
    pList.add(new Person("Peter", 21));
    pList.add(new Person("Paul", 60));
    pList.add(new Person("Patrick", 15));
    System.out.println(pList);

    // Pre-JDK 8: Using for-each loop
    for (Person p : pList)
    {
      System.out.println(p);
      System.out.println(p.getName());
    }

    // Pre-JDK 8: Using Iterator
    Iterator<Person> iter = pList.iterator();
    while (iter.hasNext())
    {
      Person p = iter.next();
      System.out.println(p.getName());
    }

    // JDK 8 Iterable's forEach(): with Consumer anonymous inner class
    pList.forEach(new Consumer<Person>()
    {
      @Override
      public void accept(Person p)
      {
        p.sayHello();
      }
    });

    // JDK 8 Iterable's forEach(): with Lambda Expression
    pList.forEach(p -> System.out.println(p));
    pList.forEach(p -> System.out.println(p.getName()));
    pList.forEach(p -> p.sayHello());

    // JDK Iterable's forEach(): with Method Reference
    pList.forEach(System.out::println);
    pList.forEach(Person::sayHello);
  }
}