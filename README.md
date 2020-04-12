# Thread creation

This is a small project to illustrate how we can create threads in Java. Let's keep in mind that we can create threads in two ways:
1. By implementing the interface Runnable
2. By extending the Thread class. The demo follows this approach.

## Thieves and police

In order to explain threads implementation we present a hypothetical case in which 2 different thieves try to open a safe-box before to be caught by the police. The thieves will have 10 seconds to find the security code before the police arrives.

## Implementation

- `Safe`: abstraction of the safe-box. For the purpose of this example it also contains that the max value of the security code is `9999`.
- `ThiefThread`: abstract class which extends `Thread` and represents a Thief.
- `AscendingThiefThread`: concrete class that extends `ThiefThread`. It will try to guess the security code inserting numbers in ascending order.
- `DescendingThiefThread`: concrete class that extends `ThiefThread`. It will try to guess the security code inserting numbers in descending order.
- `PoliceThread`: abstraction of a police which extends from `Thread`. It counts 10 seconds, if any of the thieves were able to open the safe-box before the police finishes, so they are caught.
- `ThreadCreation`: main class. Creates the safe-box and sets its password. Creates the 3 threads, and starts then. (If there's a confusion in the way how the threads are started it would be recommended to check `polymorphism` concept).

Notes: 
- This is a very basic implementation, there are better ways to stop or interrupt threads.
- This is inspired in "Java Multithreading, Concurrency & Performance Optimization" Udemy course.