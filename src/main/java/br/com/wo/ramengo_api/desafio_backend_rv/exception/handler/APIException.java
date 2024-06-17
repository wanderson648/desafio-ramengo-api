package br.com.wo.ramengo_api.desafio_backend_rv.exception.handler;

import br.com.wo.ramengo_api.desafio_backend_rv.exception.ErrorApiResponse;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serial;
import java.util.Optional;

@Getter
public class APIException extends RuntimeException {

    private final HttpStatus statusException;
    private final ErrorApiResponse bodyException;

    public APIException(HttpStatus statusException, String message, Exception e) {
        super(message, e);
        this.statusException = statusException;
        this.bodyException = ErrorApiResponse.builder()
                .message(message)
                .description(getDescription(e))
                .build();
    }

    private String getDescription(Exception e) {
        return Optional.ofNullable(e)
                .map(APIException::getMessageCause).orElse(null);
    }

    private static String getMessageCause(Exception e) {
        return e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
    }

    public ResponseEntity<ErrorApiResponse> buildErrorResponseEntity() {
        return ResponseEntity
                .status(statusException)
                .body(bodyException);
    }

    @Serial
    private static final long serialVersionUID = 5188254319182121395L;
}
