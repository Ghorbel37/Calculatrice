# Calculatrice

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

## Run it

With a JDK installed:

```bash
javac Main.java Operation.java
java Main
```
