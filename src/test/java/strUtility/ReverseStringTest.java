package strUtility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    public void reverseString_MustNotBeNull() {
        ReverseString rs = new ReverseString();
        Assertions.assertNotNull(rs);
    }

    @Test
    public void reverseString_mustReturnString() {
        //arrange
        ReverseString rs = new ReverseString();
        String testString = "test";
        //act
        String result = rs.reverse(testString);
        //assert
        assert (result.getClass() == String.class);
    }

    @Test
    public void reverseString_MustReturnR_WhenInputR() {
        // Arrange
        ReverseString rs = new ReverseString();
        String expected = "R";

        // Act
        String result = rs.reverse("R");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void reverseString_MustReturnA_WhenInputA() {
        // Arrange
        ReverseString rs = new ReverseString();
        String expected = "A";

        // Act
        String result = rs.reverse("A");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void reverseString_MustReturnAR_WhenInputRA() {
        // Arrange
        ReverseString rs = new ReverseString();
        String expected = "AR";

        // Act
        String result = rs.reverse("RA");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void reverseString_MustReturnNothing_WhenInputNothing() {
        // Arrange
        ReverseString rs = new ReverseString();
        String expected = "";

        // Act
        String result = rs.reverse("");

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void reverseString_MustReturnNull_WhenInputNull() {
        // Arrange
        ReverseString rs = new ReverseString();

        // Act / Assert
        Assertions.assertThrows(NullPointerException.class, () -> rs.reverse(null));
    }

    

}

