public class Proyecto{

    public String nombre = "Proyecto 3";
    public String descripcion = "Pareja 3";
    public String user = "admin";
    public String password = "root";
    public int codigo = 3;

    constructor(nombre, codigo){
        super();
    }

    constructor(user, password){
        super();
        this.user=user;
        this.password=password;
    }

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

    public toString(){
        return "Nombre: " + nombre + " descripción: " + descripcion;
    }

    public void informacionCompleta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Código: " + codigo);
    }

    public void informacionUsiario() {
        System.out.println("Usuario: " + user);
        System.out.println("Contraseña: " + password);
    }

}