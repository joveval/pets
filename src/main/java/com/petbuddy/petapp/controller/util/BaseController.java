package com.petbuddy.petapp.controller.util;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;

import javax.naming.ServiceUnavailableException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @author Diego Mansilla on 10/25/2016.
 */
public class BaseController {
    private final static Logger LOG = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity exceptionHandler(Exception e) {
        LOG.error("EXCEPTION: ", e);
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(RestClientException.class)
    public ResponseEntity exceptionHandler(RestClientException e) {
        LOG.error("REST CLIENT EXCEPTION: ", e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

    @ExceptionHandler(ServiceUnavailableException.class)
    public ResponseEntity exceptionHandler(ServiceUnavailableException e) {
        LOG.error("SERVICE UNNAVAILABLE EXCEPTION: ", e);
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(null);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity exceptionHandler(NullPointerException e) {
        LOG.error("NULL POINTER EXCEPTION: ", e);
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(null);
    }
}
