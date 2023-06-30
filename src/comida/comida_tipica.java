
public class comida_tipica {
    //atributos
    private String nombre;
    private String region;
    private String tipo;
    private int ncalorias;
    public comida_tipica(String nombre, String region, String tipo, int ncalorias) {
        this.nombre = nombre;
        this.region = region;
        this.tipo = tipo;
        this.ncalorias = ncalorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNcalorias() {
        return ncalorias;
    }

    public void setNcalorias(int ncalorias) {
        this.ncalorias = ncalorias;
    }
}

