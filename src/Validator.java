import java.util.regex.Pattern;

public class Validator {

    private static final Pattern PATTERN = Pattern.compile("[a-zA-Z0-9_]{0,20}+$");

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException {
        if (login.length() > 20 || !PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("Логин содержит недопустимые символы или длинее 20 знаков!");
        }
        if (password.length() > 20 || !PATTERN.matcher(password).matches()) {
            throw new WrongPasswordException("Пароль содержит недопустимые символы или длинее 20 символов!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }
}
