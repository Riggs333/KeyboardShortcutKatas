package de.codecentric;

class ExtendSelectionTest {

  /**
   * Look up the shortcut for "Extend Selection" and "Shrink Selection".
   *
   * <h1>Eclipse:</h1>
   *
   * <ul>
   *   <li>Select Enclosing Element ([Alt] + [Shift] + [↑])
   *   <li>Restore Last Selection ([Alt] + [Shift] + [↓])
   * </ul>
   *
   * <h1>IntelliJ:</h1>
   *
   * <ul>
   *   <li>Extend Selection ([Ctrl] + [W])
   *   <li>Shrink Selection ([Ctrl] + [Shift] + [W])
   * </ul>
   *
   * <p>Place the cursor at one of the System.out lines in the following method. Play around with
   * the extend/shrink selection and get a feeling for it by pressing it multiple times.
   *
   * <p>Use the different selections to extract different parts to a new method (Refactoring:
   * Extract Method). For Example: The body of the if-block, the body of the for-loop, the
   * if-expression.
   *
   * <p>Also see <a href="https://www.jetbrains.com/guide/java/tips/extend-selection/">Jetbrains
   * Guide - Extend Selection</a>
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
