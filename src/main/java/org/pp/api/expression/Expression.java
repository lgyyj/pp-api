package org.pp.api.expression;

import java.util.function.Function;

public interface Expression {
    Object eval(String expr, Function conProvide, Function fieldProvide, Function tableProvide);
}
