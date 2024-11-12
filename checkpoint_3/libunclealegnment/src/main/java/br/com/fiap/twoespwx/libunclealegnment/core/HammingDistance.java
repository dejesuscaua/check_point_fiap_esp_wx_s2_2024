package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;
import br.com.fiap.twoespwx.libunclealegnment.api.input.SequenceInput;
import br.com.fiap.twoespwx.libunclealegnment.util.SleepMachine;

@Component
public class HammingDistance extends BaseDistance {

    private static final String METHOD = "HAMMING_DISTANCE";
    private static final String ABOUT = """
        The Hamming Distance measures the difference between two strings of equal length by counting the number of positions where the corresponding characters differ. It is commonly used in error detection, bioinformatics, cryptography, and machine learning to assess similarity or detect changes. For example, the Hamming Distance between "ACGT" and "ACGG" is 1, as only the last character differs."
    """;

    private static final List<String> REFERENCES = List.of(
        "https://www.sciencedirect.com/topics/computer-science/hamming-distance",
        "https://en.wikipedia.org/wiki/Hamming_distance"
    );

    public HammingDistance() {
        super(HammingDistance.METHOD, HammingDistance.ABOUT, HammingDistance.REFERENCES);
    }

    @Override
    public DistanceResult run(DistanceInput input) {

        SleepMachine.sleep();

        List<SequenceInput> sequences = input.getSequences();
        
        String sequenceA = sequences.get(0).getSequence();
        String sequenceB = sequences.get(1).getSequence();
        Double distanceScore = 0.0;
        Double similarityScore = 0.0;
        List<String> observations = List.of("""
            Naive implementation of Hamming Distance for small inputs, be aware! 
            The int primitive type is a signed 32 bits from -2147483648 to 2147483647
        """);

        if (sequenceA.length() != sequenceB.length()) {
            throw new IllegalArgumentException("Both string need to have the same length!\nSequence A :" + sequenceA + "\nSequence B: " + sequenceB);
        }

        for (int i = 0; i < sequenceA.length(); i++) {
            if (sequenceA.charAt(i) != sequenceB.charAt(i)) {
                distanceScore++;
            }
        }

        similarityScore = 1 - (distanceScore/sequenceA.length());

        return new DistanceResult(
            distanceScore, 
            similarityScore, 
            observations, 
            sequenceA.length(), 
            input.getFormat()
        );
    }
}
