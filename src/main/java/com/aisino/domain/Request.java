package com.aisino.domain;

/**
 * Created by zhukaishengy on 2018/4/2.
 */
public class Request {

    private String cert;
    private String ts;
    private String serverRandom;
    private String page;
    private String token;

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getServerRandom() {
        return serverRandom;
    }

    public void setServerRandom(String serverRandom) {
        this.serverRandom = serverRandom;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Request(String cert, String ts, String serverRandom, String page) {
        this.cert = cert;
        this.ts = ts;
        this.serverRandom = serverRandom;
        this.page = page;
    }

    public Request() {
    }

    @Override
    public String toString() {
        return "Request{" +
                "cert='" + cert + '\'' +
                ", ts='" + ts + '\'' +
                ", serverRandom='" + serverRandom + '\'' +
                ", page='" + page + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
