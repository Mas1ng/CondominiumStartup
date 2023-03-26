package exception;

public class ValenciasDuplicatedNameException extends RuntimeException {
    public ValenciasDuplicatedNameException(String s) {
        super(s);
        System.out.println("Duplicated User");
    }

}
