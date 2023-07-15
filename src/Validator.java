public class Validator {

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может быть более 20 символов!");
        }
        if (!checkSimbols(login)) {
            throw new WrongLoginException("Логин содержит недопустимые символы!");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не может быть более 20 символов!");
        }
        if (!checkSimbols(password)) {
            throw new WrongPasswordException("Пароль содержит недопустимые символы!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }

    private static boolean checkSimbols(String str) {
        return str.matches("[a-zA-Z0-9_]+$");
    }
}
