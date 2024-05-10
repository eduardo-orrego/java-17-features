# java-16-features

## New Features:
JEP 356: Enhanced Pseudo-Random Number Generators

## New Preview Features:
JEP 406: Pattern Matching for switch (Preview)

## Configurations to use "Preview" features in Java 16

#### Settings > Build, Execution, Deployment > Compiler > Java Compiler :

-- Project bytecode version: 16
-- Javac Options > Override compiler parameters per-module: > click "+" button > Add Module :
- Module: java-15-features
- Compilation Options: --enable-preview

Run/Debug Configurations > Application > [Choose Application] :

Build and Run > Modify Options > Add VM Options : --enable-preview