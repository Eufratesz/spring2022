package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return username.length() > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.equals(password2) && password1.length() >= 8;
    }

    public boolean isValidEmail(String email) {
        int atChar = email.indexOf("@");
        int dotChar = email.indexOf(".");
        return ((atChar + 1 < dotChar) && (dotChar < email.length()-1) && (atChar != 0));
        //A @ után legyen a . , a . nem lehet az utolsó, az @ nem lehet az első!
    }

    public boolean isValidEmailOther(String email){
        int atChar = email.indexOf('@');
        String domain = email.substring(atChar+1); //az @ karakter utáni substring
        int dotChar = domain.indexOf('.');
        return atChar> 0  && dotChar > atChar && dotChar < email.length() -1;
    }
}

