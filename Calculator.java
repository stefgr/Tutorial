/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Stef
 */
public class Calculator extends JFrame implements ActionListener{
    
    //DHLWSH METABLHTWN
    private JButton backspace,CE,C,B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,Bplus,Bminus,Bdiv,Bmult,Bcomma,Bsqrt,Bdiv1,Bpercentage,Bequals,Bnegativity;
    private JLabel screen;
    private JMenuBar mb;
    private JMenu file,help;
    private JMenuItem exit,view;
    private MenuHandler handler;
    
    public Calculator(){
        
        
        System.out.println("o tsotrash einai vlias");     // <---- useful edit
        
        
        //DHMIOURGIA TOU FRAME
        super("Calculator");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);   //gia na emfanizetai sthn mesh
        
        handler=new MenuHandler();
        
        //DHMIOURGIA TOU MENUBAR
        mb=new JMenuBar();
        
        //DHMIOURGIA TOU MENU FILE
        file=new JMenu("File");
        exit=new JMenuItem("Exit");
        exit.addActionListener(handler);
        file.add(exit);
        //PROSTHESH TOU STO MENUBAR
        mb.add(file);
        
        //DHMIOURGIA TOU MENU HELP
        help=new JMenu("Help");                
        view=new JMenuItem("View Help");
        view.addActionListener(handler);
        help.add(view);
        //PROSTHESH TOU STO MENUBAR
        mb.add(help);
        //PROSTHESH TOU MENUBAR STO FRAME        
        setJMenuBar(mb);
        
        //DHMIOURGIA TWN BUTTON
        
        
    }
    
    public void actionPerformed(ActionEvent evt){
        
    }
    
    class MenuHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==exit)
                System.exit(0);
            else{
               JOptionPane.showMessageDialog(null, "UNDER CONSTRUCTION", "help", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    }
    
    public static void main(String[] args) {
        Calculator a=new Calculator();
    }
    
}
