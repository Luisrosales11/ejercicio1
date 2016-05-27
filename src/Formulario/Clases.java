/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formulario;

/**
 *
 * @author pc
 */
public class Clases {

public class producto {
    private String nombre;
    private String marca;
    private Double precio;
    private int existencia;

    public producto(){
    
    }
    public producto(String nombre,String marca,Double precio,int existencia){
    this.nombre=nombre;
    this.marca=marca;
    this.precio=precio;
    this.existencia=existencia;
    
    
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    
    
    
    
}

    
}

