package strUtility;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class CapitalizeStringTest {


    @Test
    @DisplayName("CapitalizeString method exists/can be found")
    public void capitalizeString_MustNotBeNull() {
        CapitalizeString cs = new CapitalizeString();
        Assertions.assertNotNull(cs);
    }

    @Test
    public void capitalizeString_mustReturnString() {
        //arrange
        CapitalizeString cs = new CapitalizeString();
        String testString = "test";
        //act
        String result = cs.capitalize(testString);
        //assert
        assert (result.getClass() == String.class);
    }

    @Nested
    class singleLetterTest {
        @Test
        public void capitalizeString_MustResturnR_WhenInputr() {
            CapitalizeString cs = new CapitalizeString();
            // Arrange
            String expected = "R";

            // Act
            String result = cs.capitalize("r");

            // Assert
            Assertions.assertEquals(expected, result);
        }

        @Test
        public void capitalizeString_MustResturnM_WhenInputm() {
            CapitalizeString cs = new CapitalizeString();
            // Arrange
            String expected = "M";

            // Act
            String result = cs.capitalize("m");

            // Assert
            Assertions.assertEquals(expected, result);
        }
    }

    @Test
    public void capitalizeString_MustResturnRASMUS_WhenInputrasmus() {
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
    public void capitalizeString_MustReturnNumber_WhenInputNumber(String number) {
        CapitalizeString cs = new CapitalizeString();
        // Arrange
        String expected = number;

        // Act
        String result = cs.capitalize(number);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void capitalizeString_MustReturnNullPointer_WhenInputNull() {
        // Arrange
        CapitalizeString cs = new CapitalizeString();

        // Act / Assert
        Assertions.assertThrows(NullPointerException.class, () -> cs.capitalize(null));
    }

    @Test
    public void capitalizeString_MustReturnEmpty_WhenInputEmpty() {
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
    public void capitalizeString_MustReturnSymbol_WhenInputSymbol(String symbol) {
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
