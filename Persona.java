

package com.mycompany.persona;
import java.util.Random;
public class Persona {
 
    private float confiabilidad;
    private boolean isGalleta;


    public Persona(){
        Random rand = new Random();

        confiabilidad = rand.nextInt((10 - 0) + 1) + 0;        

        if((rand.nextInt((1 - 0) + 1) + 0) == 0){
            isGalleta = false;
        }else{
            isGalleta = true;
        }
        
    }


    public float getConfiabilidad() {
        return this.confiabilidad;
    }

    public void setConfiabilidad(float confiabilidad) {
        this.confiabilidad = confiabilidad;
    }

    public boolean isIsGalleta() {
        return this.isGalleta;
    }

    public boolean getIsGalleta() {
        return this.isGalleta;
    }

    public void setIsGalleta(boolean isGalleta) {
        this.isGalleta = isGalleta;
    }


    @Override
    public String toString() {
        return "{" +
            " confiabilidad='" + getConfiabilidad() + "'" +
            ", isGalleta='" + isIsGalleta() + "'" +
            "}";
    }
}
