package org.chainOfResponsability;

public class ResponsavelGerente extends Responsavel {

    public ResponsavelGerente(Responsavel superior) {
        listaOcorrencias.add(TipoOcorrenciaAvaria.getTipoOcorrenciaAvaria());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }

}