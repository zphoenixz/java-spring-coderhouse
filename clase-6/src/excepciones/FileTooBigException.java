package excepciones;

import java.io.IOException;

public class FileTooBigException extends IOException {
    public FileTooBigException(String errorMessage) {
        super(errorMessage);
    }
}
