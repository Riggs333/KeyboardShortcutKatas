package de.codecentric;

public class ExtendSelectionTest {

  /**
   * Look up the shortcut for "Extend Selection" and "Shrink Selection".
   * 
   * Place the cursor at one of the System.out lines in the following method.
   * Play around with the extend/shrink selection and get a feeling for it.
   * 
   * Use this to extract the body of the "if"-block to a new method.
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
