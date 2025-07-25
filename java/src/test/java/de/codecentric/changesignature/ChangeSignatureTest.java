package de.codecentric.changesignature;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ChangeSignatureTest {

  /**
   * Run the test and see it passing.
   *
   * <p>Use the refactoring "Change Signature" on the method {@link #concat(String, String, String)}
   * to fix the order of the parameters.
   * Recognize that the refactoring also changes arguments of the method call accordingly.
   */
  @Test
  void concat_strings() {
    String joined = concat("Fahrt", "Dampf", "Schiff");

    assertThat(joined).isEqualTo("Dampfschifffahrt");
  }

  private String concat(String suffix, String prefix, String infix) {
    String joined = String.join("", prefix, infix, suffix).toLowerCase();
    return joined.substring(0, 1).toUpperCase() + joined.substring(1);
  }

  /**
   * Run the test and see it failing.
   *
   * <p>Use the refactoring "Change Signature" on the method {@link #joinWithCommaAndSpace(String,
   * String, String)} to add a fourth parameter. Use a proper default value for the new parameter.
   *
   * <p>Fix the implementation to make the test pass.
   */
  @Test
  void join_strings_with_comma_and_space_delimiter() {
    String joined = joinWithCommaAndSpace("one", "two", "three");

    assertThat(joined).isEqualTo("one, two, three, four");
  }

  private String joinWithCommaAndSpace(String first, String second, String third) {
    return String.join(", ", first, second, third);
  }
}
