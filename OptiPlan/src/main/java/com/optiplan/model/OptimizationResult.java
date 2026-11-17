package com.optiplan.model;

import java.util.List;

/**
 * Immutable summary of an allocation produced by an optimization algorithm.
 */
public record OptimizationResult(
        String algorithmName,
        List<Project> selectedProjects,
        int totalCost,
        int totalBenefit,
        long executionTimeNanos
) {
    public OptimizationResult {
        if (algorithmName == null || algorithmName.isBlank()) {
            throw new IllegalArgumentException("Algorithm name must not be blank.");
        }
        if (selectedProjects == null) {
            throw new IllegalArgumentException("Selected projects must not be null.");
        }
        if (totalCost < 0 || totalBenefit < 0 || executionTimeNanos < 0) {
            throw new IllegalArgumentException("Result totals and execution time must not be negative.");
        }

        selectedProjects = List.copyOf(selectedProjects);
    }
}
