package org.pp.api.urr;

public record Result<T>(int code, String message, T data) {
}
