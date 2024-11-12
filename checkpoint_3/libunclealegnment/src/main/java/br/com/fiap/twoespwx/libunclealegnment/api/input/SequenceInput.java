package br.com.fiap.twoespwx.libunclealegnment.api.input;

import java.util.UUID;

public class SequenceInput {
    private UUID sequenceUuid;
    private String sequence;

    public SequenceInput(UUID sequenceUuid, String sequence) {
        this.sequenceUuid = sequenceUuid;
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "SequenceInput [sequenceUuid=" + sequenceUuid + ", sequence=" + sequence + "]";
    }

    public String getSequence() {
        return sequence;
    }

    
}
