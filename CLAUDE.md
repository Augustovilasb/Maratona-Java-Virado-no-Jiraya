# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is an academic Java learning project from the DevDojo Maratona Java course. It progressively covers Java fundamentals through OOP concepts using console-based examples.

## Build & Run

No Maven/Gradle — this is a plain IntelliJ IDEA project targeting **JDK 21**.

- **Run a class**: Open in IntelliJ and run its `main()` method, or compile and run via CLI:
  ```bash
  javac -d out src/academy/devdojo/maratonajava/**/*.java
  java -cp out academy.devdojo.maratonajava.<package>.<ClassName>
  ```
- **Tests**: No test framework. Each exercise has a `*Test.java` or `*App.java` / `*Service.java` class with a `main()` method that prints results to stdout.
- **Dependencies**: Jackson 2.9.x jars are referenced in the `.iml`, but none of the current source files use them.

## Code Structure

```
src/academy/devdojo/maratonajava/
├── introducao/         # Primitives, operators, control flow
├── javacore/
│   ├── Aintroduclasses/       # Classes intro
│   ├── Bintrodumetodos/       # Methods
│   ├── Csobrecargametodos/    # Overloading
│   ├── Dconstrutores/         # Constructors
│   ├── Eblocosinicializacao/  # Init blocks
│   ├── Fmodificadorestatico/  # Static modifier
│   ├── Gassociacao/           # Association/Composition
│   ├── Hheranca/              # Inheritance
│   ├── Isobrescrita/          # Method overriding
│   ├── Jmodificadorfinal/     # Final modifier
│   └── Kenumeracao/           # Enums
└── praticando/         # Practice exercises combining multiple concepts
    ├── AssociEnumHeranca/     # Game/Studio domain (enum + inheritance + association)
    ├── associacao/            # Real-world systems: clinic, hospital, school, library, etc.
    ├── enumeracao/
    ├── loops/
    ├── metodos/
    └── modificadores/
```

Each `javacore/` section follows the pattern: `dominio/` (plain domain classes) + one or more `test/` or `teste/` classes with a `main()` to demonstrate the concept.

## Architecture Patterns

**Domain classes** live in `dominio/` subpackages — plain JavaBeans with private fields and getters/setters.

**Service/App classes** (e.g., `ClinicaService`, `HospitalApp`) contain the entry `main()` and orchestrate domain objects. They are stateless utility classes, not Spring beans.

**Enums with behavior** use private fields, constructors, and static lookup methods (e.g., `TypeGames.findGameByValue()`, `TipoCliente.tipoClientePorNomeRelatorio()`).

**Inheritance hierarchies** are shallow (one level): `Pessoa → Funcionario`, `Studio → StudioAAA / StudioIndependent`.

**Associations** use plain arrays (e.g., `Medico[]`, `Aluno[]`) rather than Collections unless the exercise explicitly introduces them.

**Initialization blocks** are demonstrated in domain classes — both static and instance blocks appear alongside constructors.

## Regras de estudo

- Nunca me dê código pronto sem eu pedir explicitamente
- Quando eu errar, me faça perguntas pra eu chegar na resposta
- Prefiro hints e dicas antes de explicações completas
- Explica usando as minhas próprias classes como exemplo
- Responde sempre em português brasileiro
