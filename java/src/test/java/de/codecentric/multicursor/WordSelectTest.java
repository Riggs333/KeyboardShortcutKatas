package de.codecentric.multicursor;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class WordSelectTest implements WithAssertions {

  /**
   * Warning: This exercise only seems to work in IntelliJ.
   *
   * <p>Run the test and see it fail.
   *
   * <p>Transform each line to this pattern: <code>String apple = "apple"</code>;
   *
   * <p>Note you can copy/paste columns of words. Run the test to see it pass.
   */
  String actual =
      """
      1 apple
      2 orange
      3 pear
      4 kiwi
      5 mango
      6 grape
      7 dragonfruit
      """;

  String expected =
      """
      String apple = "apple";
      String orange = "orange";
      String pear = "pear";
      String kiwi = "kiwi";
      String mango = "mango";
      String grape = "grape";
      String dragonfruit = "dragonfruit";
      """;

  @Test
  void testString() {
    assertThat(actual).isEqualTo(expected);
  }
}
