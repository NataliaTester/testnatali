import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LessonOne {

    final String[] actualArray = new String[]{"Natalia", "Petya", "Nazar"};

    @Test
    public void testLengthFirst() {
        int expected = 3;
        Assert.assertEquals(actualArray.length, 3, "Array size is wrong");
    }

    @Test
    public void testLengthSecond() {
        int expected = 2;
         Assert.assertNotEquals(actualArray.length, expected, "Array size is wrong");
    }

    @Test
    public void testNameExists() {
        String expectedName = "Natalia";
        Assert.assertTrue(arrayContainsName(actualArray, expectedName));
    }

    private boolean arrayContainsName(String[] actualArray, String expectedName) {
        boolean nameExists = false;
        for (int i = 0; i < actualArray.length; i++) {
            if (actualArray[i].contains(expectedName)) {
                nameExists = true;
                break;
            }
        }
        return nameExists;
    }

    @Test
    public void firstItemNatalia() {
        Assert.assertEquals(actualArray[0], "Natalia", "The first item is not Natalia");
    }

    @Test
    public void firstItemNotCorrect() {
        Assert.assertNotEquals(actualArray[0], "Petya", "The first item should be Natalia");
    }

    @Test
    public void theThirdNameIsNazar() {
        Assert.assertTrue(actualArray[2] == "Nazar");
    }

    @Test
    public void theFirthItemIsNotExists() {
        Assert.assertFalse(actualArray.length > 3);
    }

    @Test
    public void firstItemNotNull() {
        Assert.assertNotNull(actualArray[0]);
    }

    @DataProvider (name = "MethodByName")
    public Object[][] testNameExistsDataProvider(String expectedName) {

        Assert.assertTrue(arrayContainsName(actualArray, expectedName), "Array method do not included name");

        return new Object[0][];
    }

    }


