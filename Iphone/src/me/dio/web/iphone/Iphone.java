package me.dio.web.iphone;

import me.dio.web.aparelhotelefonico.AparelhoTelefonico;
import me.dio.web.navegadorinternet.NavegadorInternet;
import me.dio.web.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	private String musica;
	private String url;
	private String numero;
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub

	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub

	}

}
