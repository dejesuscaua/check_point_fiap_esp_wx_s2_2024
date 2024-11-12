package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

public class DistanceResult {
    
    private Double distanceScore;
    private Double similarityScore;
    private List<String> observations;
    private Integer length;
    private String format;

    private Long processingTimeMs;
    
    public DistanceResult(Double distanceScore, Double similarityScore, List<String> observations, Integer length,
            String format) {
        this.distanceScore = distanceScore;
        this.similarityScore = similarityScore;
        this.observations = observations;
        this.length = length;
        this.format = format;
    }

    @Override
    public String toString() {
        return "DistanceResult [distanceScore=" + distanceScore + ", similarityScore=" + similarityScore
                + ", observations=" + observations + ", length=" + length + ", format=" + format + ", processing_time="
                + processingTimeMs + "]";
    }

    public Double getDistanceScore() {
        return distanceScore;
    }

    public Double getSimilarityScore() {
        return similarityScore;
    }

    public List<String> getObservations() {
        return observations;
    }

    public Integer getLength() {
        return length;
    }

    public String getFormat() {
        return format;
    }

    public Long getProcessingTimeMs() {
        return processingTimeMs;
    }

    public void setProcessingTimeMs(Long processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }
}
