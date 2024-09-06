package Punto5.main;


import Punto5.model.Persona;
import java.time.LocalDate;

public class Main {
 public static void main(String[] args) {
     
	 // creo los objetos con el contructor
	 
     Persona persona1 = new Persona();
     persona1.setDni("24826441");
     persona1.setNombre("Milton");
     persona1.setFechaNacimiento(LocalDate.of(1976, 5, 16));
     persona1.setProvincia("Salta");
     persona1.mostrarDatos();

     // otro objeto usando constructor
     Persona persona2 = new Persona("22747468", "Noemi", LocalDate.of(1971, 4, 8), "Tucuman");
     persona2.mostrarDatos();

     // creo otro objeto usando contructor pero con la provincia fija o sea jujuy
     Persona persona3 = new Persona("44948414", "Nahir", LocalDate.of(2020, 8, 28));
     persona3.mostrarDatos();
 }
}
