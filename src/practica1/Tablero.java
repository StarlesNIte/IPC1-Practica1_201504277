
package practica1;


public class Tablero {
    private int m;
    int fila[];
    int columna[];
    
    public Tablero(){
        
        
        fila=new int[m];
        columna=new int[m];
        
        mostrar();
    }
    
    private void mostrar(){
        
    }

    /**
     * @return the m
     */
    public int getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(int m) {
        this.m = m;
    }
}

