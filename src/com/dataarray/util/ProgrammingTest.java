package com.dataarray.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author chenjunlin
 * @date 2019-01-04
 */
public class ProgrammingTest {
    @Test
    public void testFirstNonRepeatedCharacter() {
        assertEquals('b', Programming.firstNonRepeatedCharacter("abcdefghija"));
        assertEquals('h', Programming.firstNonRepeatedCharacter("hello"));
        assertEquals('J', Programming.firstNonRepeatedCharacter("Java"));
        assertEquals('i', Programming.firstNonRepeatedCharacter("simplest"));
    }


        @Test
        public void testFirstNonRepeatingChar() {
        assertEquals('b', Programming.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', Programming.firstNonRepeatingChar("hello"));
        assertEquals('J', Programming.firstNonRepeatingChar("Java"));
        assertEquals('i', Programming.firstNonRepeatingChar("simplest"));
    }

    @Test
    public void testGetFirstNonRepeatedChar() {
        assertEquals('b', Programming.getFirstNonRepeatedChar("abcdefghija"));
        assertEquals('h', Programming.getFirstNonRepeatedChar("hello"));
        assertEquals('J', Programming.getFirstNonRepeatedChar("Java"));
        assertEquals('i', Programming.getFirstNonRepeatedChar("simplest")); }

}
