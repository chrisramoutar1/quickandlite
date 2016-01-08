/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickandlite;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Quickandlite {
    
    
    public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable(){
    public void run(){

JFrame frame = new JFrame("Hello world swing!");
frame.setSize(500, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

}
});
}
}