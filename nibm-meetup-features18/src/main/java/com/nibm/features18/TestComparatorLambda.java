package com.nibm.features18;

import java.util.*;

public class TestComparatorLambda
{
  public static void main(String[] args)
  {
    List<Person> pList = new ArrayList<>();
    pList.add(new Person("Peter", 21));
    pList.add(new Person("Paul", 18));
    pList.add(new Person("Patrick", 22));
    System.out.println(pList);
    // Unsorted: [Peter(21), Paul(18), Patrick(22)]

    // Sort by name: [Patrick(22), Paul(18), Peter(21)]

    // Using a Lambda Expression to create a Comparator instance
    Collections.sort(pList, (p1, p2) -> p1.getAge() - p2.getAge());
    System.out.println(pList);
    // Sort by age: [Paul(18), Peter(21), Patrick(22)]
  }
}
