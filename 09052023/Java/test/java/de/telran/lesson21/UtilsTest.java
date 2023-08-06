package de.telran.lesson21;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTest {
    int[] expArr = {1,2,3};
    int[] testArr;


    @BeforeEach
    void init(){
        testArr = Utils.getNumbers();
    }

    @org.junit.jupiter.api.Test
    void getNumbersTestElementTrueLength() {
        // int[] expArr = {1,2,3};
        // int[] testArr = Utils.getNumbers();
        assertEquals(2,testArr[1]);
    }


    @org.junit.jupiter.api.Test
    void getNumbersTestEquals() {
        assertEquals(3,testArr.length);
        assertArrayEquals(expArr, testArr);
    }

    @Test
    void findMaxEmpty() {
        int[] testArray = {};
        assertEquals(0,Utils.findMax(testArray));
    }

    @Test
    void findMaxTrueResult() {
        int[] testArray = {1,9,3,8,-1};
        assertEquals(9,Utils.findMax(testArray));
    }
}