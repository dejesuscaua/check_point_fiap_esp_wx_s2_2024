package br.com.fiap.twoespwx.libunclealegnment.core;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;

public interface DistanceCalculator {
    public DistanceResult run(DistanceInput input);
}
