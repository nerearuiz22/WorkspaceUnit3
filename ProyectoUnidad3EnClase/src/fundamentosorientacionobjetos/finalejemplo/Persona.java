package fundamentosorientacionobjetos.finalejemplo;
public class Persona {
private String nombre;
private String apellidos;
protected final String person = "Persona";
public Persona() {
}
public Persona(String nombre, String apellidos) {
this.nombre = nombre;
this.apellidos = apellidos;
// person="Persona2"; NO SE PUEDE PQ CUANDO SE DECLARA UNA VARIABLE FINAL LA HERENCIA ACABA AHÍ, no se puede modificar es una constante
}
public String getNombre() {
return nombre;
}
public String getApellidos() {
return apellidos;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public void setApellidos(String apellidos) {
this.apellidos = apellidos;
}

//MÉTODO FINAL QUE NO SE PUEDE MODIFICAR
//RECOMENDACIÓN --> APLICAR FINAL EN MÉTODOS QUE NO VAN A CAMBIAR
public final String getNombreCompleto() {
return this.nombre + " " + this.apellidos;
}
public String getNombreCompleto(String aka) {
return this.nombre + " " + this.apellidos + " " +
aka;
}
}