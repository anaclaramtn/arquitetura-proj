package com.br.unifor.patter.pagamento.strategies;

import com.br.unifor.patter.pagamento.exceptions.PaymentException;
import com.br.unifor.patter.pagamento.interfaces.PaymentInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class BoletoPayment implements PaymentInterface {
    private String codBoleto;
    private String beneficiario;
    private String dataVenc;

    @Override
    public void pay(double amount) throws PaymentException {
        if (codBoleto == null || codBoleto.isEmpty()) {
            throw new PaymentException("Codigo do boleto invalido!");
        }
        System.out.println("Boleto no valor de R$" + amount
                + " gerado para " + beneficiario
                + " (Codigo: " + codBoleto
                + ", Vencimento: " + dataVenc + ")");
    }

    @Override
    public String getPaymentDatails() {
        return "Boleto: código de barras: "+ codBoleto
                + ", Beneficiario: "+ beneficiario
                +", Data de Vencimento: " + dataVenc;

    }
}
