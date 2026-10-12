# Calculatrice

[![Build](https://github.com/Ghorbel37/Calculatrice/actions/workflows/build.yml/badge.svg)](https://github.com/Ghorbel37/Calculatrice/actions/workflows/build.yml)

A small Java calculator written for a practical session ("TP") of an Agile & DevOps course. The code is intentionally simple: the exercise was about working as a team with Git (branches, merges and resolving conflicts) rather than about the calculator itself.

## What it does

`Main` runs a fixed example with `a = 2` and `b = 3` and prints the result of each operation:

```
Bienvenue
Le résultat de 2 * 3 = 6
2 - 3 = -1
2 + 3 = 5
Au revoir
2 / 3 = 0.6666666666666666
Au revoir
Bonsoir
```

`Operation` provides the four operations:

| Method | Returns |
|---|---|
| `addition(x, y)` | `x + y` |
| `soustraction(x, y)` | `x - y` |
| `multiplier(x, y)` | `x * y` |
| `division(x, y)` | `x / y` as a `double`, or `0` when `y` is `0` |

## Build and run

The project uses Maven through the wrapper, so you only need a JDK 17 or later:

```bash
./mvnw verify                     # compile, run the tests, build target/calculatrice.jar
java -jar target/calculatrice.jar
```

On Windows, use `mvnw.cmd` instead of `./mvnw`.

## Tests

JUnit 5 tests in `src/test/java`:

- `OperationTest` checks each operation, including negative numbers, a decimal division and division by zero
- `MainTest` runs `Main` and checks that it prints the output shown above

## Continuous integration

Every push to `main` and every pull request runs the build on GitHub Actions: compile, test, package, run the jar. The jar is attached to each run as an artifact.

## Project layout

```
src/main/java/   Main.java, Operation.java
src/test/java/   OperationTest.java, MainTest.java
pom.xml          Maven build (Java 17, JUnit 5)
mvnw, mvnw.cmd   Maven wrapper
```

## License

[MIT](LICENSE)
