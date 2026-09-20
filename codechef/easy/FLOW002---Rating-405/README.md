# FLOW002 - Rating 405

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T12:17:16.295Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            // Your code goes here
            int c = ((y*10)/z)+((x*5)/z);
            int f = (((y*10)%z)+((x*5)%z))/z;
            System.out.println(c+f);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FLOW002)