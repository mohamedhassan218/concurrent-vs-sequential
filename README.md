# Asynchronous vs. Synchronous Programming in Java

This repository demonstrates the differences between **synchronous** & **asynchronous** programming using a breakfast preparation analogy. It contains two Java programs:

- **sync/**: A synchronous version where tasks are completed one after another.
- **async/**: An asynchronous version where tasks are run concurrently using `CompletableFuture`.


## Purpose

This repository serves as a learning resource for understanding the concepts of synchronous and asynchronous programming in simple example and with measuring the time taken to do the two approaches on the same use-case.


## Usage

1. Clone the repository:
   ```bash
   git clone git@github.com:mohamedhassan218/concurrent-vs-sequential.git
   ```

2. Navigate to the **sync** or **async** directory:
    ```bash
    cd concurrent-vs-sequential/Sync
    ```
    or
    ```bash
    cd concurrent-vs-sequential/Sync
    ```

3. Compile and run the main class `Breakfast`:
    ```bash
    javac Breakfast.java
    java Breakfast
    ```


## Acknowledgments

I would like to acknowledge the inspiration drawn from the work presented in C# from Microsoft. Java & C# offer powerful tools for implementing asynchronous programming, and the core ideas remain consistent across different programming environments. You can read the whole article from [here](https://learn.microsoft.com/en-us/dotnet/csharp/asynchronous-programming/).