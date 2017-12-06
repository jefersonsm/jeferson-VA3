package br.unincor.dao;

import java.sql.PreparedStatement;

import br.unincor.connection.DBConnection;
import br.unincor.view.Usuario;

public class MusicaDAO {
	
	private DBConnection dbConnection = new DBConnection();
	private PreparedStatement pStatement;
	
	Usuario gui = new Usuario();
	
	public void insertMusica(String titulo,String artista, String album, Long duracao){
		String sql = "INSERT INTO musica(`titulo`,`artista`,`album`,`duracao`) "
				+ "VALUES ('"+ titulo +"','"+ artista +"','"+ album +"','"+ duracao +"')";
		try {
			dbConnection.openDBConnection();
			pStatement = dbConnection.CON.prepareStatement(sql);
			pStatement.executeLargeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			gui.exibeMsgErro("Erro ao inserir a musica");	
		}
	}
	
	public void updateMusica(int id, String novoTitulo,String novoArtista, String novoAlbum, Long novaDuracao) {
		try {
			this.updateTituloMusica(id, novoTitulo);
			this.updateArtistaMusica(id, novoArtista);
			this.updateAlbumMusica(id, novoAlbum);
			this.updateDuracaoMusica(id, novaDuracao);
		} catch (Exception e) {
			// TODO: handle exception
			gui.exibeMsgErro("Erro ao alterar a musica");
		}
	}	
	
	public void updateTituloMusica(int id, String novoTitulo) {
		String sql = "UPDATE musica SET titulo = " + novoTitulo + "WHERE idPais = " + id;
		try {
			pStatement.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			gui.exibeMsgErro("Erro ao alterar a musica");
		}
	}
	
	public void updateArtistaMusica(int id, String novoArtista) {
		String sql = "UPDATE musica SET titulo = " + novoArtista + "WHERE idPais = " + id;
		try {
			pStatement.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			gui.exibeMsgErro("Erro ao alterar a musica");
		}
	}
	
	public void updateAlbumMusica(int id, String novoAlbum) {
		String sql = "UPDATE musica SET titulo = " + novoAlbum + "WHERE idPais = " + id;
		try {
			pStatement.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			gui.exibeMsgErro("Erro ao alterar a musica");
		}
	}
	
	public void updateDuracaoMusica(int id, Long novaDuracao) {
		String sql = "UPDATE musica SET titulo = " + novaDuracao + "WHERE idPais = " + id;
		try {
			pStatement.executeUpdate(sql);
		} catch (Exception e) {
			// TODO: handle exception
			gui.exibeMsgErro("Erro ao alterar a musica");
		}
	}

}
