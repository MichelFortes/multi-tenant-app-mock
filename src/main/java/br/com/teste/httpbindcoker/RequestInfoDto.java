package br.com.teste.httpbindcoker;

public class RequestInfoDto {

    public final String tenant;
    public final String method;
    public final String uri;

    public RequestInfoDto(String tenant, String method, String uri) {
        this.tenant = tenant;
        this.method = method;
        this.uri = uri;
    }

}
