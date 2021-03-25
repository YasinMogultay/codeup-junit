import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstTest {

    @Test
    public void DoesStringsAreEquals (){
        String givenName = "Codeup";
        String comparingName = "CodeUp";

        Assert.assertNotEquals(givenName,comparingName);
    }

    @Test
    public void DoesArraysAreSame () {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>(); // if we assign languages to morelanguages assertSame will not throw error otherwise it will
//        languages = Arrays.asList("Turkish","English");
//        moreLanguages = Arrays.asList("Turkish","English");

        Assert.assertSame(languages,moreLanguages);
    }

    @Test
    public void DoesArrayAreEqual () {
        int [] numbers = {1,2,3};
        int [] otherNumbers = new int [3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        Assert.assertArrayEquals(numbers,otherNumbers);
    }

    @Test
    public void  DoesStatementsAreContains (){
        String language = "JavaScript";


        Assert.assertTrue(language.contains("J"));
        Assert.assertFalse(language.contains("s"));

    }


}
