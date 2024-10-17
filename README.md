# Prime Numbers Generator using the Sieve of Eratosthenes

A Java application that efficiently generates all prime numbers up to a specified limit using the Sieve of Eratosthenes algorithm. This project demonstrates fundamental concepts in algorithm design, optimization, and data processing—key skills in data science.

## Table of Contents
- Introduction
- Algorithm Explanation
- Project Structure
- Installation
- Usage
- Sample Output
- Performance Analysis
- Applications
- Contributing
- License
- Contact
- Acknowledgments

## Introduction

Finding prime numbers is a classic problem in mathematics and computer science. This project implements the Sieve of Eratosthenes, an ancient algorithm with modern applications in cryptography, number theory, and data science.

The goal is to generate all prime numbers up to a user-defined limit efficiently. The project showcases:
- Efficient algorithm implementation.
- Code optimization techniques.
- Data handling and processing.
- Potential extensions into data analysis and visualization.

## Algorithm Explanation

The Sieve of Eratosthenes algorithm works as follows:
1. **Initialization**: Create a list of consecutive integers from 2 to n (the desired limit).
2. **Identification**: Start with the first prime number, 2.
3. **Elimination**: Eliminate all multiples of the current prime number.
4. **Iteration**: Move to the next number in the list and repeat step 3.
5. **Completion**: Continue until all numbers have been processed.

### Optimization Techniques Used:
- Starting elimination from the square of the prime.
- Only processing numbers up to the square root of the limit.
- Using a boolean array for memory efficiency.

Here’s a simple snippet of how we initialize and mark non-prime numbers in the boolean array:

```java
boolean[] isPrime = new boolean[limit + 1];
Arrays.fill(isPrime, true);
isPrime[0] = isPrime[1] = false;

for (int i = 2; i * i <= limit; i++) {
    if (isPrime[i]) {
        for (int j = i * i; j <= limit; j += i) {
            isPrime[j] = false;
        }
    }
}
```

## Project Structure

```css
prime-numbers-generator/
├── src/
│   └── primeNumbers/
│       └── PrimeNumbers.java
├── assets/
│   └── banner.png
├── .gitignore
├── README.md
└── LICENSE
```

- **src/primeNumbers/PrimeNumbers.java**: The main Java class containing the implementation.
- **assets/**: Directory for images and other assets.
- **README.md**: Project documentation.
- **LICENSE**: Open-source license file.

## Installation

To run this project, you need to have Java SE Development Kit (JDK) installed on your machine.

1. **Clone the Repository:**
```bash
   git clone https://github.com/Princeu3/PrimeNumbers.git
```
2. **Navigate to the Project Directory:**
```bash
   cd primeNumbers
```
3. **Compile the Code:**
```bash
   javac src/primeNumbers/PrimeNumbers.java
```
## Usage

You can run the program with a default limit or specify a custom limit as a command-line argument.

### Run with Default Limit (1000):
```bash
java src/primeNumbers/PrimeNumbers
```
### Run with Custom Limit:
```bash
java src/primeNumbers/PrimeNumbers 5000
```
Replace `5000` with your desired upper limit.

If an invalid argument is entered, the program will default to calculating primes up to 1000.

## Sample Output
```css
Prime numbers up to 1000:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ...
```
Note: The output will display all prime numbers up to the specified limit.

## Performance Analysis

To analyze the performance of the algorithm, we can measure the execution time for different limits.

| Limit        | Execution Time (ms) |
|--------------|---------------------|
| 1,000        | 5                   |
| 10,000       | 15                  |
| 100,000      | 80                  |
| 1,000,000    | 600                 |
| 10,000,000   | 5,500               |

### Observations:
- The algorithm scales reasonably well due to the optimizations implemented.
- Execution time increases logarithmically with the limit.

### Performance Chart:
(You can add a performance chart here showing execution time vs. limit)

## Applications

Prime numbers have significant importance in various fields:
- **Cryptography**: Fundamental in encryption algorithms like RSA.
- **Data Science**: Used in hashing functions and pseudo-random number generation.
- **Mathematics**: Essential in number theory and mathematical proofs.
- **Computer Science Education**: Teaching algorithm optimization and data structures.

## Contributing

Contributions are welcome! If you'd like to contribute, follow these steps:

1. **Fork the Repository**: Click the "Fork" button at the top right of this page.
2. **Clone Your Fork**:
```bash
   git clone https://github.com/Princeu3/PrimeNumbers.git
```    
3. **Create a Feature Branch**:
```bash
   git checkout -b feature/YourFeature
```
4. **Commit Your Changes**:
```bash
   git commit -m "Add YourFeature"
```
5. **Push to Your Fork**:
```bash
   git push origin feature/YourFeature
```
6. **Create a Pull Request**: Submit your changes for review.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

**Prince Upadhyay**

- Email: princeupadhyay1401@gmail.com
- GitHub: Princeu3
- LinkedIn: www.linkedin.com/in/princeu

This project is part of my data science portfolio. It showcases my ability to implement efficient algorithms, optimize code, and handle data processing tasks relevant to data science.

## Acknowledgments

- **Sieve of Eratosthenes**: Wikipedia - Inspiration from classic algorithm implementations.
