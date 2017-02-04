package kyun;

public class StringUtil {
    
    /**
     * <pre> 
     * 문자열에 포함된 문자들이 전부 유일한지를 검사하는 알고리즘을 구현하라.
     * 다른 자료구조를 사용할 수 없는 상황이라면 어떻게 하겠는가?
     * </pre> 
     * @param str
     * @return
     */
    public static boolean isUniqueChar(String str) {
        boolean[] exist = new boolean[256];
        
        for (int index = 0; index < str.length(); index++) {
            int val = str.charAt(index);
            if (exist[val]) {
                return false;
            }
            
            exist[val] = true;
        }
        
        return true;
    }
    
    /**
     * <pre> 
     * 문자열을 뒤집는 reverse(char* str) 함수를 구현하라.
     * </pre> 
     * @param str
     * @return
     */
    public static String reverse(String str) {
        int len = str.length();
        char[] temp = new char[len];
        
        for (int index = 0; index != len; index++, len--) {
            temp[len-1] = str.charAt(index); 
            temp[index] = str.charAt(len-1); 
        }
        
        return String.valueOf(temp);
    }
}
