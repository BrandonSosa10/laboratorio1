
package Labo1Bs;

import java.util.Random;

public class Perrito{
    private float animo; 
    private float umbraln;


    public Perrito(){
        Random rand = new Random();

        animo = rand.nextInt((5 + 5) + 1) - 5;
        umbraln = rand.nextInt((0 + 20) + 1) - 20;
    }
    
    public void comportamientoRandom(){
        
    }

    public float getAnimo() {
        return this.animo;
    }

    public void setAnimo(float animo) {
        this.animo = animo;
    }

    public float getUmbraln() {
        return this.umbraln;
    }

    public void setUmbraln(float umbraln) {
        this.umbraln = umbraln;
    }

    public String getAccion(float animo, float umbraln){
        String accion = "";

        if(animo < umbraln){
            accion = "Emergencia, TE AMOrdido un perro";
        }else if((animo < 0) && (animo > umbraln)){
            accion = "Te esta ladrando, guarda tu distancia";
        }else if(animo > 0){
            accion = "Lo estas haciendo bien, Parece que te aman los perritos ";
        }

        return accion;
    }

        //@Override
        public String toString() {
        return "{" +
            " animo='" + getAnimo() + "'" +
            ", umbral='" + getUmbraln() + "'" +
            "}";
    }
    

}
   
