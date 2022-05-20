public abstract class General {
    private String nombre;
    private Integer personal;

    public General(){}

    public General(String nombre, Integer personal) {
        this.nombre = nombre;
        this.personal = personal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPersonal() {
        return personal;
    }

    public void setPersonal(Integer personal) {
        this.personal = personal;
    }

}
