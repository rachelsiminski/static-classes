package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void format_should_returnFormattedFirstAndLastName() {
        NameFormatter nameFormatter = new NameFormatter("Dr.", "Jane", "Michelle", "Doe", "Ph.D");
        String expectedFirstLast = "Doe, Jane";

        String actualFirstLast = nameFormatter.format(nameFormatter.getFirstName(), nameFormatter.getLastName());

        assertEquals(expectedFirstLast, actualFirstLast);
    }


}