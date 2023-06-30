
public class oriente extends sierra {
    private String tipo_plato;
    private String acompaniante;


    public oriente(String nombre, String region, String tipo, int ncalorias, String especias_fuertes, String conocido_mundialmente, String proteina, String salsa, String tipo_plato, String acompaniante) {
        super(nombre, region, tipo, ncalorias, especias_fuertes, conocido_mundialmente, proteina, salsa);
        this.tipo_plato=tipo_plato;
        this.acompaniante=acompaniante;
    }

    public String getTipo_plato() {
        return tipo_plato;
    }

    public void setTipo_plato(String tipo_plato) {
        this.tipo_plato = tipo_plato;
    }

    public String getAcompaniante() {
        return acompaniante;
    }

    public void setAcompaniante(String acompaniante) {
        this.acompaniante = acompaniante;
    }

    public void mostrardatos(){
        System.out.println("\nNombre: "+getNombre());
        System.out.println("Regin que pertenece: "+getRegion());
        System.out.println("Tipo (dulce - salado): "+getTipo());
        System.out.println("Numero de calorias: "+getNcalorias());
        System.out.println("Especias fuertes: "+getEspecias_fuertes());
        System.out.println("Conocido Mundialmente: "+getConocido_mundialmente());
        System.out.println("Proteina principal: "+getProteina());
        System.out.println("Salsa: "+getSalsa());
        System.out.println("Tipo plato: "+getTipo_plato());
        System.out.println("Acompañante: "+getAcompaniante());
    }
}
