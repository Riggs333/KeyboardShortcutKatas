package de.codecentric.multicursor;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class ColumnSelectAddingTest implements WithAssertions {

  /**
   * Run the test and see it fail.
   *
   * <p>Create several cursors inside the string field "actual" using the
   *
   * <ul>
   *   <li>"block selection mode" (Eclipse) [Alt] + [Shift] + [A]
   *   <li>"column selection mode" (IntelliJ).
   * </ul>
   *
   * Transform each line to match the expected String making the test pass.
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
      1 => apple
      2 => orange
      3 => pear
      4 => kiwi
      5 => mango
      6 => grape
      7 => dragonfruit
      """;

  @Test
  void testString() {
    assertThat(actual).isEqualTo(expected);
  }
}
