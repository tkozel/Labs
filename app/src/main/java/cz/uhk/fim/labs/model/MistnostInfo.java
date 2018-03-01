package cz.uhk.fim.labs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Mistnost v budove
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MistnostInfo {
    public String zkrBudovy;
    public String cisloMistnosti;
    public String katedra;
    public String typCiselne;
    public int kapacita;
    public int podlazi;
    public String poznamka;
}
