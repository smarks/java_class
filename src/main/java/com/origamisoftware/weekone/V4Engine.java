package com.origamisoftware.weekone;

import java.math.BigDecimal;

public class V4Engine implements Engine {

    @Override
    public BigDecimal getMPH() {
        return new BigDecimal(90);
    }
}
