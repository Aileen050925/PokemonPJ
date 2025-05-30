package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class PokemonAttack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// 🔹 멤버 변수로 선언
	private JLabel EnemyRealHP;
	private JProgressBar EnemyprogressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PokemonAttack frame = new PokemonAttack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PokemonAttack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// 🔸 공격 버튼 생성 및 이벤트 등록
		JButton AttackButton = new JButton("공격하기!");
		AttackButton.setBounds(287, 218, 117, 36);
		contentPane.add(AttackButton);

		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.activeCaptionBorder);
		textArea.setColumns(3);
		textArea.setBounds(36, 201, 381, 65);
		contentPane.add(textArea);

		JLabel Mypokemon = new JLabel("피카츄");
		Mypokemon.setForeground(SystemColor.activeCaption);
		Mypokemon.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Mypokemon.setBounds(152, 128, 61, 16);
		contentPane.add(Mypokemon);

		JLabel Enemypokemon = new JLabel("파이리");
		Enemypokemon.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		Enemypokemon.setBounds(244, 31, 44, 16);
		contentPane.add(Enemypokemon);

		JLabel 피카츄 = new JLabel("");
		피카츄.setIcon(new ImageIcon(PokemonAttack.class.getResource("/images/피카츄2.png")));
		피카츄.setBounds(36, 59, 135, 145);
		contentPane.add(피카츄);

		JLabel 파이리 = new JLabel("");
		파이리.setIcon(new ImageIcon(PokemonAttack.class.getResource("/images/파이리2.png")));
		파이리.setBounds(299, 0, 118, 130);
		contentPane.add(파이리);

		JLabel MYRealHP = new JLabel("100");
		MYRealHP.setBounds(303, 173, 61, 16);
		contentPane.add(MYRealHP);

		JLabel bar = new JLabel("/");
		bar.setBounds(325, 173, 25, 16);
		contentPane.add(bar);

		JLabel MyHP = new JLabel("HP");
		MyHP.setBounds(140, 156, 61, 16);
		contentPane.add(MyHP);

		JLabel MYFullHP = new JLabel("100");
		MYFullHP.setBounds(333, 173, 61, 16);
		contentPane.add(MYFullHP);

		JProgressBar MyprogressBar = new JProgressBar();
		MyprogressBar.setValue(100);
		MyprogressBar.setForeground(new Color(255, 17, 0));
		MyprogressBar.setBounds(162, 156, 190, 20);
		contentPane.add(MyprogressBar);

		JLabel EnemyHP = new JLabel("HP");
		EnemyHP.setBounds(72, 46, 61, 16);
		contentPane.add(EnemyHP);

		// 🔹 멤버 변수 초기화
		EnemyRealHP = new JLabel("100");
		EnemyRealHP.setBounds(219, 59, 61, 16);
		contentPane.add(EnemyRealHP);

		JLabel bar2 = new JLabel("/");
		bar2.setBounds(244, 59, 25, 16);
		contentPane.add(bar2);

		JLabel EnemyFullHP = new JLabel("100");
		EnemyFullHP.setBounds(254, 59, 61, 16);
		contentPane.add(EnemyFullHP);

		// 🔹 멤버 변수 초기화
		EnemyprogressBar = new JProgressBar();
		EnemyprogressBar.setValue(100);
		EnemyprogressBar.setForeground(new Color(255, 17, 0));
		EnemyprogressBar.setBounds(94, 46, 190, 20);
		contentPane.add(EnemyprogressBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PokemonAttack.class.getResource("/images/전투배경숲.jpg")));
		lblNewLabel.setBounds(0, 0, 450, 272);
		contentPane.add(lblNewLabel);

		// 🔸 공격 버튼 이벤트 처리: HP 10씩 감소
		AttackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentHP = Integer.parseInt(EnemyRealHP.getText());
				currentHP = Math.max(currentHP - 10, 0); // 0 이하로는 안내려가게

				EnemyRealHP.setText(String.valueOf(currentHP));
				EnemyprogressBar.setValue(currentHP);
			}
		});
	}

	public void updateEnemyHP(int hp) {
		// TODO Auto-generated method stub
	}

	public void appendBattleLog(String string) {
		// TODO Auto-generated method stub
	}

	public void showGameOver(String string) {
		// TODO Auto-generated method stub
	}
}
