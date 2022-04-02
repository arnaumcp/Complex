package com.marimon;

import java.util.Objects;

public class Complex {
  private  float real;
  private  float imaginary;
  public Complex(float real, float imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }
  public float getReal() {
    return real;
  }
  public float getImaginary() {
    return imaginary;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Complex complex = (Complex) o;
    return Float.compare(complex.real, real) == 0 && Float.compare(complex.imaginary, imaginary) == 0;
  }

  public int hashCode() {
    return Objects.hash(real, imaginary);
  }
}
