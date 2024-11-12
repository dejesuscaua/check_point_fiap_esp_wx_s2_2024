package br.com.fiap.twoespwx.libunclealegnment.api.input;

import java.util.List;
import java.util.UUID;

public class DistanceInput {
    
    private UUID tracingUuid;
    private String format;
    private String method;
    private List<SequenceInput> sequences;

    public DistanceInput(UUID tracingUuid, String format, String method, List<SequenceInput> sequences) {
        this.tracingUuid = tracingUuid;
        this.format = format;
        this.method = method;
        this.sequences = sequences;
    }

    @Override
    public String toString() {
        return "DistanceInput [tracingUuid=" + tracingUuid + ", format=" + format + ", method=" + method
                + ", sequences=" + sequences + "]";
    }

    public List<SequenceInput> getSequences() {
        return this.sequences;
    }

    public UUID getTracingUuid() {
        return tracingUuid;
    }

    public String getFormat() {
        return format;
    }

    public String getMethod() {
        return method;
    }
}
