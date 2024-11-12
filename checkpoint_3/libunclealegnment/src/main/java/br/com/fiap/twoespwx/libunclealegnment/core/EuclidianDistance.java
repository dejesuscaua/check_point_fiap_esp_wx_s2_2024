package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;

public class EuclidianDistance extends BaseDistance {

    private static final String METHOD = "EUCLIDIAN_DISTANCE"; // Define uma constante METHOD, com o valor "EUCLIDIAN_DISTANCE". static final indica que é uma constante de classe e seu valor não será alterado.
    private static final String ABOUT = """
        WORKING IN PROGRESS
    """; // Define a constante ABOUT, que contém uma breve descrição, neste caso "WORKING IN PROGRESS". e o static final indica que é uma constante de classe e seu valor não será alterado tambem.

    private static final List<String> REFERENCES = List.of(
        "https://en.wikipedia.org/wiki/Euclidian_distance"
    );

    public EuclidianDistance() {
        super(EuclidianDistance.METHOD, EuclidianDistance.ABOUT, EuclidianDistance.REFERENCES);
    }

    @Override
    public DistanceResult run(DistanceInput input) {
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    } // O método run recebe um parâmetro input do tipo DistanceInput, que provavelmente contém os dados necessários para o cálculo da distância.

}
