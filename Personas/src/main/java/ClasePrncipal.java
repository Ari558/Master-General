
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diosc
 */
public class ClasePrncipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrse su nombre: ");
        String Nombre = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int Edad = sc.nextInt();

        System.out.println("Ingrese su sexo: ");
        String Sexo = sc.next();

        System.out.println("Ingrese su peso: ");
        float Peso = sc.nextFloat();

        System.out.println("Ingrese su altura: ");
        float Altura = sc.nextFloat();

        Personas Persona1 = new Personas(Nombre, Edad, Sexo, Peso, Altura);

        Personas Persona2 = new Personas(Persona1.getNombre(), Persona1.getEdad(), Persona1.getSexo());

        Personas Persona3 = new Personas();
        Persona3.setNombre(Nombre);
        Persona3.setEdad(Edad);
        Persona3.setSexo(Sexo);
        Persona3.setPeso(Peso);
        Persona3.setAltura(Altura);

        //Imprimiendo Datos
        System.out.println(Persona1.esMayorDeEdad());
        System.out.println(Persona1.Persona1());

        System.out.println();
        
        System.out.println(Persona2.esMayorDeEdad());
        System.out.println(Persona2.Persona2());

        System.out.println();
        
        System.out.println(Persona3.esMayorDeEdad()); 
        System.out.println(Persona3.Persona1()); 
        
    }
}
