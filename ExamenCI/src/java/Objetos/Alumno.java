/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author User
 */
public class Alumno {
    int id;
    String nombre;
    String apellido;
    String nro_documento;
    int carrera_id;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, String nro_documento, int carrera_id) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nro_documento = nro_documento;
        this.carrera_id = carrera_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNro_documento() {
        return nro_documento;
    }

    public void setNro_documento(String nro_documento) {
        this.nro_documento = nro_documento;
    }

    public int getCarrera_id() {
        return carrera_id;
    }

    public void setCarrera_id(int carrera_id) {
        this.carrera_id = carrera_id;
    }
    
        @Override
    public String toString() {
        return "Alumno" +"\n"+ "id= " + id +'\n'+ ", nombre= " + nombre +'\n'+ ", apellido= " + apellido + '\n'+
                ", nro_documento= " + nro_documento +'\n'+ ", carrera_id= " + carrera_id + '\n';
    }
}
