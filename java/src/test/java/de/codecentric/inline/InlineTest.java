package de.codecentric.inline;

import java.util.function.Supplier;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

/**
 * Run the test to see it passing.
 *
 * Inline as much as you can using your IDE keyboard shortcuts.
 * But do not delete the method "practice"!
 *
 * After each inline refactoring step, run the test.
 *
 * Also, use ALT + Enter a lot to let IntelliJ simplify code:
 * - remove unnecessary/dead code
 * - do calculations
 * - simplify code
 *
 * Hint: When inlining a method, do not hesitate to let IntelliJ remove the method.
 *
 * Do not forget to run the test regularly to verify that you did not break anything.
 */
class InlineTest implements WithAssertions {

  boolean n() {
    return false;
  }

  private int e = 2;

  class Inline {

  private int a() {
    return 5;
  }

  public int practice() {
    int i = 2;
    int s = 2 - i;
    int j = b() - a() + i;
    int m = f(3);
    int l = m + j;
    if (n()) {
      m += 56;
    }
    Supplier<Integer> k = () -> l - new Inline().c(e);

    int q = 1 - new O().create().p;
    return 42 + k.get() + q + Extensions.h(7) + s;
  }
    private int f(int G) {
      return -3 + G;
    }

    private int c ( int d){
      return d;
    }

    private int b() {
      return 5;
    }

  }
  class Extensions {

    public static int h(int that) {
      return that - 7;
    }
  }

  class O {

    int p = 1;

    public O create() {
      return new O();
    }
  }

  @Test
  void test_answer() {
    int actualAnswer = new Inline().practice();

    assertThat(actualAnswer).isEqualTo(42);
  }
}
