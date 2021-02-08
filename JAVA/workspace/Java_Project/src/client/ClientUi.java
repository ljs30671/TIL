package client;

import java.awt.*;
import java.awt.event.*;

import javax.swing.BoxLayout;

public class ClientUi {

	public static void main(String[] args) {

		Frame f = new Frame("MyChat");
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		Checkbox cb1 = new Checkbox("밥");
		Checkbox cb2 = new Checkbox("빵");
		Checkbox cb3 = new Checkbox("물");
		
		CheckboxGroup cbG = new CheckboxGroup();
		Checkbox cb4 = new Checkbox("학사",cbG,true);
		Checkbox cb5 = new Checkbox("석사",cbG,false);
		Checkbox cb6 = new Checkbox("박사",cbG,false);
		
		Button b1 = new Button("전송");
		Button b2 = new Button("패널2");
		TextField tf = new TextField("", 20);
		TextArea ta = new TextArea();

		WindowListener fHandler=new MyFrameHandler();
		f.addWindowListener(fHandler);
		
		MyButtonHandler b1Handler = new MyButtonHandler();
		b1Handler.setTextArea(ta);
		b1Handler.setTextField(tf);
		b1.addActionListener(b1Handler);
		
		//enter칠때 전송 하기 위함
		tf.addActionListener(b1Handler);

		f.add(ta, BorderLayout.CENTER);
		f.add(p1, BorderLayout.SOUTH);
		f.add(p2, BorderLayout.EAST);
		p1.add(tf);
		p1.add(b1);
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);
		p2.add(cb4);
		p2.add(cb5);
		p2.add(cb6);
		p2.add(b2);
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		
		p2.setBackground(Color.gray);
		p1.setBackground(Color.gray);

		f.setSize(800, 500);
		f.setLocation(800, 200);
		// Color bgColor=new Color(235,0,0);
		f.setBackground(Color.ORANGE);
		f.setVisible(true);

	}

}
