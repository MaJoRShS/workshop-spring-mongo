package br.com.shadowscompany.StartApplication.resources.exception;

import br.com.shadowscompany.StartApplication.services.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

@ControllerAdvice
public class ResourceExceptionHandler implements Serializable {

        @ExceptionHandler(ObjectNotFoundException.class)
        public ResponseEntity<StandardError> ObjectNotFound(ObjectNotFoundException e, HttpServletRequest request){
            HttpStatus status = HttpStatus.NOT_FOUND;
            StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não Encontratdo", e.getMessage(), request.getRequestURI());
            return ResponseEntity.status(status).body(err);

        }

}
