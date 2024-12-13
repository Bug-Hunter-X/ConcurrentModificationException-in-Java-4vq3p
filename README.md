# ConcurrentModificationException in Java

This repository demonstrates a common error in Java: the `ConcurrentModificationException`.  The exception arises when you try to modify a collection (like an ArrayList) while iterating through it using an enhanced `for` loop (or iterator).

The `ConcurrentModificationExceptionExample.java` file contains the buggy code.  The `ConcurrentModificationExceptionSolution.java` file provides a corrected version.

This is a critical issue to understand in Java development, as it can lead to unexpected crashes and unpredictable behavior.