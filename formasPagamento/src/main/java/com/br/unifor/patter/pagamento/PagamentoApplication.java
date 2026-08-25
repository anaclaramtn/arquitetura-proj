package com.br.unifor.patter.pagamento;

import com.br.unifor.patter.pagamento.context.PaymentContext;
import com.br.unifor.patter.pagamento.exceptions.PaymentException;
import com.br.unifor.patter.pagamento.factories.PaymentFactory;
import com.br.unifor.patter.pagamento.interfaces.PaymentInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PagamentoApplication {

	public static void main(String[] args) throws PaymentException {

		SpringApplication.run(PagamentoApplication.class, args);

		try {
			//Pagamento via cartao de cred
			PaymentInterface creditCard = PaymentFactory.createPayment(
					"creditcard",
					"1234523614527898",
					"Ana Atrasada",
					"123",
					"12/2026"
			);

			PaymentContext context1 = new PaymentContext(creditCard);
			context1.executePayment(256);


			PaymentInterface pix = PaymentFactory.createPayment(
					"pix",
					"123456789",
					"Ana Atrasada"
			);

			PaymentContext context2 = new PaymentContext(pix);
			context2.executePayment(7586);

			PaymentInterface boleto = PaymentFactory.createPayment(
					"boleto",
					"1234567890123456789",
					"Ana Atrasada",
					"29/08/2026"

			);

			PaymentContext context3 = new PaymentContext(boleto);
			context3.executePayment(1229);

			PaymentInterface mercadoPago = PaymentFactory.createPayment(
					"mercadopago",
					"anaAatrasada@unifor.com.br",
					"Ana Atrasada"
			);

			PaymentContext context4 = new PaymentContext(mercadoPago);
			context4.executePayment(350);
		} catch (PaymentException e) {
            throw new PaymentException("Erro: "+e.getMessage());
        }


    }

}
