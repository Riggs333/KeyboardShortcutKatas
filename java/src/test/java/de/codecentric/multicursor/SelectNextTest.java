package de.codecentric.multicursor;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class SelectNextTest implements WithAssertions {

  /*
   * Run the test and see it fail.
   *
   * Transform the words:
   *  `Lynx => Shark`
   *  `Dee => Doo`
   *
   * Find and learn the shortcuts for
   * - "Add selection for next occurrence"
   * - "Unselect occurrence"
   *
   * Place the cursor on the first "Lynx" word and use the shortcut multiple times.
   * When all words a selected you can edit them with multiple cursors.
   *
   * Run the test and see it pass.
   */
  String actual = """
Baby Lynx
Dee dee, dee dee dee dee
    Baby Lynx
    Dee dee, dee dee dee dee
        Baby Lynx
        Dee dee, dee dee dee doo
            Baby Lynx
      """;

  String expected = """
Baby Shark
Doo doo, doo doo doo doo
    Baby Shark
    Doo doo, doo doo doo doo
        Baby Shark
        Doo doo, doo doo doo doo
            Baby Shark
      """;

  @Test
  void testString() {
    assertThat(actual).isEqualTo(expected);
  }
}
