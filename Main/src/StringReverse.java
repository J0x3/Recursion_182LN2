import java.lang.String;

class StringReverse {
    String recursiveReverse(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return recursiveReverse(str.substring(1)) + str.charAt(0);
    }

    String iterativeReverse(String s) {
        StringBuilder strBuild = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; --i)
            strBuild.append(s.charAt(i));
        return strBuild.toString();
    }
}
