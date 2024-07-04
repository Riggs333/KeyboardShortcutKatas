package de.codecentric.navigation;

import static de.codecentric.navigation.When.YESTERDAY;

public enum Baz {
  STAY("oh, I", believe());

  private static Object believe() {
    return in(YESTERDAY);
  }

  private static Object in(String when) {
    return null;
  }

  Baz(String s, Object believe) {

  }

}
