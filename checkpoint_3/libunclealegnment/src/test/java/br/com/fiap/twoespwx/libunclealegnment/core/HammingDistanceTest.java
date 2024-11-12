package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import br.com.fiap.twoespwx.libunclealegnment.api.input.DistanceInput;
import br.com.fiap.twoespwx.libunclealegnment.api.input.SequenceInput;

public class HammingDistanceTest {

    @Test
    public void compareEqualStrings() {
        HammingDistance hamming = new HammingDistance();
        String inputSequence = "ACTGGTCA";
        UUID tracingUuid = UUID.randomUUID();
        UUID sequenceAUuid = UUID.randomUUID();
        UUID sequenceBUuid = UUID.randomUUID();

        List<SequenceInput> inputSequences = List.of(
            new SequenceInput(sequenceAUuid, inputSequence),
            new SequenceInput(sequenceBUuid, inputSequence)
        );
        DistanceInput input = new DistanceInput(
            tracingUuid, 
            "plain_text",
            "DEFAULT",
            inputSequences
        );
        DistanceResult expected = new DistanceResult(
            0.0, 
            1.0, 
            List.of("""
                Naive implementation of Hamming Distance for small inputs, be aware! 
                The int primitive type is a signed 32 bits from -2147483648 to 2147483647
            """), 
            inputSequence.length(), 
            "plain_text");
        DistanceResult actual = hamming.run(input);

        assertNotNull(actual);
    }
}
