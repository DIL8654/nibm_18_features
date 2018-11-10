package com.nibm.features18;

@FunctionalInterface
public interface Comparator<T>
{
  // Compares its two arguments for order.
  // Returns a negative integer, zero, or a positive integer
  //   as the first argument is less than, equal to, or greater than the second.
  int compare(T o1, T o2); // public abstract
}