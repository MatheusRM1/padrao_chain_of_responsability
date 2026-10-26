package org.chainOfResponsability;

import java.util.ArrayList;

public abstract class Responsavel {

    protected ArrayList listaOcorrencias = new ArrayList();
    private Responsavel responsavelSuperior;

    public Responsavel getResponsavelSuperior() {
        return responsavelSuperior;
    }

    public void setResponsavelSuperior(Responsavel responsavelSuperior) {
        this.responsavelSuperior = responsavelSuperior;
    }

    public abstract String getDescricaoCargo();

    public String tratarOcorrencia(Ocorrencia ocorrencia) {
        if (listaOcorrencias.contains(ocorrencia.getTipoOcorrencia())) {
            return getDescricaoCargo();
        }
        else {
            if (responsavelSuperior != null) {
                return responsavelSuperior.tratarOcorrencia(ocorrencia);
            }
            else
            {
                return "Sem responsável";
            }
        }
    }
}