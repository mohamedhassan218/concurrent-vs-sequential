# Synchronous Approach

This directory contains the **synchronous** version of the breakfast preparation example, implemented in Java. In this approach, tasks are executed sequentially, making it easy to follow and understand.

## Overview

In the synchronous approach, each task is performed in a strict order. The program waits for one task to finish before proceeding to the next. This is analogous to preparing breakfast in real life, where you typically wait for one item to complete cooking before starting on another. For instance, you wouldn't start frying eggs before the coffee is brewed, as you want everything to be ready around the same time. This method of operation provides clarity but can lead to inefficiencies in time management.

### How It Works

The synchronous programming model emphasizes **sequential execution**. Here’s a breakdown of how this works in the context of our breakfast preparation example:

- **Step 1: Make Coffee**  
  The first action is to make coffee. This task might involve measuring coffee grounds, boiling water, and brewing. In our example, this is simulated by a method that pauses the execution of the program for a designated time, mimicking the time it takes to brew a cup of coffee.

- **Step 2: Fry Eggs**  
  Once the coffee is ready, the next step is frying the eggs. This task requires attention, as you need to ensure the eggs are cooked properly without burning. In the synchronous model, the program will wait until the eggs are fried completely before moving on to the next step.

- **Step 3: Toast Bread**  
  Finally, the last step is to toast the bread. This is the quickest task, and after this, your breakfast is ready to be served. Again, the program execution will pause until the bread is perfectly toasted.

### Blocking Behavior

One of the key characteristics of synchronous programming is its **blocking** behavior. In this context, each task must finish completely before the next one can begin. For example, while making coffee, the program is essentially idle; it cannot do anything else until the coffee is done brewing. This blocking nature can lead to delays if any of the tasks take a long time to complete, as the overall execution time is determined by the longest-running task.

### Code Explanation

The `Breakfast` class consists of three primary methods, each simulating a task in the breakfast preparation process:

- **`makeCoffee()`**: This method simulates the coffee-making process. It uses a timed delay to represent the brewing time. During this period, no other tasks can commence, highlighting the blocking nature of the method.

- **`fryEggs()`**: This method represents frying eggs, which takes a bit longer. The same timed delay is used to illustrate how the program must wait until the frying is complete before moving on.

- **`toastBread()`**: This method simulates toasting bread, which is a quicker process. Just like the other methods, it employs a delay to signify the toasting time.

Each of these methods is called in order from the `main` method. This ensures that the tasks run sequentially, mirroring the real-life breakfast preparation process.

### When to Use Synchronous Programming

Synchronous programming is particularly suitable for scenarios where:

- **Task Order is Critical**: In situations where the sequence of tasks is essential, synchronous execution guarantees that tasks are completed in a specific order.

- **Simplicity & Clarity**: The synchronous approach is straightforward to understand and implement. Developers can easily follow the program flow without needing to manage complex states or concurrent executions.

However, it's important to note that while synchronous programming is easy to grasp, it can be inefficient in situations where tasks could run in parallel. For example, if you are waiting for a pot of water to boil for coffee, you could also be frying eggs simultaneously, thus optimizing your time. In cases where tasks are time-consuming and can be performed concurrently, asynchronous programming may be a better fit so ensure to check the other directoy in this repo.