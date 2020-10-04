package strUtility;

public class ReverseString {

    public String reverse(String str) {

        String newStr = "";
        char[] strArr = str.toCharArray();

        for (int i = strArr.length - 1; i >= 0; i--)
            newStr += strArr[i];

        return newStr;
    }
}

