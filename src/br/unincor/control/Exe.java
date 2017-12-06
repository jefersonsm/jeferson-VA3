package br.unincor.control;

import br.unincor.dao.MusicaDAO;
import br.unincor.model.Musica;
import br.unincor.view.Usuario;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario gui = new Usuario();
		MusicaDAO musicaDao = new MusicaDAO();
		
		int op=gui.exibeMenuPrincipal();
		
		if(op==0){
			//inserir
			Musica music = new Musica(gui.recebeTexto("titulo:"), gui.recebeTexto("artista:"), 
					gui.recebeTexto("album:"), gui.recebeLong("duracao"));
			musicaDao.insertMusica(music.getTitulo(),music.getArtista(),music.getAlbum(),music.getDuracao());
			gui.exibeMsg(music.toString());
			
		}else if(op==1){
			//alterar
			musicaDao.updateMusica(gui.recebeInteiro("id:"), gui.recebeTexto("novoTitulo:"), 
					gui.recebeTexto("novoArtista:"), gui.recebeTexto("novoAlbum:"), gui.recebeLong("novaDuracao"));
		}

	}

}
