# Enterprise Java Development 2.02

This project implements several Java programming concepts including Test-Driven Development (TDD), Java keywords validation, and an object-oriented video game character system.

## Project Overview

The solution includes:
1. TDD implementation for odd integer generation
2. Java keyword checker
3. Video game character system with inheritance and polymorphism
4. Comprehensive unit tests for all components

## Specifications Implemented

### 1. TDD: Odd Integers Method
- Implemented `getOddIntegers(int n)` method
- Returns an array of all odd integers from 1 to n
- Handles edge cases (n <= 0 returns empty array)

### 2. Java Keyword Checker
- Implemented `containsJavaKeyword(String input)` method
- Uses a complete set of Java keywords (reserved words)
- Handles word boundaries and punctuation
- Returns true if input contains any Java keyword

### 3. Video Game Character System
#### Abstract Player Class
- Properties: health, strength, lives
- Methods:
  - `decrementLive()`: Decreases lives and resets health
  - `attack(Player playerToAttack)`: Attacks another player
  - `checkHealth()`: Checks if player is dead

#### Character Classes
- **Warrior**: Additional force property and `convertToElf()` method
- **Elf**: Additional speed property
- **Wizard**: Additional spell property and `convertToElf()` method
