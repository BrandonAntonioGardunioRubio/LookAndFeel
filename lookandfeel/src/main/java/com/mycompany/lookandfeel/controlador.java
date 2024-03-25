/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lookandfeel;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author mkpol
 */
public class controlador {
    public void Principal() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
//                    UIManager.setLookAndFeel(new AluminiumLookAndFeel());//aluminio
//                    UIManager.setLookAndFeel(new BernsteinLookAndFeel());//amarillo
//                    UIManager.setLookAndFeel(new HiFiLookAndFeel());//darkmode
                    UIManager.setLookAndFeel(new TextureLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                            
                }
                NewJFrame j=new NewJFrame();
                j.setVisible(true);
                j.setResizable(false);
                
            }
        });
    }
}
