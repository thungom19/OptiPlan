package com.optiplan;

import com.optiplan.model.Project;

import java.util.List;

/**
 * Application entry point for the OptiPlan command-line prototype.
 */
public class Main {

    public static void main(String[] args) {
        List<Project> projects = List.of(
                new Project("P01", "Infrastructure", 30_000, 90),
                new Project("P02", "Security", 20_000, 70),
                new Project("P03", "Research", 50_000, 120),
                new Project("P04", "Training", 10_000, 40),
                new Project("P05", "Development", 40_000, 100)
        );

        int budget = 100_000;

        System.out.println("==================================");
        System.out.println("          OPTIPLAN");
        System.out.println("  Intelligent Resource Allocation");
        System.out.println("==================================");
        System.out.printf("Available budget: R%,d%n%n", budget);
        System.out.println("Available projects:");

        for (Project project : projects) {
            System.out.printf(
                    "%s | %-16s | Cost: R%,d | Benefit: %d%n",
                    project.id(),
                    project.name(),
                    project.cost(),
                    project.benefit()
            );
        }

        System.out.println();
        System.out.println("Project scaffold is ready.");
        System.out.println("Optimization algorithms will be added in the next milestones.");
    }
}
