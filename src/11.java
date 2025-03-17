package com.example;
import java.util.*;
public class RandomGenerator {
private static final Random random = new Random();
public static int getRandom(int min, int max) {
return random.nextInt((max - min) + 1) + min;
}
}