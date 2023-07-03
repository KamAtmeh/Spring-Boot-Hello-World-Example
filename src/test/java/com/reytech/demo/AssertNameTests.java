package com.reytech.demo;
import static org.junit.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.reytech.demo.Personne;

@SpringBootTest
class AsserNameTests {

  @Test
  void groupedAssertions() {
    Personne pers = new Personne("Nassur", "Moumadi");

    assertAll("personne", () -> assertEquals("Nassur", pers.getFirstName()),
        () -> assertEquals("Moumadi", pers.getLastName()));
  }

}
