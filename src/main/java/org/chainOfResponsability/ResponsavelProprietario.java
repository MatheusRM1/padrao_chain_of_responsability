package org.chainOfResponsability;

public class ResponsavelProprietario extends Responsavel {

    public ResponsavelProprietario(Responsavel superior) {
        listaOcorrencias.add(TipoOcorrenciaPagamento.getTipoOcorrenciaPagamento());
        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Proprietário";
    }

}
