/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mueblerialacaprichosa;

/**
 *
 * @author Luis
 */
public class Hoja {
    //Punteros
    private Hoja PIzquierda;
    private Hoja PDerecha;
    private Objeto ObjetoAsignado;
    
    public Hoja(){
        this.ObjetoAsignado = null;
        this.PDerecha = null;
        this.PIzquierda = null;
    }
    
    public Hoja(Objeto O){
        this.ObjetoAsignado = O;
        this.PDerecha = null;
        this.PIzquierda = null;
    }

    
    /**
     * @return the ObjetoAsignado
     */
    public Objeto getObjetoAsignado() {
        return ObjetoAsignado;
    }

    /**
     * @param ObjetoAsignado the ObjetoAsignado to set
     */
    public void setObjetoAsignado(Objeto ObjetoAsignado) {
        this.ObjetoAsignado = ObjetoAsignado;
    }

    /**
     * @return the PIzquierda
     */
    public Hoja getPIzquierda() {
        return PIzquierda;
    }

    /**
     * @param PIzquierda the PIzquierda to set
     */
    public void setPIzquierda(Hoja PIzquierda) {
        this.PIzquierda = PIzquierda;
    }

    /**
     * @return the PDerecha
     */
    public Hoja getPDerecha() {
        return PDerecha;
    }

    /**
     * @param PDerecha the PDerecha to set
     */
    public void setPDerecha(Hoja PDerecha) {
        this.PDerecha = PDerecha;
    }
    
}
