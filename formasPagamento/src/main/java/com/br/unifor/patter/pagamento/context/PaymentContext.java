package com.br.unifor.patter.pagamento.context;

import com.br.unifor.patter.pagamento.exceptions.PaymentException;
import com.br.unifor.patter.pagamento.interfaces.PaymentInterface;

public class PaymentContext {
    private PaymentInterface strategy;

    public PaymentContext(PaymentInterface strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) throws PaymentException {
        try {
            strategy.pay(amount);
            String mensage = "Pagamento bem-sucedido: "+ strategy.getPaymentDatails() + "Valor: R$"+amount;
        } catch (PaymentException e) {
            throw new PaymentException("Falha no pagamento "+e.getMessage() + "Metodo: "+strategy.getPaymentDatails());
        }
    }

}
