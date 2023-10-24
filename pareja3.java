public class Proyecto{

    public String nombre;
    public String descripcion;
    public int codigo;

    constructor(nombre, descripcion, codigo){
        super();
        this.nombre=nombre;
        this.decripcion=descripcion;
        this.codigo=codigo;
    }

    // Método getter para obtener el valor de 'nombre'
    public String getNombre() {
        return nombre;
    }

    // Método setter para establecer el valor de 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el valor de 'descripcion'
    public String getDescripcion() {
        return descripcion;
    }

    // Método setter para establecer el valor de 'descripcion'
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método getter para obtener el valor de 'codigo'
    public int getCodigo() {
        return codigo;
    }

    // Método setter para establecer el valor de 'codigo'
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}