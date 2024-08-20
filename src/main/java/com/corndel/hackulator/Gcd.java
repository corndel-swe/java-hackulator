package com.corndel.hackulator;

public class Gcd {

  /**
   * Works out the greatest common divisor of two numbers Uses the euclidean algorithm:
   * https://www.youtube.com/watch?v=JUzYl1TYMcU e.g. gcd(8, 12) => 4
   */
  static int gcd(int a, int b) {
    // while (a != 0) {
    //   var temp = a;
    //   a = b % a;
    // }
    // return b;

    // TODO: Remove answer
    while (a != 0) {
      var temp = a;
      a = b % a;
      b = temp;
    }
    return b;
  }
}
