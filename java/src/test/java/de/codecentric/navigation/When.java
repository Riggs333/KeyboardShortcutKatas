package de.codecentric.navigation;

import java.util.Base64;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

public class When implements WithAssertions {

  public static final String YESTERDAY = "You're done! - Great job!";

  /*
   * Hopefully, you recognized the lyrics of the song. ;-)
   * Guess the name of the band, assign it to the variable "yourGuess" in the test and run it.
   */
  @Test
  void name_the_band() {
    String yourGuess = "--insert band name here--";

    assertThat(yourGuess.toLowerCase().getBytes())
        .withFailMessage("Wrong guess, try again")
        .isIn(
            Base64.getDecoder().decode("YmVhdGxlcw=="),
            Base64.getDecoder().decode("dGhlIGJlYXRsZXM=")
        );
  }
}
