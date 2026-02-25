# Palindrome Checker Application

**Use Cases UC1 – UC20 (Consolidated README)**

---

## Project Overview

This project incrementally builds a complete Palindrome Checker application using multiple programming concepts and data structure implementations.

Across UC1 to UC20, the system evolves from a basic console program to a structured, object-oriented application that compares multiple palindrome algorithms and evaluates their performance.

The core problem remains the same:
Determine whether a given string is a palindrome.

Each use case introduces a new concept, data structure, or design improvement.

---

## Actor

User

---

## Overall Flow

1. Application starts.
2. User is shown a welcome message (initial versions).
3. A string (hardcoded or user-provided) is processed.
4. The string is checked using different palindrome algorithms.
5. Results are displayed on the console.
6. Performance comparison (in advanced use cases) is shown.
7. Application exits.

---

## Use Case Summary

### UC1 – Application Entry

Basic program structure with class and `main()` method. Displays welcome message.

### UC2 – Hardcoded Palindrome Result

Checks a predefined string and prints whether it is a palindrome.

### UC3 – Reverse String Method

Uses string reversal logic to compare original and reversed string.

### UC4 – Character Array Based Check

Converts string to character array and compares characters using two-pointer technique.

### UC5 – Stack-Based Palindrome Checker

Uses a stack to reverse character order and compare with original.

### UC6 – Queue + Stack Method

Stores characters in both queue and stack and compares dequeue and pop operations.

### UC7 – Deque-Based Optimized Checker

Uses a double-ended queue to compare front and rear characters efficiently.

### UC8 – Linked List Based Checker

Stores characters in a linked list and performs comparisons across nodes.

### UC9 – Recursive Palindrome Checker

Uses recursion to compare characters from both ends moving inward.

### UC10 – Case-Insensitive & Space-Ignored Check

Preprocesses input by converting to lowercase and removing spaces before checking.

### UC11 – Object-Oriented Palindrome Service

Introduces a service class to separate logic from the main method.

### UC12 – Strategy Pattern Implementation

Implements multiple palindrome algorithms using the Strategy design pattern.
Allows dynamic selection of algorithm at runtime.

### UC13 – Performance Comparison

Measures execution time of different algorithms using system time functions.

### UC14 – Enhanced Performance Reporting

Displays comparative timing results in structured format.

### UC15 – Modularization

Separates logic into multiple classes and packages for cleaner architecture.

### UC16 – Input Validation

Adds validation for null, empty, and special-character strings.

### UC17 – Error Handling

Implements exception handling for invalid inputs.

### UC18 – Scalability Improvements

Optimizes code for large input strings.

### UC19 – Code Refactoring

Improves readability, reduces redundancy, and enhances maintainability.

### UC20 – Final Integrated System

Combines all features:

* Multiple palindrome algorithms
* Strategy-based selection
* Case-insensitive processing
* Performance comparison
* Clean modular structure

---

## Core Algorithms Implemented

* Two-pointer iterative comparison
* String reversal comparison
* Stack-based approach
* Queue-based approach
* Deque-based approach
* Linked list traversal
* Recursive method

---

## Key Concepts Covered

* Classes and Objects
* Static methods
* String handling
* Arrays and Character processing
* Stack, Queue, Deque
* Linked List
* Recursion
* Object-Oriented Design
* Strategy Design Pattern
* Performance measurement
* Exception handling
* Modular programming

---

## Data Structures Used

* String
* Character Array
* Stack
* Queue
* Deque
* Linked List

---

## Time Complexity

Most palindrome algorithms implemented in this project operate in:

O(n)

Where n is the length of the string.

---

## Final Outcome

By UC20, the application demonstrates:

* Multiple ways to solve the same logical problem
* Understanding of data structures
* Application of object-oriented principles
* Implementation of design patterns
* Performance evaluation and comparison

The project evolves from a simple console-based check to a structured, extensible palindrome checking framework.

---

If you want, I can now give you a shorter 1-page submission version in case your professor prefers very compact documentation.
