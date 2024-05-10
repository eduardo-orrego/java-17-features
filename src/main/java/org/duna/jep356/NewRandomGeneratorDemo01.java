package org.duna.jep356;

import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class NewRandomGeneratorDemo01 {
  public static void main(String[] args) {

    //Create a pseudorandom number generator L64X128MixRandom
    RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");

    //Generate 100 random numbers between 1 and 100
    IntStream.range(0, 100)
      .map(i -> rng.nextInt(101))
      .forEach(System.out::println);

  }
}
