package br.com.teste.httpbindcoker;

public class ResponseDto {

    public final String container;
    public final String method;
    public final String url;

    public ResponseDto(String container, String method, String url) {
        this.container = container;
        this.method = method;
        this.url = url;
    }

}
