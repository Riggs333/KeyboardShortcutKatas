package de.codecentric.navigation;

import static de.codecentric.navigation.Baz.STAY;

public class Navigation {

  /**
   * Start here navigating through every method call or reference
   * using shortcut "Go to Declaration or Usages".
   *
   * Read the sentence that is made up by the names along the way.
   * If you get lost or stuck use the shorcuts for "back" or "forward".
   */
  public static void main(String[] args) {
    __.yesterday();
  }

  public static Foo now() {
    return it -> looks("as").though();
  }

  private static Bar looks(String as) {
    return new Bar();
  }

  static class Bar {

    public void though() {
      they_re();
    }

  }

  static class __ {

    public static void yesterday() {
      ___.all();
    }
  }

  private static void they_re() {
    Here.to(STAY);
  }

}
