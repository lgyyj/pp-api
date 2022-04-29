package org.pp.api.urr.handle;

import java.net.http.HttpResponse;

public interface ResponseHandle {
    Object afterResponse(HttpResponse response);
}
