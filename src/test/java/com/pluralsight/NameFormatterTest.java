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

    @Test
    public void format_should_returnFormattedFullName() {
        NameFormatter nameFormatter = new NameFormatter("Dr.", "Jane", "Michelle", "Doe", "Ph.D");
        String expectedFullName = "Dr. Jane Michelle Doe, Ph.D";

        String actualFullName = nameFormatter.format(nameFormatter.getPrefix(), nameFormatter.getFirstName(), nameFormatter.getMiddleName(), nameFormatter.getLastName(), nameFormatter.getSuffix());

        assertEquals(expectedFullName, actualFullName);
    }


}