package utils;

public class StringUtils {
     public static boolean isNumeric(String str) {
        return str != null && str.chars().allMatch(Character::isDigit);
    }
}
