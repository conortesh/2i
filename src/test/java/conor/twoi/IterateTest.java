package conor.twoi;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IterateTest
{
    @Test
    void test()
    {
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        expected.add(expectedList);

        expectedList = new ArrayList<Integer>();
        expectedList.add(3);
        expectedList.add(6);
        expectedList.add(9);
        expectedList.add(12);
        expected.add(expectedList);

        expectedList = new ArrayList<Integer>();
        expectedList.add(4);
        expectedList.add(8);
        expectedList.add(12);
        expectedList.add(16);
        expected.add(expectedList);

        Assertions.assertEquals(expected, MyIterator.iterateAll(2,6));

    }



}
