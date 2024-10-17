# PrimeNumbers

A simple Java implementation of the Sieve of Eratosthenes algorithm to find all prime numbers up to a specified limit. This project was developed as part of a Data Structures class to understand Java programming and fundamental algorithms.

## Table of Contents
- [Description](#description)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Sample Output](#sample-output)
- [Customization](#customization)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)
- [Acknowledgments](#acknowledgments)

## Description

The PrimeNumbers project demonstrates the use of the Sieve of Eratosthenes algorithm to efficiently compute all prime numbers up to a given limit. It serves as an educational tool designed to help understand:

- Basic Java programming
- Array manipulation
- Algorithm optimization
- Mathematical concepts related to prime numbers

## Features

- Calculates all prime numbers up to a specified limit (default is 1000)
- Efficient implementation using the Sieve of Eratosthenes
- Easy-to-read and well-documented code
- Suitable for educational purposes and beginners in Java

## Prerequisites

Before running this project, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Command-line interface or IDE (e.g., Eclipse, IntelliJ IDEA)

## Installation

To set up this project locally, follow these steps:

1. Clone the repository:
   git clone https://github.com/yourusername/PrimeNumbers.git

2. Navigate to the project directory:
   cd PrimeNumbers

## Usage

### Running from the Command Line

1. Compile the program:
   javac primeNumbers/PrimeNumbers.java

2. Run the program:
   java primeNumbers.PrimeNumbers

The program will output all prime numbers up to the specified limit (default is 1000).

### Running from an IDE

1. Open the project in your preferred IDE.
2. Locate and run the `PrimeNumbers` class.

## Sample Output

The output of the program will look like this (up to the default limit of 1000):

Prime numbers up to 1000:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199 211 223 227 229 233 239 241 251 257 263 269 271 277 281 283 293 307 311 313 317 331 337 347 349 353 359 367 373 379 383 389 397 401 409 419 421 431 433 439 443 449 457 461 463 467 479 487 491 499 503 509 521 523 541 547 557 563 569 571 577 587 593 599 601 607 613 617 619 631 641 643 647 653 659 661 673 677 683 691 701 709 719 727 733 739 743 751 757 761 769 773 787 797 809 811 821 823 827 829 839 853 857 859 863 877 881 883 887 907 911 919 929 937 941 947 953 967 971 977 983 991 997

## Customization

### Changing the Limit

To change the limit up to which prime numbers are calculated, modify the `LIMIT` constant in the `PrimeNumbers` class:

public static final int LIMIT = 1000;

Replace `1000` with any positive integer value.

### Modifying the Output

You can adjust the `printAllPrimes` method to format the output differently, such as displaying primes in columns or writing them to a file.

## Screenshots

Include relevant screenshots here to demonstrate how to run the program or show sample outputs.

*Place your screenshots in this section.*

## Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch (git checkout -b feature-branch).
3. Make your changes.
4. Commit your changes (git commit -m 'Add new feature').
5. Push to the branch (git push origin feature-branch).
6. Open a Pull Request.

For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Author

**Your Name** - [yourusername](https://github.com/yourusername)

## Acknowledgments

- **Data Structures Class**: This project was developed as part of a Data Structures class to understand Java programming.
- **Sieve of Eratosthenes**: The algorithm implemented is based on the ancient Sieve of Eratosthenes method for finding prime numbers.
