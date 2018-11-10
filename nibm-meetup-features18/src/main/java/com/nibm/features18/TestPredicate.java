/*package com.nibm.features18;

import java.util.*;
import java.util.function.*;

public class TestPredicate
{
  public static void main(String[] args)
  {

    List<Person> pList = new ArrayList<>();
    pList.add(new Person("Peter", 21));
    pList.add(new Person("Paul", 18));
    pList.add(new Person("Patrick", 22));
    System.out.println(pList);

    Predicate adult = p -> ((Person) p).getAge() >= 21;
    Predicate senior = p -> ((Person) p).getAge() >= 55;
    Predicate junior = p -> ((Person) p).getAge() <= 15;
    pList.stream().filter(adult).map(Person::getName).forEach(System.out::println);
    pList.stream().filter(senior.or(junior)).map(Person::getName).forEach(System.out::println);
    pList.stream().filter(senior.and(junior)).map(Person::getName).forEach(System.out::println);
    pList.stream().filter(junior.or(p -> p.getAge >= 55)).map(Person::getName).forEach(System.out::println);
  }
}
*/