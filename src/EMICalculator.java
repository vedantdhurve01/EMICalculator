/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author vedant
 */
public class EMICalculator implements ActionListener {
    
    JFrame f,j;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5;
    JButton b1;
    JComboBox cm;
   
    String mgs,l[]={"Home Lone","Car Loan","Persnal Lone","Educational Loan","Gold Loan"};
    
    double emi;
    public EMICalculator() {
        
        f=new JFrame("EMI Calculator");
        l6=new JLabel(new ImageIcon(EMICalculator.class.getResource("/image/image1.png")));
        Image icon = Toolkit.getDefaultToolkit().getImage(EMICalculator.class.getResource("/image/icon.png"));
        l6.setBounds(2, 20, 580, 90);
        l7=new JLabel("Loan Type :");
        l7.setBounds(130, 150, 100, 30);
        cm=new JComboBox(l);
        cm.setBounds(230, 150, 150, 30);
        l1=new JLabel("Loan Amount  :");
        l1.setBounds(130, 190, 100, 30);
        t1=new JTextField();
        t1.setToolTipText("Enter Loan Amount");
        t1.setBounds(230,190,150,30);
        t1.setToolTipText("Enter Loan Amount");
        l2=new JLabel("Time In Yr");
        l2.setBounds(130, 230, 100, 30);
        t2=new JTextField();
        t2.setBounds(230, 230, 150, 30);
        t2.setToolTipText("Enter Time Period Of Loan");
        l3=new JLabel("Interest Rate In %");
        l3.setBounds(230, 265, 200, 30);
     //   l4=new JLabel("Procecing Fees In %");
     //   l4.setBounds(270, 265, 200, 30);
        t3=new JTextField();
        t3.setBounds(230, 295, 100, 30);
        t3.setToolTipText("Enter Rate Of Intress In Percentage");
     //   t4=new JTextField();
       // t4.setBounds(270, 295, 100, 30);
        b1=new JButton(new ImageIcon(EMICalculator.class.getResource("/image/image2.png")));
        b1.setBounds(170, 350, 130, 30);
        l5=new JLabel(new ImageIcon(EMICalculator.class.getResource("/image/image3.png")));
        l5.setBounds(120, 400, 260, 260);
        
       
        
        f.add(l1);f.add(l2);f.add(l3);f.add(l5);f.add(l6);f.add(l7);//f.add(l4);
        f.add(t1);f.add(t2);f.add(t3);// f.add(t4);
        f.add(b1);f.add(cm);
        f.setIconImage(icon);
        f.setSize(600, 720);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
                double p=Double.parseDouble(t1.getText());
                double t=Double.parseDouble(t2.getText());
                double r=Double.parseDouble(t3.getText());
            r=r/(12*100);       
               
            t=t*12;
              
                
                emi = (p * r * (double)Math.pow(1 + r, t)) / (double)(Math.pow(1 + r, t) - 1); 
      
     
                
              
              
               double total=emi;
               mgs="Your Monthly EMI Is : "+emi;
               
               JOptionPane.showMessageDialog(j,mgs);
               
                
                
                
                
            }
        });
         
    }
    public static void main(String[] args) {
       
    EMICalculator em=new EMICalculator();
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
