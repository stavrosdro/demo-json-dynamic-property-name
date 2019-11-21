package com.example.demojsondynamicpropertyname;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class Response {

    private Map<String, Object> details = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getDetails() {
        return details;
    }
}
