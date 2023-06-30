public class costa extends comida_tipica {
    //atributos
    private String especias_fuertes;
    private String conocido_mundialmente;

    public costa(String nombre, String region, String tipo, int ncalorias, String especias_fuertes, String conocido_mundialmente) {
        super(nombre, region, tipo, ncalorias);
        this.especias_fuertes=especias_fuertes;
        this.conocido_mundialmente=conocido_mundialmente;
    }

    public String getEspecias_fuertes() {
        return especias_fuertes;
    }

    public void setEspecias_fuertes(String especias_fuertes) {
        this.especias_fuertes = especias_fuertes;
    }

    public String getConocido_mundialmente() {
        return conocido_mundialmente;
    }

    public void setConocido_mundialmente(String conocido_mundialmente) {
        this.conocido_mundialmente = conocido_mundialmente;
    }
}
