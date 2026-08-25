package com.br.unifor.patter.pagamento.factories;

import com.br.unifor.patter.pagamento.exceptions.PaymentException;
import com.br.unifor.patter.pagamento.interfaces.PaymentInterface;
import com.br.unifor.patter.pagamento.strategies.BoletoPayment;
import com.br.unifor.patter.pagamento.strategies.CreditCardPayment;
import com.br.unifor.patter.pagamento.strategies.MercadoPagoPayment;
import com.br.unifor.patter.pagamento.strategies.PixPayment;

public class PaymentFactory {

    public static PaymentInterface createPayment(String type, String... params) throws PaymentException {
        switch (type.toLowerCase()){
            case "creditcard":
                return new CreditCardPayment(params[0],params[1],params[2],params[3]);
            case "pix":
                return new PixPayment(params[0],params[1]);
            case "boleto":
                return new BoletoPayment(params[0],params[1],params[2]);
            case "mercadopago":
                return new MercadoPagoPayment(params[0],params[1]);
            default:
                throw new PaymentException("Tipo de pagamento invalido");
        }
    }
}
