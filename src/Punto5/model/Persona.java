package Punto5.model;


import java.time.LocalDate;
import java.time.Period;

// atributos

public class Persona {
 private String dni;
 private String nombre;
 private LocalDate fechaNacimiento;
 private String provincia;
 
 //  constructor
 
 public Persona() {
     this.provincia = "Jujuy";
 }
 
  
 
 // otros constructores
 
 public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
     this.dni = dni;
     this.nombre = nombre;
     this.fechaNacimiento = fechaNacimiento;
     this.provincia = provincia;
 }
 
 // Constructor con el nombre de jujuy asignado
 
 public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
     this.dni = dni;
     this.nombre = nombre;
     this.fechaNacimiento = fechaNacimiento;
     this.provincia = "Jujuy";
 }
 
 // Get para recibir
 
 public String getDni() { 
	 return dni; }
 
 public String getNombre() { 
	 return nombre; }
 
 public LocalDate getFechaNacimiento() {
	 return fechaNacimiento; }
  
 public String getProvincia() { 
	 return provincia; }
 
 //set para asignar
 
 public void setDni(String dni) { 
	 this.dni = dni; }
 
 public void setNombre(String nombre) { 
	 this.nombre = nombre; }
 
 public void setFechaNacimiento(LocalDate fechaNacimiento) {
	 this.fechaNacimiento = fechaNacimiento; }
 
 public void setProvincia(String provincia) { 
	 this.provincia = provincia; }
 
 
  // otros metodos por ejemplo para calular la edad
 
 public int calcularEdad() {
     return Period.between(fechaNacimiento, LocalDate.now()).getYears();
 }
 
 // comparar si la persona es mayor a 18
 public boolean esMayorDeEdad() {
     return calcularEdad() >= 18;
 }
 
 // Display information
 public void mostrarDatos() {
     System.out.println("DNI: " + dni);
     System.out.println("Nombre: " + nombre);
     System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
     System.out.println("Provincia: " + provincia);
     System.out.println("Edad: " + calcularEdad());
     System.out.println(esMayorDeEdad() ? "La persona es mayor de edad" : "La persona no es mayor de edad");
 }
}
