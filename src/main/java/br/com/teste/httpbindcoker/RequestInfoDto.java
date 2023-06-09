package br.com.teste.httpbindcoker;

public class RequestInfoDto {

    public final String tenant;
    public final String method;
    public final String url;

    public RequestInfoDto(String tenant, String method, String url) {
        this.tenant = tenant;
        this.method = method;
        this.url = url;
    }

}
