# OptiPlan

**OptiPlan** is a Java-based resource allocation engine that helps determine which projects should be funded when there is a limited budget.

The project will implement and compare three approaches to the **0/1 Knapsack Problem**:

1. **Brute Force** — examines possible project combinations to find an optimal allocation.
2. **Greedy** — makes locally attractive choices using benefit-to-cost ratios.
3. **Dynamic Programming** — solves the problem using overlapping subproblems and guarantees an optimal result.

The first version is a Core Java application. A REST API built with Spring Boot and database integration are planned for later milestones.

## Problem being solved

Given a list of proposed projects, each with a cost and an expected benefit, choose a combination that maximizes total benefit without exceeding the available budget.

\[
\text{Maximize } \sum_{i=1}^{n} b_i x_i
\]

Subject to:

\[
\sum_{i=1}^{n} c_i x_i \leq W, \qquad x_i \in \{0,1\}
\]

Where:

- `b_i` is the benefit of project `i`.
- `c_i` is the cost of project `i`.
- `W` is the available budget.
- `x_i = 1` means the project is selected; otherwise `0`.

## Technology

- Java 21 language target
- Maven
- JUnit 5
- Spring Boot and PostgreSQL (planned future milestones)

> A newer JDK can compile this project because Maven targets Java 21 bytecode. A Java 21 or newer JDK is required.

## Project structure

```text
optiplan/
├── src/
│   ├── main/
│   │   └── java/com/optiplan/
│   │       ├── algorithm/
│   │       │   └── OptimizationAlgorithm.java
│   │       ├── model/
│   │       │   ├── OptimizationResult.java
│   │       │   └── Project.java
│   │       ├── service/
│   │       ├── validation/
│   │       └── Main.java
│   └── test/
│       └── java/com/optiplan/
│           └── model/ProjectTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Getting started

### Requirements

- JDK 21 or newer
- Apache Maven 3.9 or newer
- Git

Check your tools:

```powershell
java -version
javac -version
mvn -version
```

### Build and test

From the project root:

```powershell
mvn clean test
```

### Run

```powershell
mvn package
java -cp target/classes com.optiplan.Main
```

## Current status

**Milestone 1 — Project scaffold:** created.

Implemented:
- Maven project configuration
- Initial project domain model
- Optimization result model
- Common optimization algorithm interface
- Basic application entry point
- Initial unit test

Not implemented yet:
- Brute Force optimizer
- Greedy optimizer
- Dynamic Programming optimizer
- Algorithm comparison and benchmarking
- Spring Boot API
- Database integration

## Development roadmap

1. Establish the Maven project and domain model.
2. Add input validation.
3. Implement Brute Force.
4. Implement Greedy.
5. Implement Dynamic Programming.
6. Compare results and verify correctness.
7. Add edge-case tests and performance benchmarks.
8. Document results and prepare a release.
9. Add a Spring Boot REST API.
10. Integrate PostgreSQL.

## Example scenario

The planned demonstration dataset uses a budget of **R100,000** and five project proposals:

| Project | Cost | Benefit |
|---|---:|---:|
| Infrastructure | R30,000 | 90 |
| Security | R20,000 | 70 |
| Research | R50,000 | 120 |
| Training | R10,000 | 40 |
| Development | R40,000 | 100 |

The algorithms will be compared on the same input. The application will report selected projects, total cost, total benefit, execution time, and (where applicable) the optimality gap.

## Learning and contribution notes

This is an educational portfolio project. The algorithms will be implemented independently so their correctness, complexity, and trade-offs can be studied and compared.
