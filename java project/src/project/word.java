package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class word {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      HangMan01 hm = new HangMan01();
      hm.display();
      
   }

}

class HangMan01 extends JFrame implements ActionListener {

   JPanel jnl, jnl1, jnl2, jnl3;
   JButton btn, btn1, btn2;
   JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
   JTextField jtd;
   JLabel jal1, jal2, jal3, jal4, jal5, jal6, jal7;
   
   JOptionPane jtp;
   

   
   
   
   HangMan01() {


      jnl = new JPanel();
      jnl.setLayout(null);
      add(jnl);

      jnl1 = new JPanel();
      jnl1.setLayout(null);
      jnl1.setBackground(Color.LIGHT_GRAY);
      jnl1.setSize(1500, 500);
      jnl1.setLocation(-200, 0);
      jnl.add(jnl1);

      jnl2 = new JPanel();
      jnl2.setLayout(null);
      jnl2.setBackground(Color.CYAN);
      jnl2.setSize(1900, 500);
      jnl2.setLocation(100, 0);
      jnl.add(jnl2);
      
      
      jnl3 = new JPanel();
      jnl3.setLayout(null);
      jnl3.setBackground(Color.pink);
      jnl3.setSize(2000, 1200);
      jnl3.setLocation(0, 50);
      jnl.add(jnl3);

      jal1 = new JLabel();
      jal1.setText("___");
      jal1.setSize(200, 50);
      jal1.setLocation(840, 300);
      jnl1.add(jal1);

      jal2 = new JLabel();
      jal2.setText("___");
      jal2.setSize(200, 50);
      jal2.setLocation(880, 300);
      jnl1.add(jal2);

      jal3 = new JLabel();
      jal3.setText("___");
      jal3.setSize(200, 50);
      jal3.setLocation(920, 300);
      jnl1.add(jal3);

      jal4 = new JLabel();
      jal4.setText("___");
      jal4.setSize(200, 50);
      jal4.setLocation(960, 300);
      jnl1.add(jal4);

      jal5 = new JLabel();
      jal5.setText("___");
      jal5.setSize(200, 50);
      jal5.setLocation(1000, 300);
      jnl1.add(jal5);

      jal6 = new JLabel();
      jal6.setText("___");
      jal6.setSize(200, 50);
      jal6.setLocation(1040, 300);
      jnl1.add(jal6);

      jal7 = new JLabel();
      jal7.setText("___");
      jal7.setSize(200, 50);
      jal7.setLocation(1080, 300);
      jnl1.add(jal7);
       
      
      
      
      jtd = new JTextField(100);
      jtd.setSize(380, 30);
      jtd.setLocation(610, 500);
      jnl3.add(jtd);

      btn = new JButton("Guess the answer");
      btn.setSize(200, 30);
      btn.setLocation(1040, 500);
      jnl3.add(btn);
      btn.addActionListener(this);
      

      a = new JButton("A");
      a.setSize(50, 40);
      a.setLocation(500, 600);
      jnl3.add(a);
      a.addActionListener(this);

      b = new JButton("B");
      b.setSize(50, 40);
      b.setLocation(560, 600);
      jnl3.add(b);
      b.addActionListener(this);

      c = new JButton("C");
      c.setSize(50, 40);
      c.setLocation(620, 600);
      jnl3.add(c);
      c.addActionListener(this);

      d = new JButton("D");
      d.setSize(50, 40);
      d.setLocation(680, 600);
      jnl3.add(d);
      d.addActionListener(this);

      e = new JButton("E");
      e.setSize(50, 40);
      e.setLocation(740, 600);
      jnl3.add(e);
      e.addActionListener(this);

      f = new JButton("F");
      f.setSize(50, 40);
      f.setLocation(800, 600);
      jnl3.add(f);
      f.addActionListener(this);

      g = new JButton("G");
      g.setSize(50, 40);
      g.setLocation(860, 600);
      jnl3.add(g);
      g.addActionListener(this);

      h = new JButton("H");
      h.setSize(50, 40);
      h.setLocation(920, 600);
      jnl3.add(h);
      h.addActionListener(this);

      i = new JButton("i");
      i.setSize(50, 40);
      i.setLocation(980, 600);
      jnl3.add(i);
      i.addActionListener(this);

      j = new JButton("J");
      j.setSize(50, 40);
      j.setLocation(1040, 600);
      jnl3.add(j);
      j.addActionListener(this);

      k = new JButton("K");
      k.setSize(50, 40);
      k.setLocation(1100, 600);
      jnl3.add(k);
      k.addActionListener(this);

      l = new JButton("L");
      l.setSize(50, 40);
      l.setLocation(1160, 600);
      jnl3.add(l);
      l.addActionListener(this);

      m = new JButton("M");
      m.setSize(50, 40);
      m.setLocation(1220, 600);
      jnl3.add(m);
      m.addActionListener(this);

      n = new JButton("N");
      n.setSize(50, 40);
      n.setLocation(1280, 600);
      jnl3.add(n);
      n.addActionListener(this);

      o = new JButton("O");
      o.setSize(50, 40);
      o.setLocation(500, 660);
      jnl3.add(o);
      o.addActionListener(this);

      p = new JButton("P");
      p.setSize(50, 40);
      p.setLocation(560, 660);
      jnl3.add(p);
      p.addActionListener(this);

      q = new JButton("Q");
      q.setSize(50, 40);
      q.setLocation(620, 660);
      jnl3.add(q);
      q.addActionListener(this);

      r = new JButton("R");
      r.setSize(50, 40);
      r.setLocation(680, 660);
      jnl3.add(r);
      r.addActionListener(this);

      s = new JButton("S");
      s.setSize(50, 40);
      s.setLocation(740, 660);
      jnl3.add(s);
      s.addActionListener(this);

      t = new JButton("T");
      t.setSize(50, 40);
      t.setLocation(800, 660);
      jnl3.add(t);
      t.addActionListener(this);

      u = new JButton("U");
      u.setSize(50, 40);
      u.setLocation(860, 660);
      jnl3.add(u);
      u.addActionListener(this);

      v = new JButton("V");
      v.setSize(50, 40);
      v.setLocation(920, 660);
      jnl3.add(v);
      v.addActionListener(this);

      w = new JButton("W");
      w.setSize(50, 40);
      w.setLocation(980, 660);
      jnl3.add(w);
      w.addActionListener(this);

      x = new JButton("X");
      x.setSize(50, 40);
      x.setLocation(1040, 660);
      jnl3.add(x);
      x.addActionListener(this);

      y = new JButton("Y");
      y.setSize(50, 40);
      y.setLocation(1100, 660);
      jnl3.add(y);
      y.addActionListener(this);

      z = new JButton("Z");
      z.setSize(50, 40);
      z.setLocation(1160, 660);
      jnl3.add(z);
      z.addActionListener(this);
      
   }

   void display() {
      setSize(1900, 1000);
      add(jnl);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
      String[] word = new String[10];
      
      word[0] = "mango";
      word[1] = "peach";
      word[2] = "strawberry";
      
      if(e.getSource()==btn)
      {
         if(jtd.getText().equals(word[0]))
         {
            JOptionPane.showMessageDialog(null, "ok");
         }
         
         if(jtd.getText().equals(word[1]))
         {
            JOptionPane.showMessageDialog(null, "ok");
         }
         
         if(jtd.getText().equals(word[2]))
         {
            JOptionPane.showMessageDialog(null, "ok");
         }
         
         else
         {
            JOptionPane.showMessageDialog(null, "no");
         }
      }
      
      if(e.getSource()==a)
      {
         if(word[0].equals("mango"))
         {
            jal2.setText("a");
         }
         
         //else if(word[1].equals("peach"))
         //{
         //   jal3.setText("a");
         //}
         
         //else if(word[2].equals("strawberry"))
         //{
         //   jal4.setText("a");
         //}
      }
      
      //if(e.getSource()== b)
   //   {   
      //   if(word[2].equals("strawberry"))
      //   {
      //      jal6.setText("b");
      //   }
   //   }
      
      //if(e.getSource()== c)
      //{   
      //   if(word[1].equals("peach"))
      //   {
       //     jal4.setText("c");
      //   }
   //   }
      
      if(e.getSource()== d)
      {   
         jal1.setText("D");
      }
      
      if(e.getSource()== e)
      {   
         jal1.setText("E");
      }
      
      if(e.getSource()== f)
      {   
         jal1.setText("F");
      }
      
      if(e.getSource()== g)
      {   
         if(word[0].equals("mango"))
         {
             jal4.setText("g");
         }
      }
      
      if(e.getSource()== h)
      {   
         jal1.setText("H");
      }
      
      if(e.getSource()== i)
      {   
         jal1.setText("I");
      }
      
      if(e.getSource()== j)
      {   
         jal1.setText("J");
      }
      
      if(e.getSource()== k)
      {   
         jal1.setText("K");
      }
      
      if(e.getSource()== l)
      {   
         jal1.setText("L");
      }
      
      if(e.getSource()== m)
      {   
         if(word[0].equals("mango"))
         {
             jal1.setText("M");
         }
      }
      
      if(e.getSource()== n)
      {   
         if(word[0].equals("mango"))
         {
             jal3.setText("n");
         }
      }
      
      if(e.getSource()== o)
      {   
         if(word[0].equals("mango"))
         {
             jal5.setText("o");
         }
      }
      
      if(e.getSource()== p)
      {   
         jal1.setText("P");
      }
      
      if(e.getSource()== q)
      {   
         jal1.setText("Q");
      }
      
      //if(e.getSource()== r)
      //{   
         //if(word[2].equals("strawberry"))
         //{
            //jal3.setText("r");
         //}
      //}
      
      //if(e.getSource()== s)
      //{   
         //if(word[2].equals("strawberry"))
         //{
            //jal1.setText("S");
         //}
      //}
      
      //if(e.getSource()== t)
      //{   
         //if(word[2].equals("strawberry"))
         //{
            //jal2.setText("t");
         //}
      //}
      
      if(e.getSource()== u)
      {   
         jal1.setText("U");
      }
      
      if(e.getSource()== v)
      {   
         jal1.setText("V");
      }
      
      if(e.getSource()== w)
      {   
         jal1.setText("W");
      }
      
      if(e.getSource()== x)
      {   
         jal1.setText("X");
      }
      
      if(e.getSource()== y)
      {   
         jal1.setText("Y");
      }
      
      if(e.getSource()== z)
      {   
         jal1.setText("Z");
      }
      
      class MyPanel extends JPanel
      {
         public void paintComponent(Graphics g)
         {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawLine(20, 20, 100, 100);
            //jnl2.add();
         }
         
      }
      
   }
   

   

}
