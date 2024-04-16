package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    //#1: Assert that brackets in the correct order, "[]", return true
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //#2: Brackets in the wrong order, "][", return false
    @Test
    public void bracketsInWrongOrderReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //#3: Must have one opening and one closing bracket, "Launch[Code]", return true
    @Test
    public void mustHaveTwoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //#4: An empty string is balanced, "", return true
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //#5: Brackets at start okay, "[]LaunchCode", return true
    @Test
    public void bothBracketsAtStartReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //#6: Can have brackets around term, "[LaunchCode]", return ture
    @Test
    public void bracketsAroundTermReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //#7: Only has one bracket, "[LaunchCode", return false
    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //#8: Bracket mixed into character in wrong order, "Launch]Code[", return false
    @Test
    public void bracketsInTermWrongOrderReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    //#9: One bracket is not balanced, "[", return false
    @Test
    public void oneBracketIsUnbalancedReturnFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //#10: too many brackets, "Laun[chCode]]", return
    @Test
    public void tooManyBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Laun[chCode]]"));
    }

    //#11: whitespace are ignored, "Launch [Code] ", return
    @Test
    public void whitesSpacesIgnoredReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch [Code] "));
    }

    //#12: has no brackets, "LaunchCode", return
    @Test
    public void noBracketsRetrunTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    //#13: an empty test to test the tests are working, should pass test
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}