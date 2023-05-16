package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GenderTest {

    @Test
    public void IDCardGenderMale() {
        String gender = Gender.IDCardGender("430102201801014517");
        assertEquals("male", gender);
    }

    @Test
    public void IDCardGenderFemale() {
        String gender = Gender.IDCardGender("430102201801014066");
        assertEquals("female", gender);
    }

    @Test
    public void IDCardGenderError() {
        String gender = Gender.IDCardGender("4301022018010");
        assertNull(gender);
    }
}