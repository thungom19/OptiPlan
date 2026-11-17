package com.optiplan.algorithm;

import com.optiplan.model.OptimizationResult;
import com.optiplan.model.Project;

import java.util.List;

/**
 * Common contract implemented by each project-allocation algorithm.
 */
public interface OptimizationAlgorithm {

    /**
     * Selects projects whose combined cost does not exceed the budget.
     *
     * @param projects available project proposals
     * @param budget   maximum amount that may be spent
     * @return the allocation produced by this algorithm
     */
    OptimizationResult optimize(List<Project> projects, int budget);
}
