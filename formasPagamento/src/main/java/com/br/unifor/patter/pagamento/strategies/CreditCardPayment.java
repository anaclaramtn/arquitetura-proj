package com.br.unifor.patter.pagamento.strategies;

import com.br.unifor.patter.pagamento.exceptions.PaymentException;
import com.br.unifor.patter.pagamento.interfaces.PaymentInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class CreditCardPayment implements PaymentInterface {
    private String cardNumber;
    private String name;
    private String cvv;
    private String expiryDate;

    @Override
    public void pay(double amount) throws PaymentException {
        if (cardNumber==null || cardNumber.length()!=16){
            throw new PaymentException("Numero de cartao de credito invalido! ");
        }
        System.out.println("Pagamento de R$"+amount+ "realizado com cartão de credito ("
                + maskCardNumber(cardNumber)+" ) em nome de "+name );
    }

    private String maskCardNumber(String cardNumber) {
        return "**** **** **** "+cardNumber.substring(12);
    }

    @Override
    public String getPaymentDatails() {
        return "Cartão de credito : "+ maskCardNumber(cardNumber) + ", Nome: "+name;
    }
}
