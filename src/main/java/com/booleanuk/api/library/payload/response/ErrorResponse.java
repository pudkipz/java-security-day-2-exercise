package com.booleanuk.api.library.payload.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@NoArgsConstructor
public class ErrorResponse extends Response<Map<String, String>> {
    public ErrorResponse(String message) {
        set(message);
    }

    public void set(String message) {
        this.status = "error";

        Map<String, String> reply = new HashMap<>();
        reply.put("message", message);
        this.data = reply;
    }
}
