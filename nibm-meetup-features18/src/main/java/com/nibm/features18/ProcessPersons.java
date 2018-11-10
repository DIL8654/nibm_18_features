package com.nibm.features18;
import java.util.*;
import java.util.function.*;

public class ProcessPersons {
   public static void main(String[] args) {

     List<Person> pList = new ArrayList<>();
     pList.add(new Person("Peter", 21));
     pList.add(new Person("Paul", 18));
     pList.add(new Person("Patrick", 22));
     System.out.println(pList);
     
      // Using JDK 8 Stream for filter-reduce
      pList.stream().filter(p -> p.getAge() >= 21).forEach(p -> p.sayHello());
      pList.stream().filter(p -> p.getAge() >= 21).forEach(Person::sayHello);  // Using method reference

      // Using map() to extract a specific property from the object
      Predicate<Person> adult = p -> p.getAge() >= 21;
      pList.stream().filter(adult).map(p -> p.getName()).forEach(name -> System.out.println(name));
      pList.stream().filter(adult).map(Person::getName).forEach(System.out::println);

      // Apply aggregate operation average(), sum() to an int property extracted via mapToInt()
      System.out.println(pList.stream().filter(adult).mapToInt(p -> p.getAge()).average().getAsDouble());
      System.out.println(pList.stream().filter(adult).mapToInt(Person::getAge).average().getAsDouble());
      System.out.println(pList.stream().filter(adult).mapToInt(Person::getAge).sum());
   }
}
