# Remove Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**. Your task is to remove the vowels from the string.

 **Examples:** 

```
Input: s = "welcome to geeksforgeeks"
Output: "wlcm t gksfrgks"
Explanation: Vowels were ignored only consonents were returned in the same order.
```

```
Input: s = "what is your name ?"
Output: wht s yr nm ?

```

 **Constraints:** 
1 <= |s| <= 105
Alphabets are lower cases only

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T07:22:22.786Z  

```java
class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u'){
                ss.append(s.charAt(i));
            }
        }
        return ss.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-vowels-from-string1446/1)