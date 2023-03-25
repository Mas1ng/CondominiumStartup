package exception;

import model.Condominio;

public class CondominioduplicatedNameException extends RuntimeException {
    public CondominioduplicatedNameException(String s) {
        super(s);
        System.out.println("Duplicated User");
    }
}
