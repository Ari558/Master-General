/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diosc
 */
public class Personas {

    String Nombre;
    int Edad;
    String Sexo;
    float Peso;
    float Altura;

    public Personas() {
    }

    public Personas(String Nombre, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public Personas(String Nombre, int Edad, String Sexo, float Peso, float Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    //Metodos get y set
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    String esMayorDeEdad(){
        int edad = this.Edad;
        if(edad < 18) {
           return "Es menor de edad";  
        }else{   
           return "Es mayor de edad";
        }
        
    }   

    
    public String Persona1() {
        return "Personas{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }

    
    public String Persona2() {
        return "Personas{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + '}';
    }
    
}
