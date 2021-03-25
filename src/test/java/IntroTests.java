import static  org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntroTests {

    private String name;
    private String age;

    @Before
    public void setUp() {
        this.name = "Yasin";
        this.age = "26";
    }

    @Test
    public void testNotSame() {
        assertNotSame(name, age);
    }

    @Test
    public void getFullName_GivenValidNames_ReturnsFullName() {

        String firstName = "Yasin";
        String lastName = "Mogultay";
        String delimeter = "";
        String expectedFullName = "Yasin Mogultay";

        Assert.assertEquals(expectedFullName,getFullName(firstName, lastName,delimeter));
    }

    @Test
    public void getFullName_GivenEmptyString_DoesNotReturnFullName () {

        String firstName = "Yasin";
        String lastName = "";
        String delimiter = " ";
        String expectedFullName = "YasinMogultay ";

        Assert.assertNotEquals(expectedFullName, getFullName(firstName,lastName,delimiter));

    }

    @Test
    public void getFullName_GivenNullValue_DoesNotReturnFullName () {
        String firstName = "Yasin";
        String lastName = null;
        String delimiter = " ";


        Assert.assertNull(getFullName(firstName,lastName,delimiter));

    }

    @Test (expected = IllegalArgumentException.class)
    public void getFullName_GivenInvalidArguments_ThrowsIllegalArgumentException () {
        String firstName = "Yasin";
        String lastName = null;
        String delimiter = " ";


        Assert.assertNull(getFullName(firstName,lastName,delimiter));
    }

    @Test
    public void getFullName_GivenNumbersInString_DoesNotReturnFullName () {
        String firstName = "111111";
        String lastName = "Mogultay";
        String delimiter = " ";

        String unexpectedFullName = firstName + delimiter + lastName;

        Assert.assertNotEquals(unexpectedFullName, getFullName(firstName,lastName,delimiter));

    }

    public static String getFullName(String firstName, String lastNAme,String delimeter) {

        if (firstName == null || lastNAme == null || delimeter ==null)
            throw new IllegalArgumentException();
        if (firstName.equals("") || delimeter.equals("") ||  lastNAme.equals(""))
            throw new IllegalArgumentException();

        return firstName + delimeter + lastNAme;
    }
}
