package kyun;

/*************************************************** 
 * <pre> 
 * 문자열에 포함된 문자들이 전부 유일한지를 검사하는 알고리즘을 구현하라.
 * 다른 자료구조를 사용할 수 없는 상황이라면 어떻게 하겠는가?
 * </pre> 
 ***************************************************/ 
public class StringUtil {
    
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
}
