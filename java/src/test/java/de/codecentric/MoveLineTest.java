package de.codecentric;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

/**
 * <h1>Move Line</h1>
 *
 * Run the test and see it failing.
 * <p>
 * Fix the test by editing the {@link #getNumbers()} method.
 * For this, sort the lines by using only keyboard shortcuts for
 * <ul>
 * <li> move statment up</li>
 * <li> move statment down</li>
 * </ul>
 * You do not need to select text for moving a line.
 * But you can move multiple lines at a time by extending the selection.
 */
class MoveLineTest implements WithAssertions {

  @Test
  void number_strings_are_in_their_numerical_order() {
    List<String> numbers = getNumbers();

    assertThat(numbers).containsExactly(
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten"
    );
  }

  private List<String> getNumbers() {
    List<String> numbers = new ArrayList<>();
    numbers.add("three");
    numbers.add("five");
    numbers.add("nine");
    numbers.add("two");
    numbers.add("ten");
    numbers.add("six");
    numbers.add("seven");
    numbers.add("one");
    numbers.add("four");
    numbers.add("eight");
    return numbers;
  }
}
