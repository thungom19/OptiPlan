package com.optiplan.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void createsProjectWithValidValues() {
        Project project = new Project("P01", "Infrastructure", 30_000, 90);

        assertEquals("P01", project.id());
        assertEquals("Infrastructure", project.name());
        assertEquals(30_000, project.cost());
        assertEquals(90, project.benefit());
    }

    @Test
    void trimsIdAndName() {
        Project project = new Project(" P01 ", " Infrastructure ", 30_000, 90);

        assertEquals("P01", project.id());
        assertEquals("Infrastructure", project.name());
    }

    @Test
    void rejectsBlankId() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Project(" ", "Infrastructure", 30_000, 90)
        );
    }

    @Test
    void rejectsNonPositiveCost() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Project("P01", "Infrastructure", 0, 90)
        );
    }

    @Test
    void rejectsNegativeBenefit() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Project("P01", "Infrastructure", 30_000, -1)
        );
    }
}
