package org.example.modelo;

public class ModeloCancion {
    private int id;
    private String nombre;
    private String artista;
    private String genero;
    private String album;
    private String letra;

    public ModeloCancion() {
    }

    public ModeloCancion(int id, String nombre, String artista, String genero, String album, String letra) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.album = album;
        this.letra = letra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Canciones{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", album='" + album + '\'' +
                ", letra='" + letra + '\'' +
                '}';
    }
}
