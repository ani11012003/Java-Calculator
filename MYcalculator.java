import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calculator extends JFrame{
    calculator(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    JLabel  l1=new JLabel("MY calculator");
    l1.setBounds(60,10,300,30);
    l1.setFont(new Font("Arial", Font.BOLD,30));
    l1.setForeground(Color.red);
    add(l1);
    JTextField t1=new JTextField(60);
    JTextField t2=new JTextField(60);
    JButton b1=new JButton("+");
    JButton b2=new JButton("-");
    JButton b3=new JButton("/");
    JButton b4=new JButton("*");
    JButton b5=new JButton("%"); 
    JButton b6=new JButton("x^y");
    JButton b7=new JButton("ln");
    JButton b8=new JButton("log");
    JButton b9=new JButton("Sin(rad)");
    JButton b10=new JButton("cos(rad)");
    JButton b11=new JButton("tan(rad)");
    JButton b12=new JButton("Sin(dg)");
    JButton b13=new JButton("cos(dg)");
    JButton b14=new JButton("tan(dg)");
    JButton b15=new JButton("HCF");
    JButton b16=new JButton("LCM");
    t1.setBounds(100,60,120,30);
    t2.setBounds(100,100,120,30);
    b1.setBounds(100,140,60,30);
    b2.setBounds(160,140,60,30);
    b3.setBounds(100,180,60,30);
    b4.setBounds(160,180,60,30);
    b5.setBounds(100,220,60,30);
    b6.setBounds(160,220,60,30);
    b7.setBounds(100,260,60,30);
    b8.setBounds(160,260,60,30);
    b9.setBounds(20,140,80,30);
    b10.setBounds(20,180,80,30);
    b11.setBounds(20,220,80,30);
    b12.setBounds(220,140,80,30);
    b13.setBounds(220,180,80,30);
    b14.setBounds(220,220,80,30);
    b15.setBounds(20,260,80,30);
    b16.setBounds(220,260,80,30);
    JLabel l2=new JLabel("");
    l2.setBounds(250,100,300,40);
    add(l2);
    add(t1);
    add(t2);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    add(b10);
    add(b11);
    add(b12);
    add(b13);
    add(b14);
    add(b15);
    add(b16);
    b1.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double y=Double.parseDouble(t2.getText());
            Double sum=x+y;
            t1.setText(Double.toString(sum));
            l2.setText("Sum:- "+sum);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b2.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double y=Double.parseDouble(t2.getText());
            double sub=x-y;
            t1.setText(Double.toString(sub));
            l2.setText("difference:- "+sub);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b4.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double y=Double.parseDouble(t2.getText());
            double mul=x*y;
            t1.setText(Double.toString(mul));
            l2.setText("multiplication:- "+mul);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b3.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double y=Double.parseDouble(t2.getText());
            double div=x/y;
            t1.setText(Double.toString(div));
            l2.setText("division:-  "+div);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b5.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            int mod=x%y;
            l2.setText("modulo:-  "+mod);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b6.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double y=Double.parseDouble(t2.getText());
            double ans=Math.pow(x,y);
            t1.setText(Double.toString(ans));
            l2.setText("answer:-  "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b7.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double ans=Math.log(x);
            t1.setText(Double.toString(ans));
            l2.setText("answer:-  "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b8.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double ans=Math.log(x)/Math.log(10);
            t1.setText(Double.toString(ans));
            l2.setText("answer:-  "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b9.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double ans=Math.sin(x);
            t1.setText(Double.toString(ans));
            l2.setText("answer:-  "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b10.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double ans=Math.cos(x);
            l2.setText("answer:-  "+ans);
            t1.setText(Double.toString(ans));
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b11.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double ans=Math.tan(x);
            t1.setText(Double.toString(ans));
            l2.setText("answer:-  "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b12.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double ans=Math.sin((3.14159/180)*x);
            t1.setText(Double.toString(ans));
            l2.setText("answer:-  "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b13.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double ans=Math.cos((3.14159/180)*x);
            t1.setText(Double.toString(ans));
            l2.setText("answer:-  "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b14.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            double x=Double.parseDouble(t1.getText());
            double ans=Math.tan((3.14159/180)*x);
            t1.setText(Double.toString(ans));
            l2.setText("answer:-  "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b15.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            int ans=0;
            int minimum=Math.min(x,y);
            for(int i=1;i<=minimum;i++){
                if(x%i==0&&y%i==0){
                    ans=i;
                }
            }
            l2.setText("HCF:- "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    b16.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent ae){
            int x=Integer.parseInt(t1.getText());
            int y=Integer.parseInt(t2.getText());
            int maximum=Math.max(x,y);
            while(true){
                if(maximum%x==0&&maximum%y==0){
                    break;
                }
                maximum++;
            }
            int ans=maximum;
            l2.setText("LCM:- "+ans);
            l2.setFont(new Font("Arial",Font.BOLD,20));
        }
    });
    }
   
}
class MYcalculator {
    public static void main(String[] args){
        calculator c=new calculator();
        c.setBounds(400,200,400,350);
        c.setVisible(true);
    }
}