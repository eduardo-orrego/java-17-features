# java-17-features

## New Features:

- JEP 356: Enhanced Pseudo-Random Number Generators
- JEP 409: Sealed Classes

## New Preview Features:

- JEP 406: Pattern Matching for switch (Preview)

## New Incubator modules:

- JEP 414: Vector API (Second Incubator)

## Configurations to use "Preview" features in Java 17

#### Settings > Build, Execution, Deployment > Compiler > Java Compiler :

-- Project bytecode version: 17
-- Javac Options > Override compiler parameters per-module: > click "+" button > Add Module :

- Module: java-17-features
- Compilation Options: --enable-preview

#### Run/Debug Configurations > Application > [Choose Application] :

Build and Run > Modify Options > Add VM Options : --enable-preview

## Configurations to use "Incubator modules" in Java 17

#### Settings > Build, Execution, Deployment > Compiler > Java Compiler :

-- Project bytecode version: 17
-- Javac Options > Additional command line parameters: --add-modules [module package]

```
--add-modules jdk.incubator.vector
```

#### Run/Debug Configurations > Application > [Choose Application] :

-- Build and Run > Modify Options > Add VM Options> VM Options : --add-modules [module package]

```
--add-modules jdk.incubator.vector
```

### New > File > [New File Name] :

-- Enter the name "module-info.java"
-- Open file "module-info.java"
-- Enter the following lines of code:

```java
module org.duna.jep414 {
  requires jdk.incubator.vector;
  exports org.duna.jep414;
}
```