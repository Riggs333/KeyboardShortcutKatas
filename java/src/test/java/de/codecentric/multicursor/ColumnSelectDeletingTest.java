package de.codecentric.multicursor;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class ColumnSelectDeletingTest implements WithAssertions {

  /**
   * Run the test and see it fail.
   *
   * <p>In each line of the "actual" string: Delete the wrong characters.
   *
   * <p>Run the test to see it pass.
   */
  String actual =
      """
      1 apjefple
      2 orj*!ange
      3 pej&Var
      4 kijQtwi
      5 majp@ngo
      6 grj%9ape
      7 drjlKagonfruit
      """;

  String expected =
      """
      1 apple
      2 orange
      3 pear
      4 kiwi
      5 mango
      6 grape
      7 dragonfruit
      """;

  @Test
  void testString() {
    assertThat(actual).isEqualTo(expected);
  }
}
