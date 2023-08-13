
package Controlador;

import Modelo.MdlConversor;
import Vista.FrmConversor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class cntConversor implements ActionListener{
    
    FrmConversor frmConversor;
    MdlConversor mdlConversor;

    public cntConversor(FrmConversor frmConversor, MdlConversor mdlConversor) {
        this.frmConversor = frmConversor;
        this.mdlConversor = mdlConversor;
        RegistrarControladores();
    }
    
    public void RegistrarControladores(){
        frmConversor.getBtnDolares().addActionListener(this);
         frmConversor.getBtnPesos().addActionListener(this);
         frmConversor.getBtnLimpiar().addActionListener(this);
    }

    public void aDolares(){
        
        Double Pesos = Double.parseDouble(frmConversor.getTxtValor().getText());
        Double Dolares = mdlConversor.aDolares(Pesos);
        frmConversor.getTxtValor().setText(Dolares.toString());
    }
    
    public void Apesos(){
        Double Dolares = Double.parseDouble(frmConversor.getTxtValor().getText());
        Double Pesos = mdlConversor.aPesos(Dolares);
        frmConversor.getTxtValor().setText(Pesos.toString());
    }

    public void Limpiar(){
        
        frmConversor.getTxtValor().setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (frmConversor.getBtnDolares() == e.getSource()) {
            aDolares();
        } else if (frmConversor.getBtnPesos() == e.getSource()) {
            Apesos();
        } else {
            Limpiar();
        }
        
 
    }
    
}
