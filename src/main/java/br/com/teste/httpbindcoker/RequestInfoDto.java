package br.com.teste.httpbindcoker;

public class RequestInfoDto {

    public final String container;
    public final String method;
    public final String url;

    public RequestInfoDto(String container, String method, String url) {
        this.container = container;
        this.method = method;
        this.url = url;
    }

}
