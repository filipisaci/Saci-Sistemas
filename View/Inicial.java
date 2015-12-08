package view;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author filipi
 */
public class Inicial extends javax.swing.JFrame {

    //Instanciando outro frame para poder chamar
    ViewOatCliente viewOatCliente2 = new ViewOatCliente();

    public Inicial() {
        initComponents();
        definirIcone();
        //define resolucao
        setSize(getResolucao().width, getResolucao().height - 40);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMBBarraPrincial = new javax.swing.JMenuBar();
        jMAssistenciaTenica = new javax.swing.JMenu();
        jMIRelCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMPcp = new javax.swing.JMenu();
        jMenuItemOspPorCliente = new javax.swing.JMenuItem();
        jMPCM = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMContabilidade = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMSair = new javax.swing.JMenu();
        jMISair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saci Sistemas - Natreb & Monferrato");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setName("Relatórios Natreb"); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Logo Monferrato Fundo.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1024, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("© 2014-2016 Filipi Souza. Todos os direitos reservados.");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(313, 313, 313))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jMAssistenciaTenica.setText("    Assistência Técnica    ");
        jMAssistenciaTenica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAssistenciaTenicaActionPerformed(evt);
            }
        });

        jMIRelCliente.setText("Relatório para clientes");
        jMIRelCliente.setName(""); // NOI18N
        jMIRelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRelClienteActionPerformed(evt);
            }
        });
        jMAssistenciaTenica.add(jMIRelCliente);

        jMenuItem1.setText("Consulta Despesas por Período");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMAssistenciaTenica.add(jMenuItem1);

        jMenuItem2.setText("ORs por Produto Final");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMAssistenciaTenica.add(jMenuItem2);

        jMBBarraPrincial.add(jMAssistenciaTenica);

        jMPcp.setText("    PCP    ");

        jMenuItemOspPorCliente.setText("OSP por Cliente");
        jMenuItemOspPorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOspPorClienteActionPerformed(evt);
            }
        });
        jMPcp.add(jMenuItemOspPorCliente);

        jMBBarraPrincial.add(jMPcp);

        jMPCM.setText("PCM");

        jMenuItem4.setText("Consulta de Material Utilizado por Período ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMPCM.add(jMenuItem4);

        jMBBarraPrincial.add(jMPCM);

        jMContabilidade.setText("Contabilidade");

        jMenuItem3.setText("Custo Unitário das Mercadorias");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMContabilidade.add(jMenuItem3);

        jMBBarraPrincial.add(jMContabilidade);

        jMSair.setText("    Sair    ");

        jMISair.setText("Sair");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMSair.add(jMISair);

        jMBBarraPrincial.add(jMSair);

        setJMenuBar(jMBBarraPrincial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jMIRelClienteActionPerformed(java.awt.event.ActionEvent evt) {                                              
        viewOatCliente2 = new ViewOatCliente();
        viewOatCliente2.setLocationRelativeTo(null);
        viewOatCliente2.setVisible(true);
        viewOatCliente2.setResizable(false);
    }                                             

    private void jMAssistenciaTenicaActionPerformed(java.awt.event.ActionEvent evt) {                                                    

    }                                                   

    private void jMenuItemOspPorClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        ViewOspPorCliente tela = new ViewOspPorCliente();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        tela.setResizable(true);
    }                                                      

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.exit(0);
    }                                       

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ViewRelatorioDespesasViagens tela = new ViewRelatorioDespesasViagens();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        tela.setResizable(true);
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ViewOrPorMaquinaFinal tela = new ViewOrPorMaquinaFinal();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        tela.setResizable(true);
    }                                          

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ViewCustoUnitarioMateriais tela = new ViewCustoUnitarioMateriais();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        tela.setResizable(true);
    }                                          

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ViewOrdemServico tela = new ViewOrdemServico();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        tela.setResizable(true);
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicial().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMAssistenciaTenica;
    private javax.swing.JMenuBar jMBBarraPrincial;
    private javax.swing.JMenu jMContabilidade;
    private javax.swing.JMenuItem jMIRelCliente;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenu jMPCM;
    private javax.swing.JMenu jMPcp;
    private javax.swing.JMenu jMSair;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemOspPorCliente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   

    private void definirIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logoMenor.jpg")));
    }

    private Dimension getResolucao() {
        Dimension resolucaoAtual = Toolkit.getDefaultToolkit().getScreenSize();
        return resolucaoAtual;
    }
}
