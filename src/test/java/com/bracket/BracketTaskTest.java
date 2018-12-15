package com.bracket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketTaskTest {

    private BracketTask bracketTask;

    @Before
    public void setUp() throws Exception {
        this.bracketTask = new BracketTask();
    }

    @Test
    public void testCheckParenthesesOrder() {
        String type1 = "g{fsdfg}";
        String type2 = " g{f(sd)fg}s";
        String type3 = " {g{fsdfg}s";
        String type4 = "{{[cc(c)ggg]}ssss}";
        String type5 = "{{[cc(c)ggg]}ssss}{";

        assertTrue(bracketTask.checker(type1));
        assertTrue(bracketTask.checker(type2));
        assertFalse(bracketTask.checker(type3));
        assertTrue(bracketTask.checker(type4));
        assertFalse(bracketTask.checker(type5));
    }
}
