package de.codecentric.navigation;

import static de.codecentric.navigation.Baz.STAY;

public class Navigation {

  public static void main(String[] args) {
    /*
     Start here navigating through every function call using shortcuts,
      read the sentence build by the method names along the way.
     */
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
