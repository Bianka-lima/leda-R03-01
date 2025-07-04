import static org.junit.*;

import org.junit.Test;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import sorting.*;
import variationsOfInsertionsort.*;
import sorting.variationsOfInsertionsort.RecursiveInsertionSort;


public class TestsRecursiveInsertion {

    public RecursiveInsertionSort<Integer> insertion;

    @Test
    public void TestNormal() {
        T[] array = {5, 2, 4, 1, 0, 7};
        T[] resp = {0, 1, 2, 4, 5, 7};

        assertArrayEquals(resp, insertion.sort(array, 0, 5));
    }
}
