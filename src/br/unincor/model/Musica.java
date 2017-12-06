package br.unincor.model;

public class Musica {
	
	private Integer id;
	private String titulo;
	private String artista;
	private String album;
	private Long duracao;
	
	public Musica(String titulo, String artista, String album, Long duracao) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.album = album;
		if(duracao>=60 && duracao<=600){
			this.duracao = duracao;
		}else{
			this.duracao=0L;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Long getDuracao() {
		return duracao;
	}

	public void setDuracao(Long duracao) {
		if(duracao>=60 && duracao<=600){
			this.duracao = duracao;
		}else{
			this.duracao=0L;
		}
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Musica [id=" + id + ", titulo=" + titulo + ", artista=" + artista + ", album=" + album + ", duracao="
				+ duracao + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
