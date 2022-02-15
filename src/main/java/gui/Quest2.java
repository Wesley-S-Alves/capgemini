package gui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Quest2 extends javax.swing.JFrame {

    public Quest2() {
        initComponents();
        checaSenha(jTextFieldSenha.getText());
    }
    
    
    public void checaSenha(String senha){
        Pattern minuscula = Pattern.compile("[a-z]");//define o padrão de compilação para letras minúsculas entre a e z.
        Pattern maiuscula = Pattern.compile("[A-Z]");//define o padrão de compilação para letras maísculas entre A e Z.
        Pattern numero = Pattern.compile("[0-9]");//define o padrão de compilação para os algarismos.
        Pattern especial = Pattern.compile("[!@#$%^&*()--+]");// define o padrão do que é considerado caracter especial.
        Matcher temMinuscula = minuscula.matcher(senha);
        Matcher temMaiuscula = maiuscula.matcher(senha);
        Matcher temNumero = numero.matcher(senha);
        Matcher temEspecial = especial.matcher(senha);
        boolean checaMinuscula = temMinuscula.find();// a função find faz a procura do padrão de compilação escolhido dentro da String.
        boolean checaMaiuscula = temMaiuscula.find();
        boolean checaNumero = temNumero.find();
        boolean checaEspecial = temEspecial.find();
        StringBuilder check = new StringBuilder("<html>");
        if (senha.length()< 6) { // checa o tamanho da String.
            check.append("sua senha possui apenas " + senha.length() +
                    " caracteres, faltando " + (6 - senha.length()) + " caracteres"
                            + " para ser considerada uma senha segura.<br>");
        }
        if(!checaEspecial){ // checa a presença de caracteres especiais.
            check.append("<br>Adicione pelo menos um destes caracteres especiais: !@#$%^&*()-+<br>");
        }
        if(!checaMinuscula){//checa a presença de letras minúsculas.
            check.append("<br>Adicione uma letra minúscula a senha.<br>");
        }
        if(!checaMaiuscula){//checa a presença de letras maiúsculas.
            check.append("<br>Adicione uma letra maiúscula a senha.<br>");
        }
        if(!checaNumero){//checa a presença de números
            check.append("<br>Adicione um número a senha.<br>");
        }

        if(senha.length()>5 && checaEspecial && checaMaiuscula && checaMinuscula && checaNumero){ // checa se a senha pode ser considerada segura.
            check.append("<br>A senha inserida é segura.<br>");
        }
        
        check.append("</html>");
        jLabelVerificaSenha.setText(check.toString());
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jLabelVerificaSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Questão 2");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jLabel2.setText("Insira a senha: ");

        jTextFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSenhaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSenhaKeyTyped(evt);
            }
        });

        jLabelVerificaSenha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelVerificaSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldSenha)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelVerificaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabelVerificaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Verificador de Senhas");

        jButtonCancela.setText("Voltar");
        jButtonCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButtonCancela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancela)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelaActionPerformed
        this.dispose();// sai da tela da Questao 2
    }//GEN-LAST:event_jButtonCancelaActionPerformed

    private void jTextFieldSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSenhaKeyTyped
        checaSenha(jTextFieldSenha.getText());//chama a função checaSenha ao usar o teclado
    }//GEN-LAST:event_jTextFieldSenhaKeyTyped

    private void jTextFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSenhaKeyPressed
        checaSenha(jTextFieldSenha.getText());//chama a função checaSenha ao usar o teclado
    }//GEN-LAST:event_jTextFieldSenhaKeyPressed

    private void jTextFieldSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSenhaKeyReleased
        checaSenha(jTextFieldSenha.getText());//chama a função checaSenha ao usar o teclado
    }//GEN-LAST:event_jTextFieldSenhaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quest2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelVerificaSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldSenha;
    // End of variables declaration//GEN-END:variables
}
