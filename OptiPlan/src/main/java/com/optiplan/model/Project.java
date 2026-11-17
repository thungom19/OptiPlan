package com.optiplan.model;

import java.util.Objects;

/**
 * Represents a project proposal that may be selected for funding.
 *
 * Costs are represented as whole currency units (for example, whole rand)
 * in the first version so they can be used directly as DP capacities.
 */
public record Project(String id, String name, int cost, int benefit) {

    public Project {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Project ID must not be blank.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Project name must not be blank.");
        }
        if (cost <= 0) {
            throw new IllegalArgumentException("Project cost must be greater than zero.");
        }
        if (benefit < 0) {
            throw new IllegalArgumentException("Project benefit must not be negative.");
        }

        id = id.trim();
        name = name.trim();
    }
}
