# convert-string-to-lowercase

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T18:09:27.667Z  

```java
class Solution {
    static String toLower(String s) {
        // code here
        StringBuilder string_builder = new StringBuilder(s);
                for(int u = 0; u<s.length(); u++){
                    if(s.charAt(u) >= 'A' && s.charAt(u) <= 'Z'){
                        string_builder.setCharAt(u, (char) (s.charAt(u) + 32));
                    }
                }
                return string_builder.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/convert-string-to-lowercase/1)