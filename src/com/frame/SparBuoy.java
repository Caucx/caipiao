package com.frame;

import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import com.allpanel.Apanel;

public class SparBuoy extends JDialog {
	JTabbedPane tp = new JTabbedPane();// ����ѡ����
	public SparBuoy() {// �������ƶԻ���Ĺ��췽��
		setTitle("��������");// ���ú������ƶԻ���ı���
		setResizable(false);// ���ɸı�������ƶԻ���Ĵ�С
		// ���ú������ƶԻ���Ĵ���ͼ��
		setIconImage(
			Toolkit.getDefaultToolkit().getImage(SparBuoy.class.getResource("/imgs/log.png"))
			);
		tp.add("��һλ", new Apanel());// �ѵ�һλ������������������ӵ�ѡ������
		this.getContentPane().add(tp);// ��ѡ������ӵ��������ƶԻ�������������
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// ���Ǻ������ƶԻ���Ĺرշ�ʽ
		this.setBounds(450, 100, 563, 593);// ���ú������ƶԻ����λ�úͿ��
	}
	public static void main(String[] args) {
		try {
			// ���ú������ƶԻ������ʽ
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		new SparBuoy();// �����������ƶԻ������
	}

}
