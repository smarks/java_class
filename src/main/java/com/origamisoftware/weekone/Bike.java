package com.origamisoftware.weekone;

import java.math.BigDecimal;

public class Bike implements Engine {

    @Override
    public BigDecimal getMPH() {
        return new BigDecimal(10);
    }
}
