package comida;

public class sierra extends costa{
    private String proteina;
    private String salsa;

    public sierra(String nombre, String region, String tipo, int ncalorias, String especias_fuertes, String conocido_mundialmente, String proteina, String salsa) {
        super(nombre, region, tipo, ncalorias, especias_fuertes, conocido_mundialmente);
        this.proteina=proteina;
        this.salsa=salsa;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
}
