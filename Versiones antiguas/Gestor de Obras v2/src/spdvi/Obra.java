package spdvi;


public class Obra {
        public String getRegistre() {
        return registre;
    }

    public void setRegistre(String registre) {
        this.registre = registre;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImagen() {
        return imatge;
    }

    public void setImagen(String imagen) {
        this.imatge = imagen;
    }
    
    public Obra(){
        
    }
    
    public Obra(String registre, String titol, String any, String format, String autor, String imatge) {
        this.registre = registre;
        this.titol = titol;
        this.any = any;
        this.format = format;
        this.autor = autor;
        this.imatge = imatge;
    }
    
    private String registre;
    private String titol;
    private String any;
    private String format;
    private String autor;
    private String imatge;

    @Override
    public String toString() {
        return registre + ": " + titol + "," + any + " (" + format + "). " + autor + "," + imatge; 
    }
}
