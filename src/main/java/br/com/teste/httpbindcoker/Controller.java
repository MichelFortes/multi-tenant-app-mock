package br.com.teste.httpbindcoker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {

    @Value("${container}")
    private String container;

    @RequestMapping(value = "/**")
    public ResponseEntity<ResponseDto> customer(ServerHttpRequest request) {
        return body(request);
    }

    private ResponseEntity<ResponseDto> body(ServerHttpRequest request) {
        ResponseDto dto = new ResponseDto(container, request.getMethod().toString(), request.getURI().toString());
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

}
