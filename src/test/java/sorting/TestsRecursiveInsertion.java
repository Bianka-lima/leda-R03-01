package sorting;
import org.junit.*;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Assert.*;
import org.junit.Before;


import sorting.*;

import sorting.variationsOfInsertionsort.RecursiveInsertionSort;


public class TestsRecursiveInsertion {

    public RecursiveInsertionSort<Integer> insertion;

    @Before
    public void setUp() {
        getInsertion();
    }

    private void getInsertion() {
        this.insertion = new RecursiveInsertionSort<>();
    }

    @Test
    public void TestNormal() {
        Integer[] array = {5, 2, 4, 1, 0, 7};
        Integer[] resp = {0, 1, 2, 4, 5, 7};
        insertion.sort(array, 0, 5);
        assertArrayEquals(array, resp);
    }

    @Test
    public void TestImpar() {
        Integer[] array = {1, 7, 3, 9, 21, 88, 10, 0, 22};
        Integer[] resp = {0, 1, 3, 7, 9, 10, 21, 22, 88};
        insertion.sort(array, 0, 8);
        assertArrayEquals(array, resp);
    }

    @Test 
    public void TestPar() {
        Integer[] array = {21, 6, 8, 0, 1, 22};
        Integer[] resp = {0, 1, 6, 8, 21, 22};
        insertion.sort(array, 0, 5);
        assertArrayEquals(array, resp);
    }

    @Test
    public void TestNull() {
        Integer[] array = {};
        Integer[] resp = {};
        insertion.sort(array, 0, 5);
        assertArrayEquals(array, resp);
    }

    @Test
    public void TestIguais() {
        Integer[] array = {1, 1, 1, 1, 1};
        Integer[] resp = {1, 1, 1, 1, 1};
        insertion.sort(array, 0, 4);
        assertArrayEquals(array, resp);
    }

    @Test
    public void TestDecrescente() {
        Integer[] array = {9, 6, 4, 2, 1, 0};
        Integer[] resp = {0, 1, 2, 4, 6, 9};
        insertion.sort(array, 0, 5);
        assertArrayEquals(array, resp);
    }

    @Test
    public void TestNegativos() {
        Integer[] array = {-3, -6, -1, -8, -2, -9};
        Integer[] resp = {-9, -8, -6, -3, -2, -1};
        insertion.sort(array, 0, 5);
        assertArrayEquals(array, resp);
    }

    @Test
    public void TestUnitario() {
        Integer[] array = {19};
        Integer[] resp = {19};
        insertion.sort(array, 0, 0);
        assertArrayEquals(array, resp);
    }

    @Test 
    public void TestDesordenado() {
        Integer[] array = {7, 1, 8, 5};
        Integer[] resp = {1, 5, 7, 8};
        insertion.sort(array, 0, 3);
        assertArrayEquals(array, resp);
    }

    @Test
    public void TestOrdenado() {
        Integer[] array = {1, 2, 3, 4, 5, 7, 7, 8, 9, 10, 1309};
        Integer[] resp = {1, 2, 3, 4, 5, 7, 7, 8, 9, 10, 1309};
        insertion.sort(array, 0, 10);
        assertArrayEquals(array, resp);
    }
}