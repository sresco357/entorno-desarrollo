package comsrp.resco.pccomponets;

/**
 * Clase Procesador
 */
public class TarjetaGrafica {

    /**
     * Atrivuto, Propiedades, Variables
     */
    private Integer id;
    private String marca;
    private String fabricante;

    /**
     * Metodos, seciones, comportamineto
     */
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

}