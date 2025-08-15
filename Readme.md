# Java Mini Projects Collection

This repository contains a set of simple yet functional Java console applications, each focusing on fundamental programming concepts such as user input handling, conditionals, loops, object-oriented programming, and API integration.

## 📂 Projects Overview

### 1️⃣ Guess the Number Game
A fun interactive game where the computer randomly selects a number, and the player has to guess it within a limited number of attempts.

**Features:**
- Random number generation between a specified range (default: 1–100)
- Feedback on whether the guess is too high, too low, or correct
- Limited number of attempts per round
- Multiple rounds with cumulative scoring

**Concepts Used:** Loops, Conditionals, Random Number Generation, Input Validation

---

### 2️⃣ Student Grade Calculator
A program to calculate a student’s total marks, average percentage, and grade based on user input for marks in each subject.

**Features:**
- Accepts marks for multiple subjects with validation (0–100)
- Calculates total marks and average percentage
- Assigns grades (A–F) based on performance
- User-friendly result display

**Concepts Used:** Loops, Arithmetic Operations, Conditional Logic, Input Validation

---

### 3️⃣ ATM Simulation
An object-oriented simulation of an ATM system with separate classes for the **Bank Account** and the **ATM** interface.

**Features:**
- Withdraw, deposit, and balance check options
- Separate `BankAccount` class to store and manage account balance
- Input validation for amounts and sufficient balance checks
- Looping menu until the user chooses to exit

**Concepts Used:** Classes & Objects, Encapsulation, Methods, Loops, Input Validation

---

### 4️⃣ Currency Converter (Bonus)
A single-file Java program that fetches **real-time currency exchange rates** from an online API and converts an amount from a base currency to a target currency.

**Features:**
- User selects base and target currency codes
- Fetches latest rates from `https://api.exchangerate.host/`
- Converts the entered amount and displays results with currency codes
- Error handling for failed API requests

**Concepts Used:** HTTP Requests, JSON Parsing, API Integration, User Input

---

## 🛠 Requirements
- **Java 8 or higher**
- Internet connection (only for Currency Converter)
- For Currency Converter: `org.json` library if your environment does not support JSON parsing natively

---

## 🚀 How to Run
1. Copy the desired Java program into a `.java` file  
2. Compile using:
   ```bash
   javac FileName.java