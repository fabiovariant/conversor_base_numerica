package br.unasp.conversor.view;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import br.unasp.conversor.commons.Select;

public class TelaFinal extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaFinal() {
        initComponents();
    }
	
	
	
    private javax.swing.JButton bntConverter;
    public static javax.swing.JComboBox<String> comboBoxBase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private static javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtSaidaBinario;
    private javax.swing.JTextField txtSaidaDecimal;
    private javax.swing.JTextField txtSaidaHexadecimal;
    private javax.swing.JTextField txtSaidaOctal;

    
    
   static void alerta(String a, String b){
	   JOptionPane.showMessageDialog(txtNumber,a,b, JOptionPane.ERROR_MESSAGE); 
	   System.out.println("Mensagem de alerta : "+ a +" - "+ b);
   }
    
    private void initComponents() {

    	jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNumber = new javax.swing.JTextField();
        bntConverter = new javax.swing.JButton();
        comboBoxBase = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSaidaBinario = new javax.swing.JTextField();
        txtSaidaOctal = new javax.swing.JTextField();
        txtSaidaDecimal = new javax.swing.JTextField();
        txtSaidaHexadecimal = new javax.swing.JTextField();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntConverter.setText("Converter");
        bntConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConverterActionPerformed(evt);
            }
        });
        

        comboBoxBase.setModel(new DefaultComboBoxModel<>(new String[] { "Bin", "Oct", "Dec", "Hex" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(comboBoxBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(bntConverter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntConverter)
                .addGap(9, 9, 9))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Bin�rio");

        jLabel2.setText("Octal");

        jLabel3.setText("Decimal");

        jLabel4.setText("Hexadecimal");
        
        
        txtSaidaBinario.setEditable(false);
        txtSaidaDecimal.setEditable(false);
        txtSaidaHexadecimal.setEditable(false);
        txtSaidaOctal.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSaidaBinario)
                    .addComponent(txtSaidaOctal)
                    .addComponent(txtSaidaDecimal)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtSaidaHexadecimal))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaidaBinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaidaOctal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaidaDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaidaHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnConverter(){
    	 String a = txtNumber.getText();
         
         if( !verify(a)){
     		
         	txtSaidaBinario.setText(x);
             txtSaidaOctal.setText(x);
             txtSaidaDecimal.setText(x);
             txtSaidaHexadecimal.setText(x);
     		
         }if (a.length() > 10){
     		
     		txtSaidaBinario.setText(x);
             txtSaidaOctal.setText(x);
             txtSaidaDecimal.setText(x);
             txtSaidaHexadecimal.setText(x);
     		
     		JOptionPane.showMessageDialog(txtNumber, "Digite um valor de at� 10 digitos.", "M�ximo alcan�ado", JOptionPane.ERROR_MESSAGE);  
     		
     		
     	
     	}else{
     		Select select = new Select();
     		Map<String, String> map = new HashMap<String, String>();
     		
     		map = select.selectBase(txtNumber.getText(), comboBoxBase.getSelectedItem().toString());
     		
     		txtSaidaBinario.setText(map.get("bin"));
     		txtSaidaOctal.setText(map.get("oct"));
     		txtSaidaDecimal.setText(map.get("dec"));
     		txtSaidaHexadecimal.setText(map.get("hex"));
 	    }
    }
    
    private void bntConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConverterActionPerformed
    	btnConverter();
    }
    
    public static boolean verify(String text){
    	
    	String combo = (String)TelaFinal.comboBoxBase.getSelectedItem();
    	
    	for (int i = 0; i < text.length(); i++) {

    		if(text.substring(i,i+1).equals("0") == true){
    		}else if(text.substring(i,i+1).equals("1")){
    		}else if(text.substring(i,i+1).equals("2")){
    		}else if(text.substring(i,i+1).equals("3")){
    		}else if(text.substring(i,i+1).equals("4")){
    		}else if(text.substring(i,i+1).equals("5")){
    		}else if(text.substring(i,i+1).equals("6")){
    		}else if(text.substring(i,i+1).equals("7")){
    		}else if(text.substring(i,i+1).equals("8")){
    		}else if(text.substring(i,i+1).equals("9")){
    		}else if(text.substring(i,i+1).equals("0")){
    		}else if(text.substring(i,i+1).equals("a") && combo.equals("Hex")){
    		}else if(text.substring(i,i+1).equals("b") && combo.equals("Hex")){
    		}else if(text.substring(i,i+1).equals("c") && combo.equals("Hex")){
    		}else if(text.substring(i,i+1).equals("d") && combo.equals("Hex") ){
    		}else if(text.substring(i,i+1).equals("e") && combo.equals("Hex")){
    		}else if(text.substring(i,i+1).equals("f") && combo.equals("Hex")){
    		}else if(text.substring(i,i+1).equals("A") && combo.equals("Hex")){
    		}else if(text.substring(i,i+1).equals("B") && combo.equals("Hex")){
    		}else if(text.substring(i,i+1).equals("C") && combo.equals("Hex")){
    		}else if(text.substring(i,i+1).equals("D") && combo.equals("Hex")){
    		}else if(text.substring(i,i+1).equals("E") && combo.equals("Hex")){}
    		else if(text.substring(i,i+1).equals("F") && combo.equals("Hex"))
    		{}
    		else{
    			switch(combo){
    			case "Bin":
    				TelaFinal.alerta("O digito "+text.charAt(i)+" � invalido\n para o tipo bin�rio.","Caractere inv�lido");
    			break;
    			case "Oct":
    				TelaFinal.alerta("O digito "+text.charAt(i)+" � invalido\n para o tipo Octal.","Caractere inv�lido");
    			break;
    			case "Dec":
    				TelaFinal.alerta("O digito "+text.charAt(i)+" � invalido\n para o tipo Decimal.","Caractere inv�lido");
    			break;
    			case "Hex":
    				TelaFinal.alerta("O digito "+text.charAt(i)+" � invalido\n para o tipo Hexadecimal.","Caractere inv�lido");
    			break;
    			}
    			return false;
    		}	
    	}
    	return true;
        }
    
    public static void main(String args[]) {
    	autoTest();
    	
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (java.lang.NumberFormatException ex) {
        	java.util.logging.Logger.getLogger(TelaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFinal().setVisible(true);
            }
        });
    
        
    }

    private void testeComponents(){
    	System.out.println("Teste de Componentes\n");
    	System.out.println("Paineis:");
    	System.out.println("Painel 1 = "+jPanel1.isEnabled());
    	System.out.println("Painel 2 = "+jPanel2.isEnabled());
    	System.out.println("Painel 3 = "+jPanel3.isEnabled());
    	System.out.println("Painel 4 = "+jPanel4.isEnabled());
    	
    	System.out.println("\nBot�o:");
    	System.out.println("Bot�o (Converter) = "+bntConverter.isEnabled());
    	
    	System.out.println("\nComboBox:");
    	System.out.println("ComboBox 1 = "+comboBoxBase.isEnabled());
    	
    	System.out.println("\nLabels:");
    	System.out.println("Label 1 = "+jLabel1.isEnabled());
    	System.out.println("Label 2 = "+jLabel2.isEnabled());
    	System.out.println("Label 3 = "+jLabel3.isEnabled());
    	System.out.println("Label 4 = "+jLabel4.isEnabled());
    	
    	System.out.println("\n�reas de texto:");
    	System.out.println("TxtArea (txtNumber) = "+txtNumber.isEnabled());
    	System.out.println("CxSaida (bin) = "+txtSaidaBinario.isEnabled());
    	System.out.println("CxSaida (oct) = "+txtSaidaOctal.isEnabled());
    	System.out.println("CxSaida (dec) = "+txtSaidaDecimal.isEnabled());
    	System.out.println("CxSaida (hex) = "+txtSaidaHexadecimal.isEnabled());   
    }
    Scanner s = new Scanner(System.in);
    public static  TelaFinal t = new TelaFinal();
    private void testVerify(){
    	
    	for(int i =0; i < 5; i++){
    	TelaFinal.txtNumber.setText(s.nextLine());
    	System.out.println("\nBin�rio");
    	comboBoxBase.setSelectedItem("Bin");
    	t.btnConverter();
    	System.out.println("Octal");
    	comboBoxBase.setSelectedItem("Oct");
    	t.btnConverter();
    	System.out.println("decimal");
    	comboBoxBase.setSelectedItem("Dec");
    	t.btnConverter();
    	System.out.println("Hexadecimal");
    	comboBoxBase.setSelectedItem("Hex");
    	t.btnConverter();
    	}
    }
    
    public static void autoTest (){
        t.testeComponents();
        System.out.println("\n");
        alerta("Mensagem de erro", "T�tulo");
        t.testVerify();
        }
    
    
    private String x = "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";

}