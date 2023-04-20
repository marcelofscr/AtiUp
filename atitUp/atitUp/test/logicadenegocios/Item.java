package logicadenegocios;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Agustin Arias
 */
public class Item implements iItem{
    private String prompt;
    private Respuesta respuesta;
    private Ejemplo ejemplo;
    private String fuenteRespuesta;
    private String fuenteEjemplo;
    private CategoriaConceptual categoria;
    
    
    public Item()
    {
        
    }
    
    public Item(String pPrompt)
    {
        this.prompt = pPrompt;
    }
    
    
    
    public void setCategoria(CategoriaConceptual pCategoria)
    {
        this.categoria = pCategoria;
    }

    public void setFuenteRespuesta(String fuenteRespuesta) {
        this.fuenteRespuesta = fuenteRespuesta;
    }

    public void setFuenteEjemplo(String fuenteEjemplo) {
        this.fuenteEjemplo = fuenteEjemplo;
    }

    public String getFuenteRespuesta() {
        return fuenteRespuesta;
    }

    public String getFuenteEjemplo() {
        return fuenteEjemplo;
    }
    
  
    @Override
    public String getPrompt()
    {
        return prompt;
    }
    
    public void setRespuesta(String pRespuesta)
    {
        Respuesta tRespuesta;
        tRespuesta = new Respuesta(pRespuesta);
        this.respuesta = tRespuesta;
    }
    
    public void setEjemplo(String pEjemplo)
    {
        Ejemplo tEjemplo;
        tEjemplo = new Ejemplo(pEjemplo);
        this.ejemplo = tEjemplo;
    }
    
    
    public void agregarValoracionRespuesta(String pComentario, int pEstrella)
    {
        this.respuesta.agregarValoracionRespuesta(pComentario, pEstrella);
    }
    
    public void agregarValoracionEjemplo(String pComentario, int pEstrella)
    {
        this.ejemplo.agregarValoracionEjemplo(pComentario, pEstrella);
    }
    
    
    
    
}
