package br.com.dankicommerce.rn;

import java.text.NumberFormat;
import java.util.Locale;

public class FormataDeDoubleParaReais {
	
	@SuppressWarnings("deprecation")
	private final Locale brasil = new Locale("pt","BR");

	public String executa(Double valor) {
		// TODO Auto-generated method stub
		return NumberFormat.getCurrencyInstance(brasil).format(valor);
	}

}
