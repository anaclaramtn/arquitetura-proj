package com.br.unifor.patter.pagamento.interfaces;

import com.br.unifor.patter.pagamento.exceptions.PaymentException;

public interface PaymentInterface {
    void pay(double amount) throws PaymentException;
    String getPaymentDatails();
}
