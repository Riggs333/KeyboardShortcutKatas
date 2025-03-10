package de.codecentric;

public class ExtendSelectionTest {

  /**
   * Look up the shortcut for "Extend Selection" and "Shrink Selection".
   * <p>
   * Place the cursor at one of the System.out lines in the following method.
   * Play around with the extend/shrink selection and get a feeling for it.
   * <p>
   * Use this to extract the body of the "if"-block to a new method.
   * <p>
   * Also see <a href="https://www.jetbrains.com/guide/java/tips/extend-selection/">Jetbrains Guide - Extend Selection</a>
   */
  void foobar() {
    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        System.out.printf("Number %s%n", i);
        System.out.println("Hello World");
      }
    }
  }
}
