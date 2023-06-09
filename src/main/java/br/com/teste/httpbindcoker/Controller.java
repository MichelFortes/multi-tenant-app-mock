package br.com.teste.httpbindcoker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {

    @Value("${tenant}")
    private String tenant;

    @RequestMapping(value = "/customers")
    public ResponseEntity<RequestInfoDto> customer(HttpServletRequest request) {
        return body(request);
    }

    @RequestMapping(value = "/enterprises")
    public ResponseEntity<RequestInfoDto> enterprises(HttpServletRequest request) {
        return body(request);
    }

    private ResponseEntity<RequestInfoDto> body(HttpServletRequest request) {
        RequestInfoDto dto = new RequestInfoDto(tenant, request.getMethod(), request.getRequestURL().toString());
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

}
