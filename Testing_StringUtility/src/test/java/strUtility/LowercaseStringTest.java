package strUtility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LowercaseStringTest {

    @Test
    public void lowercaseString_MustNotBeNull() {
        LowercaseString ls = new LowercaseString();
        Assertions.assertNotNull(ls);
    }

    @Test
    public void lowercaseString_mustReturnString() {
        //arrange
        LowercaseString ls = new LowercaseString();
        String testString = "test";
        //act
        String result = ls.lowercase(testString);
        //assert
        assert (result.getClass() == String.class);
    }

    @Test
    public void lowercaseString_MustResturnr_WhenInputR() {
        LowercaseString ls = new LowercaseString();
        // Arrange
        String expected = "r";

        // Act
        String result = ls.lowercase("R");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void lowercaseString_MustResturnr_WhenInputr() {
        LowercaseString ls = new LowercaseString();
        // Arrange
        String expected = "r";

        // Act
        String result = ls.lowercase("r");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void lowercaseString_MustResturnm_WhenInputM() {
        LowercaseString ls = new LowercaseString();
        // Arrange
        String expected = "m";

        // Act
        String result = ls.lowercase("M");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void lowercaseString_MustResturnrasmus_WhenInputRASMUS() {
        LowercaseString ls = new LowercaseString();
        // Arrange
        String expected = "rasmus";

        // Act
        String result = ls.lowercase("RASMUS");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"})
    public void lowercaseString_MustReturnNumber_WhenInputNumber(String number) {
        LowercaseString ls = new LowercaseString();
        // Arrange
        String expected = number;

        // Act
        String result = ls.lowercase(number);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void lowercaseString_MustReturnNullPointer_WhenInputNull() {
        // Arrange
        LowercaseString ls = new LowercaseString();

        // Act / Assert
        Assertions.assertThrows(NullPointerException.class, () -> ls.lowercase(null));
    }

    @Test
    public void lowercaseString_MustReturnEmpty_WhenInputEmpty() {
        LowercaseString ls = new LowercaseString();
        // Arrange
        String expected = "";

        // Act
        String result = ls.lowercase("");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"!", "@", "\"", "#", "¤", "%", "&", "/", "(",")", "=", "?", "`"})
    public void lowercaseString_MustReturnSymbol_WhenInputSymbol(String symbol) {
        LowercaseString ls = new LowercaseString();
        // Arrange
        String expected = symbol;

        // Act
        String result = ls.lowercase(symbol);

        // Assert
        Assertions.assertEquals(expected, result);
    }


}
