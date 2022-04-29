package org.pp.api.urr;


import org.pp.api.urr.request.Request;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public abstract class BaseRequest implements Request {

    protected abstract Map<String, Object> getOut();

    protected Result<?> doReturn(Object data, Throwable e) {

        var code = Objects.isNull(e) ? 1 :
                Optional.ofNullable(getOut().get(Const.OUT_CODE_KEY)).
                        map(s -> 1).
                        orElse(0);
        var message = Objects.isNull(e) ?
                Optional.ofNullable(getOut().get(Const.OUT_MESSAGE_KEY)).
                        map(s -> "").
                        orElse(Const.OK) : e.getMessage();
        Object rs = Optional.ofNullable(getOut().get(Const.OUT_DATA_KEY)).
                map(s -> new Object()).orElse(data);
        return new Result<>(code, message, rs);

    }

}
