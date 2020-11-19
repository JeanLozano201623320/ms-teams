/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionescompetencias;

public class Interrupcion {
    private boolean  inter;
            
    Interrupcion(){
        inter =true;//aactiva la interrupción
    }
    public boolean isInter() {
        return inter;
    }
    public void setInter(boolean inter) {
        this.inter = inter;
    }
}
