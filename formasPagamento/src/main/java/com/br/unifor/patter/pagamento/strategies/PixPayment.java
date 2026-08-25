package com.br.unifor.patter.pagamento.strategies;

import com.br.unifor.patter.pagamento.exceptions.PaymentException;
import com.br.unifor.patter.pagamento.interfaces.PaymentInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PixPayment implements PaymentInterface {

    private String pixKey;
    private String beneficiary;

    @Override
    public void pay(double amount) throws PaymentException {
        if (pixKey==null || pixKey.isEmpty()){
            throw  new PaymentException("Chave pix invalido!");
        }

        System.out.println("Pagamento de R$" +amount+ " realizado via pix para "
                + beneficiary+ "(Chave: "+pixKey+")");
    }

    @Override
    public String getPaymentDatails() {
        return "Pix: chave "+ pixKey+ " Beneficiario: "+beneficiary;
    }
}
