package com.br.unifor.patter.pagamento.strategies;

import com.br.unifor.patter.pagamento.exceptions.PaymentException;
import com.br.unifor.patter.pagamento.interfaces.PaymentInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class MercadoPagoPayment implements PaymentInterface {

    private String email;
    private String beneficiario;

    @Override
    public void pay(double amount) throws PaymentException {

        if (email == null || email.isEmpty()) {
            throw new PaymentException("Email do Mercado Pago invalido!");
        }

        System.out.println("Pagamento de R$" + amount
                + " iniciado via Mercado Pago para "
                + beneficiario
                + " (Email: " + email + ")");

        System.out.println("Pagamento enviado para processamento.");
    }

    @Override
    public String getPaymentDatails() {
        return "Mercado Pago: email " + email
                + ", Beneficiario: " + beneficiario;
    }
}