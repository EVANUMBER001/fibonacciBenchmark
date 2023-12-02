# Fibonacci Calculation Benchmark

This project includes Java code for calculating Fibonacci numbers using both recursive and iterative approaches. It also provides a benchmarking utility to measure the performance of each method.

## Table of Contents
- [Introduction](#introduction)
- [Methods](#methods)
- [Usage](#usage)
- [Performance Benchmark](#performance-benchmark)
- [Results](#results)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The purpose of this project is to compare the efficiency of recursive and iterative algorithms for calculating Fibonacci numbers. The Java code in the `Utilities` class provides two methods, `recursiveFib` and `iterativeFib`, for Fibonacci number calculations.

## Methods

### `recursiveFib(int n)`
- Calculates the Fibonacci number at position `n` using a recursive algorithm.
- Base case: Returns `n` if `n` is less than or equal to 1.
- Recursive case: Calls itself with `n - 1` and `n - 2` and adds the results.

### `iterativeFib(int n)`
- Calculates the Fibonacci number at position `n` using an iterative algorithm.
- Base case: Returns `n` if `n` is less than or equal to 1.
- Iterative case: Uses a loop to iteratively calculate Fibonacci numbers up to `n`.

## Usage

To use the Fibonacci calculation methods, you can incorporate the `Utilities` class into your Java project. The `main` method in the class demonstrates how to use the methods and includes a performance benchmark.

## Performance Benchmark

The project includes a performance benchmark that measures the time taken for both recursive and iterative Fibonacci calculations. It uses `System.nanoTime()` to record the elapsed time.

## Results

The benchmark results are printed in a table, showing the Fibonacci number position (`x`), the calculated Fibonacci number, and the time taken for both recursive and iterative approaches in nanoseconds.

## Contributing

Contributions are welcome! If you have ideas for improvements or would like to add features, please feel free to fork the repository and submit a pull request.


