/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mueblerialacaprichosa;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class Arbol {
    Hoja Raiz;
    
    public Arbol(){
        this.Raiz = null;
    }
    
    /**
     * Recorre todo el arbol en busca de la posicion correcta del Arbol
     * para agregar el nodo
     * @param H nodo a enlazar, ya sea Izquierda o Derecha
     */
    public void Agregar(Hoja H){
        
        if(this.Raiz == null){
            this.Raiz = H;
            //JOptionPane.showMessageDialog(null, "Raiz");
        }else{
            Hoja Aux = this.Raiz;
            Hoja Aux2 = null;
            
            /**
             * Variable que va a decidir si lo asigna a la derecha o a la izquierda del arbol
             */
            int asignado = -1;
            
            while(Aux != null){
                Integer comparacionAH = Aux.getObjetoAsignado().getCategoria().compareToIgnoreCase(H.getObjetoAsignado().getCategoria());
                if(comparacionAH == 0){
                    JOptionPane.showMessageDialog(null, "Ya existe");
                    Aux = null;
                }
                else if(comparacionAH > 0){
                    // (0) - Izquierda
                    asignado = 0;
                    Aux2 = Aux;
                    Aux = Aux.getPIzquierda();
                    //JOptionPane.showMessageDialog(null, "izq de "+Aux2.getObjetoAsignado().getCategoria());
                
                }else if(comparacionAH < 0){
                    // (1) - Derecha
                    asignado = 1;
                    Aux2 = Aux;
                    Aux = Aux.getPDerecha();
                    //JOptionPane.showMessageDialog(null, "der de "+Aux2.getObjetoAsignado().getCategoria());
                }
                
            }
            //Asignacion
            if(asignado == 0){
                //Izquierda
                Aux2.setPIzquierda(H);
            }else if(asignado == 1){
                //Derecha
                Aux2.setPDerecha(H);
            }
        }
    }
    
    
}
