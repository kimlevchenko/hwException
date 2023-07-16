public class Main {
    public static void main(String[] args) {
        try {
            Validator.check("Ivan_8000", "Qwerty123", "Qwerty123");
            System.out.println("Данные успешно внесены!");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}