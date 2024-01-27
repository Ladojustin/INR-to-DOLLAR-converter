import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Frame implements ActionListener {
    Frame f;
    TextField tf;
    double num1;
    double num2 = 0.012;
    double num3;
    public Main(){

        Frame f = new Frame();

        tf = new TextField();
        Button con  = new Button("CONVERT");
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");


        f.add(tf);
        f.pack();
        f.add(con);
        f.add(btn0);
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.add(btn5);
        f.add(btn6);
        f.add(btn7);
        f.add(btn8);
        f.add(btn9);

        f.setVisible(true);
        f.setLayout(new GridLayout(6,6));

        con.addActionListener(this);
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);


    }

    public void actionPerformed(ActionEvent ae){

        String str = ae.getActionCommand();
        if(str.matches("[0-9]")){

            tf.setText(tf.getText()  + str);

        }else if(str.equals("CONVERT")){
            try {

                num1 = Double.parseDouble(tf.getText());
                num3 = num1 * num2;
                tf.setText(String.valueOf(num3));
            }catch(Exception e){

                tf.setText("Invalid");
            }
        }


    }


    public static void main(String[] args){

        new Main();
    }
}