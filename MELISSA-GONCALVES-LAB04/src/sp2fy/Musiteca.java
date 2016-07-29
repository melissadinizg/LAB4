package sp2fy;

import java.util.ArrayList;

public class Musiteca {
	private ArrayList<Album> meusAlbuns;
	private ArrayList<Album> meusAlbunsFavoritos;

	public Musiteca() {
		this.meusAlbuns = new ArrayList<Album>();
		this.meusAlbunsFavoritos = new ArrayList<Album>();
	}

	public boolean addAlbum(Album album) {
		boolean adicionou = false;
		
		if (!contemAlbum(album)) {
			meusAlbuns.add(album);
			adicionou = true;
		}
		return adicionou;
	}

	public boolean contemAlbum(Album album) {
		boolean achou = false;

		for (Album album2 : meusAlbuns) {
			if (album.equals(album2)) {
				achou = true;
			}
		}
		return achou;
	}

	public boolean contemAlbumFavorito(Album album) {
		boolean achou = false;

		for (Album album2 : meusAlbunsFavoritos) {
			if (album2 != null) {
				if (album.equals(album2)) {
					achou = true;
				}
			}
		}
		return achou;
	}

	public boolean addAosFavoritos(Album album) {
		boolean adicionou = false;

		if (!contemAlbumFavorito(album)) {
			meusAlbunsFavoritos.add(album);
			adicionou = true;
		}
		return adicionou;
	}

	public int getQtdFavoritos() {
		return meusAlbunsFavoritos.size();
	}

	public boolean criaPlaylist(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addNaPlaylist(String string, String string2, int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
