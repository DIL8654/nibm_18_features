package com.nibm.features18;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class TestSequentialParallelStreams
{
  public static void main(String[] args)
  {
    List<Integer> lst = new ArrayList<>();
    for (int i = 1; i <= 100; ++i)
    {
      lst.add(i);
    }
    System.out.println(lst);

    Stream<Integer> sequentialStream = lst.stream();
    Stream<Integer> parallelStream = lst.parallelStream();

    sequentialStream.filter(i -> (i % 10) == 0).forEach(i -> System.out.println("sequential: " + i)); // outputs sequentail

    parallelStream.filter(i -> (i % 10) == 0).forEach(i -> System.out.println("parallel: " + i)); // outputs non-sequentail
  }
}