package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

public abstract class BaseDistance implements DistanceCalculator {
    
    private String method;
    private String about;
    private List<String> references;

    public BaseDistance(String method, String about, List<String> references) {
        this.method = method;
        this.about = about;
        this.references = references;
    }

    public String getMethod() {
        return method;
    }

    public String getAbout() {
        return about;
    }

    public List<String> getReferences() {
        return references;
    }

}
