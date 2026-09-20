# CCHOCOLATES - Rating 300

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T12:04:19.422Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num-->0){
		    int a = sc.nextInt();
		    int b= sc.nextInt();
		    int c = sc.nextInt();
		    if((a>b && a<c) || (a<b && a>c)){
		        System.out.println(a);
		    }
		    else if((b>a && b<c)||(b<a && b>c)){
		        System.out.println(b);
		    }
		    else{
		        System.out.println(c);
		    }
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CCHOCOLATES)