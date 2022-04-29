package org.pp.api.urr.request;

public interface Auth {
    void auth();
    String getName();
    boolean isSuccess();

    Throwable getError();

    String getAuth();
}
