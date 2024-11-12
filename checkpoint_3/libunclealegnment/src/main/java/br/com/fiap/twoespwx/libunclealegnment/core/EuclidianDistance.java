package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;

public class EuclidianDistance extends BaseDistance {

    private static final String METHOD = "EUCLIDIAN_DISTANCE";
    private static final String ABOUT = """
        WORKING IN PROGRESS
    """;

    private static final List<String> REFERENCES = List.of(
        "https://en.wikipedia.org/wiki/Euclidian_distance"
    );

    public EuclidianDistance() {
        super(EuclidianDistance.METHOD, EuclidianDistance.ABOUT, EuclidianDistance.REFERENCES);
    }

    @Override
    public DistanceResult run(DistanceInput input) {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
