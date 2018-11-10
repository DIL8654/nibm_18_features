package com.nibm.features18;

public class MyMathBinaryOperation
{
  // Define instances of IntBinaryOperator for add, subtract, multiply and divide
  public MyIntBinaryOperator add = (a, b) -> a + b;

  public MyIntBinaryOperator sub = (a, b) -> a - b;

  public MyIntBinaryOperator mul = (a, b) -> a * b;

  public MyIntBinaryOperator div = (a, b) -> a / b;

  // Carry out the binary operation
  public int operate(int left, int right, MyIntBinaryOperator op)
  {
    return op.applyAsInt(left, right);
  }

  // Test Driver
  public static void main(String args[])
  {
    MyMathBinaryOperation op = new MyMathBinaryOperation();
    // Use pre-defined IntBinaryOperator
    System.out.println("8 + 9 = " + op.operate(8, 9, op.add));
    System.out.println("8 - 9 = " + op.operate(8, 9, op.sub));
    System.out.println("8 x 9 = " + op.operate(8, 9, op.mul));
    System.out.println("8 / 9 = " + op.operate(8, 9, op.div));
    // Use a custom IntBInaryOperator
    System.out.println("2 ^ 5 = " + op.operate(2, 5, (a, b) -> (int) Math.pow(a, b)));
  }
}