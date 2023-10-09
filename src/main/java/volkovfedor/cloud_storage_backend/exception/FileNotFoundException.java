package volkovfedor.cloud_storage_backend.exception;

public class FileNotFoundException extends RuntimeException {

    private final long id;

    public FileNotFoundException(String msg, long id) {
        super(msg);
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
