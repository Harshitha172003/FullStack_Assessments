package Day2_Day3;

class Authenticator {
    private class Validator {
        boolean validate(String password) {
            return "admin123".equals(password);
        }
    }

    public void login(String password) {
        Validator validator = new Validator();
        if (validator.validate(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Incorrect Password");
        }
    }

    public static void main(String[] args) {
        Authenticator auth = new Authenticator();
        auth.login("admin123");
    }
}
