
package Principal;

import Controlador.cntConversor;
import Modelo.MdlConversor;
import Vista.FrmConversor;


public class Principal {
    
    public static void main(String[] args) {
        
        FrmConversor frmConversor = new FrmConversor();
        MdlConversor mldConversor = new MdlConversor();
        cntConversor cntConversor = new cntConversor(frmConversor, mldConversor);
        frmConversor.setVisible(true);
    }
}
