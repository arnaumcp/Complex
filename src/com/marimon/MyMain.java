package com.marimon;

import java.util.LinkedList;
import java.util.List;

public class MyMain {
  public static void main(String[] args) {
    Complex c1 = new Complex(13.3f, 43.5f);
    Complex c2 = new Complex(13.3f, 43.5f);

    System.out.println(c1 == c2);
    System.out.println(c1.equals(c2));

    List<Complex> lt = new LinkedList<Complex>();
    lt.add(c1);
    lt.add(c2);
    lt.add(c2);
    lt.add(c2);
    lt.add(c2);
    lt.add(c1);


  }
}
