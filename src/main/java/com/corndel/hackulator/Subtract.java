package com.corndel.hackulator;

public class Subtract {

  // Returns the positive difference (or zero)
  // subtract(5, 2) => 3
  // subtract(3, 7) => 4
  // subtract(5, 5) => 0
  // subtract(-2, 4) => 6

  static int subtract(int x, int y) {
    // if (x < y) {
    //   return y - x;
    // }
    //
    // if (y < x) {
    //   return x - y;
    // }
    //
    // throw new Error("Is this reachable?");

    if (x < y) {
      return y - x;
    }

    return x - y;
  }
}
