package br.com.extend.scv.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public String lerData() {

		SimpleDateFormat dataF = new SimpleDateFormat("yyyy-MM-dd");
		Date dataAtual = new Date();
		String dataAtualFormatada = dataF.format(dataAtual);

		return dataAtualFormatada;
	}

	public String lerHora() {

		SimpleDateFormat horaF = new SimpleDateFormat("HH:mm:ss");
		Date horaAtual = new Date();
		String horaAtualFormatada = horaF.format(horaAtual);

		return horaAtualFormatada;
	}

}
