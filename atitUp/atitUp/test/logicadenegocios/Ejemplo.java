/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadenegocios;

import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class Ejemplo {
    
    private String textoEjemplo;
    private ArrayList<Valoracion> valoraciones;
    
    
    public Ejemplo(String pTextoEjemplo)
    {
        this.textoEjemplo = pTextoEjemplo;
        valoraciones = new ArrayList();
    }

    public void setTextoEjemplo(String textoEjemplo) {
        this.textoEjemplo =  textoEjemplo;
    }

    

    public String getTextoEjemplo() {
        return textoEjemplo;
    }

    
    public void agregarValoracionEjemplo(String pComentario, int pEstrellas)
    {
        Valoracion tValoracion = new Valoracion(pComentario, pEstrellas);
        this.valoraciones.add(tValoracion);
        
    }
    
    
    public int getSumaEstrellas()
    {
      int i = 0;
      int suma;
      for(Valoracion v: valoraciones)
      {
          i +=  v.getEstrella();
      }
       suma = i; 
       return suma;
    }
    
    public int getValorPonderadoEjemplo()
    {
       return getSumaEstrellas()/getCantidadValoraciones();
    }
    
    
    public int getCantidadValoraciones()
    {
        return this.valoraciones.size();
    }
    
    
}





