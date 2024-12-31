package core;

public class Password {


    public static boolean hasSpecialChar = false;
    public static boolean hasLowerCase = false;
    public static boolean hasUpperCase = false;
    public static boolean hasNumber = false;

    public static void password(String pass) {
        for (char character : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(character)) {
                hasSpecialChar = true;
            }
            if (Character.isLowerCase(character)) {
                hasLowerCase = true;
            }
            if (Character.isUpperCase(character)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(character)) {
                hasNumber = true;
            }
        }
        checkRequrement();
    }

    public static boolean checkRequrement(){
        if (hasSpecialChar && hasNumber && hasLowerCase && hasUpperCase) {
            return true;
        } return false;
    }
}









