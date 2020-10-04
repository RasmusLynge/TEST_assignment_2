package strUtility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class CapitalizeStringTest {


    @Test
    public void reverseString_MustNotBeNull() {
        CapitalizeString cs = new CapitalizeString();
        Assertions.assertNotNull(cs);
    }

    @Test
    public void reverseString_MustResturnR_WhenInputr() {
        CapitalizeString cs = new CapitalizeString();
        // Arrange
        String expected = "R";

        // Act
        String result = cs.capitalize("r");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void reverseString_MustResturnM_WhenInputm() {
        CapitalizeString cs = new CapitalizeString();
        // Arrange
        String expected = "M";

        // Act
        String result = cs.capitalize("m");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void reverseString_MustResturnRASMUS_WhenInputrasmus() {
        CapitalizeString cs = new CapitalizeString();
        // Arrange
        String expected = "RASMUS";

        // Act
        String result = cs.capitalize("rasmus");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"})
    public void reverseString_MustReturnNumber_WhenInputNumber(String number) {
        CapitalizeString cs = new CapitalizeString();
        // Arrange
        String expected = number;

        // Act
        String result = cs.capitalize(number);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void reverseString_MustReturnNullPointer_WhenInputNull() {
        // Arrange
        CapitalizeString cs = new CapitalizeString();

        // Act / Assert
        Assertions.assertThrows(NullPointerException.class, () -> cs.capitalize(null));
    }

    @Test
    public void reverseString_MustReturnEmpty_WhenInputEmpty() {
        CapitalizeString cs = new CapitalizeString();
        // Arrange
        String expected = "";

        // Act
        String result = cs.capitalize("");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"!", "@", "\"", "#", "¤", "%", "&", "/", "(",")", "=", "?", "`"})
    public void reverseString_MustReturnSymbol_WhenInputSymbol(String symbol) {
        CapitalizeString cs = new CapitalizeString();
        // Arrange
        String expected = symbol;

        // Act
        String result = cs.capitalize(symbol);

        // Assert
        Assertions.assertEquals(expected, result);
    }


    @Disabled("Ikke nødvendig. Bare for at kunne have et assumeTrue eksempel")
    @Test
    public void testOnlyRunsWindows10(){
        assumeTrue(System.getProperty("os.name").equalsIgnoreCase("Windows 10"));
        // will continue if OS is windows
        System.out.println("TEEEST");
    }


}
