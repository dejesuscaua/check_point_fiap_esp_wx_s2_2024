package br.com.fiap.twoespwx.libunclealegnment.core;

import java.util.List;

public abstract class BaseDistance implements DistanceCalculator {
    
    private String calculationMethod; // Ultiliza uma String que armazena o método de cálculo de distância.
    private String description; // é uma String que armazena a descrição do método de cálculo.
    private List<String> sourceReferences; // uma lista que armazena referências sobre o método, como fontes ou bibliografia.

    public BaseDistance(String calculationMethod, String description, List<String> sourceReferences) {
        this.calculationMethod = calculationMethod;
        this.description = description;
        this.sourceReferences = sourceReferences;
        // Atribui os parâmetros recebidos pelo construtor (calculationMethod, description, e sourceReferences).
    }

    public String getCalculationMethod() {
        return calculationMethod;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getSourceReferences() {
        return sourceReferences;
    }
    // Tranformando em publico  permitindo que outras classes acessem
}
