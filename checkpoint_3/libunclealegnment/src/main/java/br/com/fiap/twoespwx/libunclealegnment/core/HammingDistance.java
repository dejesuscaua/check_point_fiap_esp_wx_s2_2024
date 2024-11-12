package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;
import br.com.fiap.twoespwx.libunclealegnment.api.input.SequenceInput;
import br.com.fiap.twoespwx.libunclealegnment.util.SleepMachine;

@Component
public class HammingDistance extends BaseDistance {

    private static final String DISTANCE_METHOD = "HAMMING_DISTANCE";
    private static final String DESCRIPTION = """
        The Hamming Distance measures the difference between two strings of equal length by counting the number of positions where the corresponding characters differ. It is commonly used in error detection, bioinformatics, cryptography, and machine learning to assess similarity or detect changes. For example, the Hamming Distance between "ACGT" and "ACGG" is 1, as only the last character differs."
    """;

    private static final List<String> SOURCE_REFERENCES = List.of(
        "https://www.sciencedirect.com/topics/computer-science/hamming-distance",
        "https://en.wikipedia.org/wiki/Hamming_distance"
    );

    public HammingDistance() {
        super(HammingDistance.DISTANCE_METHOD, HammingDistance.DESCRIPTION, HammingDistance.SOURCE_REFERENCES);
    }

    @Override
    public DistanceResult run(DistanceInput distanceInput) {

        SleepMachine.sleep();

        List<SequenceInput> sequenceInputs = distanceInput.getSequences();
        
        String firstSequence = sequenceInputs.get(0).getSequence();
        String secondSequence = sequenceInputs.get(1).getSequence();
        Double hammingScore = 0.0;
        Double matchRatio = 0.0;
        List<String> notes = List.of("""
            Naive implementation of Hamming Distance for small inputs, be aware! 
            The int primitive type is a signed 32 bits from -2147483648 to 2147483647
        """);

        if (firstSequence.length() != secondSequence.length()) {
            throw new IllegalArgumentException("Both strings need to have the same length!\nSequence A :" + firstSequence + "\nSequence B: " + secondSequence);
        }

        for (int i = 0; i < firstSequence.length(); i++) {
            if (firstSequence.charAt(i) != secondSequence.charAt(i)) {
                hammingScore++;
            }
        }

        matchRatio = 1 - (hammingScore / firstSequence.length());

        return new DistanceResult(
            hammingScore, 
            matchRatio, 
            notes, 
            firstSequence.length(), 
            distanceInput.getFormat()
        );
    }
}
