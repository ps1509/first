/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifteenpuzzle1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
    public class P2 extends JApplet {
    JPanel p,p1,peast,pwest,pnorth,psouth;
    JLabel l1;
    JButton[] button=new JButton[16];
    JButton b1;
    AudioStream audios1,audios2;
    int blankPos;
     Thread thd;
     int f=0;
    public class TimerClass implements Runnable {
        
        public void run(){
            if(check()){
                f=1;
                
               // System.exit(0);
            }
        }
    }   
/**
 *
 * @author Puja Kumari
 *
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
       
        p=new JPanel();
        b1=new JButton(new ImageIcon("replay.jpg"));
        b1.setPreferredSize(new Dimension(114,114));
        p1=new JPanel();
        peast=new JPanel();
        pwest=new JPanel();
        pnorth=new JPanel();
        psouth=new JPanel();
        
        p.setLayout(new BorderLayout());
        p.add(p1,BorderLayout.CENTER);
        p.add(peast,BorderLayout.EAST);
        p.add(pwest,BorderLayout.WEST);
        p.add(pnorth,BorderLayout.NORTH);
        p.add(psouth,BorderLayout.SOUTH);
        peast.add(b1);
       // peast.setVisible(false);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent me){
                swoosh();
                shuffle();
            }
        });
        p1.setLayout(new GridLayout(4,4));
        
        int j;
        for (int i=0;i<15;i++){
            j=i+1;
            button[i]=new JButton(""+j);
        }
        //button formatting
        Font myFont = new Font("Tahoma", Font.BOLD, 60);
        button[15]=new JButton("");
        for(int i=0;i<16;i++) {
            p1.add(button[i]);
        }
        Border thickBorder = new LineBorder(Color.black, 2); 
        for(int i=0;i<16;i++) {
            button[i].setBorder(thickBorder);
            button[i].setFont(myFont);
            button[i].setForeground(Color.black);
            button[i].setBackground(Color.CYAN.darker());
        }
        
        //button fornat ends
        peast.setBackground(Color.black);
        pnorth.setBackground(Color.black);
        pwest.setBackground(Color.black);
        psouth.setBackground(Color.black);
        //panels alignment
        p1.setBorder(thickBorder);
        p1.setPreferredSize(new Dimension(400,400));
        setContentPane(p);
        setSize(1000,800);
        peast.setPreferredSize(new Dimension(150,100));
        pwest.setPreferredSize(new Dimension(150,100));
        pnorth.setPreferredSize(new Dimension(50,100));
        psouth.setPreferredSize(new Dimension(50,100));
        
        shuffle();  // for shuffling the numbers in the grid initially
        
        //adding action listener on each button
        for(int i=0;i<16;i++) {
        button[i].addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                music();
        if(e.getSource()==button[0]) {
            String text=button[0].getText();
            if(button[1].getText()== "") {
                button[1].setText(text);
                button[0].setText("");
            }
            if(button[4].getText() == "") {
                button[4].setText(text);
                button[0].setText("");
            }
           
        }
        
        if(e.getSource()==button[1]) {
            String text=button[1].getText();
            if(button[2].getText()=="") {
                button[2].setText(text);
                button[1].setText("");
            }
            if(button[5].getText()=="") {
                button[5].setText(text);
                button[1].setText("");
            }
            if(button[0].getText()=="") {
                button[0].setText(text);
                button[1].setText("");
            }
        }
        
        if(e.getSource()==button[2]) {
            String text=button[2].getText();
            if(button[3].getText()=="") {
                button[3].setText(text);
                button[2].setText("");
            }
            if(button[6].getText()=="") {
                button[6].setText(text);
                button[2].setText("");
            }
            if(button[1].getText()=="") {
                button[1].setText(text);
                button[2].setText("");
            }
        }
        
        if(e.getSource()==button[3]) {
            String text=button[3].getText();
            if(button[2].getText()=="") {
                button[2].setText(text);
                button[3].setText("");
            }
            if(button[7].getText()=="") {
                button[7].setText(text);
                button[3].setText("");
            }
        }
        
        if(e.getSource()==button[4]) {
            String text=button[4].getText();
            if(button[0].getText()=="") {
                button[0].setText(text);
                button[4].setText("");
            }
            if(button[5].getText()=="") {
                button[5].setText(text);
                button[4].setText("");
            }
            if(button[8].getText()=="") {
                button[8].setText(text);
                button[4].setText("");
            }
        }
        
        if(e.getSource()==button[5]) {
            String text=button[5].getText();
            if(button[1].getText()=="") {
                button[1].setText(text);
                button[5].setText("");
            }
            if(button[4].getText()=="") {
                button[4].setText(text);
                button[5].setText("");
            }
            if(button[6].getText()=="") {
                button[6].setText(text);
                button[5].setText("");
            }
            if(button[9].getText()=="") {
                button[9].setText(text);
                button[5].setText("");
            }
        }
        
        if(e.getSource()==button[6]) {
            String text=button[6].getText();
            if(button[2].getText()=="") {
                button[2].setText(text);
                button[6].setText("");
            }
            if(button[5].getText()=="") {
                button[5].setText(text);
                button[6].setText("");
            }
            if(button[7].getText()=="") {
                button[7].setText(text);
                button[6].setText("");
            }
            if(button[10].getText()=="") {
                button[10].setText(text);
                button[6].setText("");
            }
        }
        
        if(e.getSource()==button[7]) {
            String text=button[7].getText();
            if(button[3].getText()=="") {
                button[3].setText(text);
                button[7].setText("");
            }
            if(button[6].getText()=="") {
                button[6].setText(text);
                button[7].setText("");
            }
            if(button[11].getText()=="") {
                button[11].setText(text);
                button[7].setText("");
            }
        }
        
        if(e.getSource()==button[8]) {
            String text=button[8].getText();
            if(button[4].getText()=="") {
                button[4].setText(text);
                button[8].setText("");
            }
            if(button[9].getText()=="") {
                button[9].setText(text);
                button[8].setText("");
            }
            if(button[12].getText()=="") {
                button[12].setText(text);
                button[8].setText("");
            }
        }
        
        if(e.getSource()==button[9]) {
            String text=button[9].getText();
            if(button[5].getText()=="") {
                button[5].setText(text);
                button[9].setText("");
            }
            if(button[8].getText()=="") {
                button[8].setText(text);
                button[9].setText("");
            }
            if(button[10].getText()=="") {
                button[10].setText(text);
                button[9].setText("");
            }
            if(button[13].getText()=="") {
                button[13].setText(text);
                button[9].setText("");
            }
        }
        
        if(e.getSource()==button[10]) {
            String text=button[10].getText();
            if(button[6].getText()=="") {
                button[6].setText(text);
                button[10].setText("");
            }
            if(button[9].getText()=="") {
                button[9].setText(text);
                button[10].setText("");
            }
            if(button[11].getText()=="") {
                button[11].setText(text);
                button[10].setText("");
            }
            if(button[14].getText()=="") {
                button[14].setText(text);
                button[10].setText("");
            }
        }
        
        if(e.getSource()==button[11]) {
            String text=button[11].getText();
            if(button[7].getText()=="") {
                button[7].setText(text);
                button[11].setText("");
            }
            if(button[10].getText()=="") {
                button[10].setText(text);
                button[11].setText("");
            }
            if(button[15].getText()=="") {
                button[15].setText(text);
                button[11].setText("");
            }
        }
        
        if(e.getSource()==button[12]) {
            String text=button[12].getText();
            if(button[8].getText()=="") {
                button[8].setText(text);
                button[12].setText("");
            }
            if(button[13].getText()=="") {
                button[13].setText(text);
                button[12].setText("");
            }
        }
        
        if(e.getSource()==button[13]) {
            String text=button[13].getText();
            if(button[12].getText()=="") {
                button[12].setText(text);
                button[13].setText("");
            }
            if(button[9].getText()=="") {
                button[9].setText(text);
                button[13].setText("");
            }
            if(button[14].getText()=="") {
                button[14].setText(text);
                button[13].setText("");
            }
        }
        
        if(e.getSource()==button[14]) {
            String text=button[14].getText();
            if(button[13].getText()=="") {
                button[13].setText(text);
                button[14].setText("");
            }
            if(button[10].getText()=="") {
                button[10].setText(text);
                button[14].setText("");
            }
            if(button[15].getText()=="") {
                button[15].setText(text);
                button[14].setText("");
            }
        }
        
        if(e.getSource()==button[15]) {
            String text=button[15].getText();
            if(button[11].getText()=="") {
                button[11].setText(text);
                button[15].setText("");
            }
            if(button[14].getText()=="") {
                button[14].setText(text);
                button[15].setText("");
            }
            
        }
        repaint();
       /* thd = new Thread (new TimerClass());
        thd.start();*/
        if(check()){
            f=1;
        
    }}
    });
        }
}
    //shuffling the numbers for new game
    final void shuffle() {
        Random rand=new Random();
        do {
            reset();
           
            // don't include the blank space in the shuffle, leave it
            // in the home position
            int n = 15;
            while (n > 1) {
                int r = rand.nextInt(n--);
                String tmp = button[n].getText();
                button[n].setText(button[r].getText());
                button[r].setText(tmp);
                //n--;
                repaint();
            }
        } while (!isSolvable());
        
    }
 
    void reset() {
        int j;
        for (int i = 0; i < 15; i++) {
            j=i+1;
            button[i].setText(""+j);
        }
        blankPos = 15;
        button[15].setText("");
    }
    
    public void music(){
             InputStream music1;
        try{
            music1=new FileInputStream(new File("C:\\Users\\win 8.1\\Documents\\NetBeansProjects\\FifteenPuzzle1\\src\\click.wav"));
            audios1=new AudioStream(music1);
            AudioPlayer.player.start(audios1);
}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
}       
    }
    
    public void swoosh(){
             InputStream music1;
        try{
            music1=new FileInputStream(new File("C:\\Users\\win 8.1\\Documents\\NetBeansProjects\\FifteenPuzzle1\\src\\Swoosh.wav"));
            audios2=new AudioStream(music1);
            AudioPlayer.player.start(audios2);
}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
}       
    }
    
    //to check if given combo is solvable or not
    boolean isSolvable() {
        int countInversions = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < i; j++) {
              
                if (button[j].getText()!="" && button[i].getText()!="" && Integer.parseInt(button[j].getText()) > Integer.parseInt(button[i].getText()))
                    countInversions++;
            }
        }
        return countInversions % 2 == 0;
    }
    public void destroy(){
        init();
        repaint();
        start();
    }
     public boolean check(){
        int i;
        for(i=0;i<15;i++){
            String s=button[i].getText();
            if(s.equals(""))
                return false;
            else{
            if (Integer.parseInt(s)==(i+1))
                continue;
            else return false;
            }
        }
        if(button[15].getText()=="")
            return true;
           
        else
            return false;
    }
    
}
