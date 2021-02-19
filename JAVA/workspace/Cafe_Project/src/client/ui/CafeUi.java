package client.ui;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import common.entity.MemberDTO;
import common.entity.OrderDTO;
import common.entity.ProductDTO;
import common.util.CafeException;
import server.service.MemberService;
import server.service.OrderService;
import server.service.ProductService;


public class CafeUi extends Frame{
	
	MemberService mservice;
	ProductService pService;
	OrderService oService;
	
	TextField tf_memId, tf_memName,tf_phone,tf_prodCode,tf_prodName,tf_prodPrice,tf_orderMem,tf_orderProd,tf_orderQuan;
	Button btn_memInsert,btn_memUpdate,btn_memSelect,btn_memDelete,btn_prodInsert,btn_prodUpdate,btn_prodSelect,btn_prodDelete;
	Button btn_order;
	TextArea ta_mem,ta_prod,ta_order;
	
	
			
	@Override
	public void setVisible(boolean b) {
		try {
			mservice=new MemberService();
			pService = new ProductService();
			oService=new OrderService();
		} catch (CafeException e1) {
			System.out.println(e1.getMessage()+"???¤í?? ì¢?ë£?");
			System.exit(0);
		}
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setLayout(new GridLayout(1,3,20,0));
		memberPanel();//ê³?ê°???
		productPanel();	//??????
		ordersPanel();//ì£¼ë¬¸??
		
		
		setLocation(200,200);
		pack();
		eventProcess();
		setMemberList();
		setProductList();
		super.setVisible(b);
	}
	
	private void setProductList() {
		try {
			ArrayList<ProductDTO> list=pService.selectProduct();
			ta_prod.setText("");
			for(ProductDTO p:list) {
				ta_prod.append(p.getProdCode()+"\t"+p.getProdName()+"\t"+p.getPrice()+"\n");
			}
		} catch (CafeException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
		
	}

	private void setMemberList() {
		// ??ë©? ?¨ì??ë§??? ëª¨ë?? ê³?ê°? ë¦¬ì?¤í?¸ê? ë³´ì?´ê?
		try {
			
			ArrayList<MemberDTO> list=mservice.selectMember();
			ta_mem.setText("");
			for(MemberDTO m:list) {
				ta_mem.append(m.getMemId()+"\t"+m.getName()+"\t"+m.getmDate()+"\t"+m.getPhone()+"\t"+m.getPoint()+"\n");
			}
		} catch (CafeException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
		
	}

	private void ordersPanel() {
		Panel orderPanel=new Panel();
		Panel orderPanel_sub1=new Panel();
		Panel orderPanel_sub2=new Panel();
		Panel orderPanel_sub3=new Panel();
		tf_orderMem=new TextField(20);
		tf_orderProd=new TextField(20);
		tf_orderQuan=new TextField(20);
		
		btn_order=new Button("ì£¼ë¬¸??ê¸?");

		ta_order=new TextArea();
	
		add(orderPanel);
		orderPanel.setLayout(new GridLayout(3,1,0,20));
		orderPanel_sub3.add(ta_order);
		orderPanel.add(orderPanel_sub3);
		orderPanel.add(orderPanel_sub1);
		orderPanel.add(orderPanel_sub2);
		orderPanel_sub1.setLayout(new GridLayout(3,3,0,10));	

		orderPanel_sub1.add(new Label("        ê³?ê°?ëª?"));		
		orderPanel_sub1.add(tf_orderMem);
		orderPanel_sub1.add(new Label());
		orderPanel_sub1.add(new Label("        ????ëª?"));
		orderPanel_sub1.add(tf_orderProd);
		orderPanel_sub1.add(new Label());
		orderPanel_sub1.add(new Label("        ????"));
		orderPanel_sub1.add(tf_orderQuan);
		orderPanel_sub1.add(new Label());
		orderPanel_sub2.add(btn_order);
		
		orderPanel.setBackground(new Color(120,150,051));
		
		btn_order.setPreferredSize(new Dimension(80,80));
		
	}
	
	private void productPanel() {
		Panel productPanel=new Panel();
		Panel productPanel_sub1=new Panel();
		Panel productPanel_sub2=new Panel();
		Panel productPanel_sub3=new Panel();
		tf_prodCode=new TextField(20);
		tf_prodName=new TextField(20);
		tf_prodPrice=new TextField(20);
		btn_prodInsert=new Button("?±ë?");
		btn_prodUpdate=new Button("????");
		btn_prodSelect=new Button("ì¡°í??");
		btn_prodDelete=new Button("????");
		ta_prod=new TextArea();
	
		add(productPanel);
		productPanel.setLayout(new GridLayout(3,1,0,20));
		productPanel_sub3.add(ta_prod);
		productPanel.add(productPanel_sub3);
		productPanel.add(productPanel_sub1);
		productPanel.add(productPanel_sub2);
		productPanel_sub1.setLayout(new GridLayout(3,3,0,10));	

		productPanel_sub1.add(new Label("        ???? ì½???"));		
		productPanel_sub1.add(tf_prodCode);
		productPanel_sub1.add(new Label());
		productPanel_sub1.add(new Label("        ????ëª?"));
		productPanel_sub1.add(tf_prodName);
		productPanel_sub1.add(new Label());
		productPanel_sub1.add(new Label("        ê°?ê²?"));
		productPanel_sub1.add(tf_prodPrice);
		productPanel_sub1.add(new Label());
		productPanel_sub2.add(btn_prodInsert);
		productPanel_sub2.add(btn_prodUpdate);
		productPanel_sub2.add(btn_prodSelect);
		productPanel_sub2.add(btn_prodDelete);
		productPanel.setBackground(new Color(204,204,051));
		
		btn_prodInsert.setPreferredSize(new Dimension(80,80));
		btn_prodUpdate.setPreferredSize(new Dimension(80,80));
		btn_prodSelect.setPreferredSize(new Dimension(80,80));
		btn_prodDelete.setPreferredSize(new Dimension(80,80));
	}
	
	private void memberPanel() {
		Panel memberPanel=new Panel();
		Panel memberPanel_sub1=new Panel();
		Panel memberPanel_sub2=new Panel();
		Panel memberPanel_sub3=new Panel();
		tf_memId=new TextField(20);
		tf_memName=new TextField(20);
		tf_phone=new TextField(20);
		btn_memInsert=new Button("ê°???");
		btn_memUpdate=new Button("????");
		btn_memSelect=new Button("ì¡°í??");
		btn_memDelete=new Button("????");
		ta_mem=new TextArea();
		
		add(memberPanel);
		memberPanel.setLayout(new GridLayout(3,1,0,20));
		memberPanel_sub3.add(ta_mem);
		memberPanel.add(memberPanel_sub3);
		memberPanel.add(memberPanel_sub1);
		memberPanel.add(memberPanel_sub2);
		memberPanel_sub1.setLayout(new GridLayout(3,3,0,10));	

		memberPanel_sub1.add(new Label("        ê³?ê°? ID"));		
		memberPanel_sub1.add(tf_memId);
		memberPanel_sub1.add(new Label());
		memberPanel_sub1.add(new Label("        ê³?ê°?ëª?"));
		memberPanel_sub1.add(tf_memName);
		memberPanel_sub1.add(new Label());
		memberPanel_sub1.add(new Label("        ????ë²???"));
		memberPanel_sub1.add(tf_phone);
		memberPanel_sub1.add(new Label());
		memberPanel_sub2.add(btn_memInsert);
		memberPanel_sub2.add(btn_memUpdate);
		memberPanel_sub2.add(btn_memSelect);
		memberPanel_sub2.add(btn_memDelete);
		memberPanel.setBackground(new Color(204,153,102));
		
		btn_memInsert.setPreferredSize(new Dimension(80,80));
		btn_memUpdate.setPreferredSize(new Dimension(80,80));
		btn_memSelect.setPreferredSize(new Dimension(80,80));
		btn_memDelete.setPreferredSize(new Dimension(80,80));
	}



	private void eventProcess() {
		
		//ì£¼ë¬¸
		btn_order.addActionListener(e->{
			String memId=tf_memId.getText();
			String prodCode=tf_prodCode.getText();
			int quantity=Integer.parseInt(tf_orderQuan.getText());
			OrderDTO o=new OrderDTO(quantity, memId, prodCode, "kiosk");
			try {
				int orderNo=oService.insertOrder(o);
				if(orderNo>0) {
					JOptionPane.showMessageDialog(CafeUi.this, "ì£¼ë¬¸ ??ë£? : ì£¼ë¬¸ë²??? [ "+orderNo+" ] ");
				}else {
					JOptionPane.showMessageDialog(CafeUi.this, "ì£??¡í?©ë????. ?¤ì?? ì£¼ë¬¸ ?´ì£¼?¸ì??");
				}
			} catch (CafeException e1) {
				JOptionPane.showMessageDialog(CafeUi.this, e1.getMessage());
			}
		});
		
		//????ì¡°í??
		btn_prodSelect.addActionListener(e-> { //???¤ì??
				String prodCode=tf_prodCode.getText();
				try {
					String prodName=pService.selectProduct(prodCode);
					if(prodName==null) {
						JOptionPane.showMessageDialog(CafeUi.this, "???? ì½???ë¥? ???¸í?? ì£¼ì?¸ì??");
					}else {
						tf_orderProd.setText(prodName);
					}
				} catch (CafeException e1) {
					JOptionPane.showMessageDialog(CafeUi.this, e1.getMessage());
				}
				
			}
		);
		
		
		//???? ?±ë?
		btn_prodInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String prodCode=tf_prodCode.getText();
				String prodName=tf_prodName.getText();
				int price=Integer.parseInt(tf_prodPrice.getText());
				ProductDTO p=new ProductDTO(prodCode, prodName, price);
				
				try {
					
					pService.insertProduct(p);
					setProductList();
					JOptionPane.showMessageDialog(CafeUi.this, "???? ?±ë? ??ë£?");
				} catch (CafeException e1) {
					JOptionPane.showMessageDialog(CafeUi.this, e1.getMessage());
				}
				
				
			}
		});
		
		// ê³?ê°? ì¡°í??		
		btn_memSelect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String memId= tf_memId.getText();
				try {
					String memName=mservice.selectMember(memId);
					if(memName==null) {
						JOptionPane.showMessageDialog(CafeUi.this, "ê³?ê°? IDë¥? ???¸í?? ì£¼ì?¸ì??");
					}else {
						tf_orderMem.setText(memName);
					}
				} catch (CafeException e1) {
					JOptionPane.showMessageDialog(CafeUi.this, e1.getMessage());
				}
				
			}
		});
		
		btn_memInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ê°???
				String memId= tf_memId.getText();
				String memName=tf_memName.getText();
				String phone=tf_phone.getText();
				Date now=new Date();
				MemberDTO m=new MemberDTO(memId,memName,now,phone);
				System.out.println(m);
				try {
					
					mservice.insertMember(m);
					setMemberList();
					tf_memId.setText("");
					tf_memName.setText("");
					tf_phone.setText("");
					JOptionPane.showMessageDialog(CafeUi.this, "ê°??? ???¨ì?µë????.");
				} catch (CafeException e1) {
					JOptionPane.showMessageDialog(CafeUi.this, e1.getMessage());
				}
				
			}
		});
		
	}

}
