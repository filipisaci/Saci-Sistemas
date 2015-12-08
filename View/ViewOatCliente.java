package view;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.OatDao;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelo.Oat;

/**
 * @author filipi
 */
public class ViewOatCliente extends javax.swing.JFrame {

    List<OatDao> listaOat;
    Oat oatCliente = new Oat();

    public ViewOatCliente() {
        initComponents();
        definirIcone();
        this.getRootPane().setDefaultButton(jBPesquisar);
        desabilitaDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jBPesquisar = new javax.swing.JButton();
        jLOat = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLDescricaoCliente = new javax.swing.JLabel();
        jTDescricaoCliente = new javax.swing.JTextField();
        jTCodigoCliente = new javax.swing.JTextField();
        jLCodigoOat = new javax.swing.JLabel();
        jLSat = new javax.swing.JLabel();
        jLDataAbertura = new javax.swing.JLabel();
        jTDataAbertura = new javax.swing.JTextField();
        jLSolicitante = new javax.swing.JLabel();
        jTSolicitante = new javax.swing.JTextField();
        jLNumeroSerie = new javax.swing.JLabel();
        jLProblemaRelatado = new javax.swing.JLabel();
        jLServicoExecutado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTServicoExecutado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTProblemaRelatado = new javax.swing.JTextArea();
        jTSat = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTANumeroSerie = new javax.swing.JTextArea();
        jBPdf = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jTPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Ordens de Assistência Técnica");
        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setName("Relatório de OAT para Cliente"); // NOI18N

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLOat.setText("OAT");

        jLDescricaoCliente.setText("Cliente");

        jLCodigoOat.setText("Código");

        jLSat.setText("SAT");

        jLDataAbertura.setText("Data abertura");

        jLSolicitante.setText("Solicitante");

        jLNumeroSerie.setText("Número de Série");

        jLProblemaRelatado.setText("Problema Relatado");

        jLServicoExecutado.setText("Serviço Executado");

        jTServicoExecutado.setColumns(20);
        jTServicoExecutado.setLineWrap(true);
        jTServicoExecutado.setRows(5);
        jScrollPane1.setViewportView(jTServicoExecutado);

        jTProblemaRelatado.setColumns(20);
        jTProblemaRelatado.setLineWrap(true);
        jTProblemaRelatado.setRows(5);
        jScrollPane2.setViewportView(jTProblemaRelatado);

        jTANumeroSerie.setColumns(20);
        jTANumeroSerie.setRows(5);
        jScrollPane3.setViewportView(jTANumeroSerie);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLSat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTSat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDataAbertura)
                    .addComponent(jTDataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLSolicitante)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLProblemaRelatado)
                    .addComponent(jLNumeroSerie)
                    .addComponent(jLServicoExecutado)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLCodigoOat, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jTCodigoCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDescricaoCliente)
                            .addComponent(jTDescricaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescricaoCliente)
                    .addComponent(jLCodigoOat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDescricaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSat)
                    .addComponent(jLDataAbertura)
                    .addComponent(jLSolicitante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTSat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDataAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLNumeroSerie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLProblemaRelatado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLServicoExecutado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jBPdf.setText("PDF");
        jBPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPdfActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLOat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jBPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar)
                    .addComponent(jLOat)
                    .addComponent(jBPdf)
                    .addComponent(jBLimpar)
                    .addComponent(jTPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Relatório de OAT para Cliente");
        getAccessibleContext().setAccessibleDescription("Relatório de OAT para Cliente");

        pack();
    }// </editor-fold>                        

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            listaOat();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao executar sua SQL!\n" + ex);
        } catch (ParseException ex) {
            Logger.getLogger(ViewOatCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                           

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {                                         
        limparDados();
    }                                        

    private void jBPdfActionPerformed(java.awt.event.ActionEvent evt) {                                      
        criaPdf();
    }                                     

    private void criaPdf() {
        try {
            //define tamanho da página e as margens esquerda, direita, em cima e embaixo
            Document oat = new Document(PageSize.A4, 30, 30, 1, 30);
            PdfWriter pw;

            //Pega o caminho absoluto do desktop do usuário
            File file = new File(System.getProperty("user.home") + "\\Desktop\\", "oat-" + oatCliente.getCodOAT() + "-" + oatCliente.getCodClienteSolicit() + ".pdf");
            if (!file.exists()) {
                file.createNewFile();
            }
            try (OutputStream os = new FileOutputStream(file)) {
                pw = PdfWriter.getInstance(oat, os);

                oat.open();

                //Insere a Logo
                Image logo = Image.getInstance(getClass().getResource("cabecalho.jpg"));
                logo.setAlignment(Element.ALIGN_CENTER);

                Font f1 = new Font(FontFamily.HELVETICA, 28, Font.BOLD);
                Font f2 = new Font(FontFamily.HELVETICA, 12);
                Font f3 = new Font(FontFamily.HELVETICA, 12, Font.BOLD);

                Paragraph titulo = new Paragraph("Laudo de Assistência Técnica", f1);
                titulo.setAlignment(Element.ALIGN_CENTER);

                Paragraph separador1 = new Paragraph("________________________________________________________________________________", f2);
                separador1.setAlignment(Element.ALIGN_CENTER);
                separador1.setSpacingAfter(20);

                Paragraph separador2 = new Paragraph("________________________________________________________________________________", f2);
                separador2.setAlignment(Element.ALIGN_CENTER);
                separador2.setSpacingAfter(1);
               
                Paragraph oatParagraph = new Paragraph("OAT: " + this.oatCliente.getCodOAT(), f2);
                oatParagraph.setAlignment(Element.ALIGN_LEFT);

                Paragraph cliente = new Paragraph("Cliente: " + this.oatCliente.getCodClienteSolicit()
                        + " - " + this.oatCliente.getFantasiaCliente(), f2);
                cliente.setAlignment(Element.ALIGN_LEFT);

                SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
                String formatada = data.format(this.oatCliente.getDataAbertura());

                Paragraph satEdata = new Paragraph("SAT: " + this.oatCliente.getCodSAT()
                        + "     " + "Data de Abertura: " + formatada, f2);
                satEdata.setAlignment(Element.ALIGN_JUSTIFIED);

                Paragraph nomeSolicitante = new Paragraph("Solicitante: " + this.oatCliente.getNomeSolicit(), f2);
                nomeSolicitante.setAlignment(Element.ALIGN_JUSTIFIED);

                //não precisa trartar, porque já foi tratado quando foi exibido
                //nos text filds
                Paragraph numerosDeSeries = new Paragraph("Números de Séries: "
                        + this.oatCliente.getCodNumSerie(), f2);
                numerosDeSeries.setAlignment(Element.ALIGN_JUSTIFIED);

                Paragraph problemaTitulo = new Paragraph("Problema Relatado: ", f3);
                problemaTitulo.setAlignment(Element.ALIGN_JUSTIFIED);

                Paragraph problema = new Paragraph(this.oatCliente.getProblema(), f2);
                problema.setAlignment(Element.ALIGN_JUSTIFIED);

                Paragraph servicoTitulo = new Paragraph("Serviço Executado: ", f3);
                servicoTitulo.setAlignment(Element.ALIGN_LEFT);

                Paragraph servicoExecutado = new Paragraph(this.oatCliente.getServicoExecutado(), f2);
                servicoExecutado.setAlignment(Element.ALIGN_JUSTIFIED);

                //Criando um rodapé para inserir o número de páginas
                int numberOfPages = oat.getPageNumber();
                Paragraph pages = new Paragraph("Página: " + String.valueOf(numberOfPages + 1), f3);

                Rectangle page = oat.getPageSize();

                PdfPTable tabela = new PdfPTable(1);
                PdfPCell cabecalhoTabela = new PdfPCell(pages);
                cabecalhoTabela.setBorder(0);
                cabecalhoTabela.setHorizontalAlignment(Element.ALIGN_CENTER);
                cabecalhoTabela.setVerticalAlignment(Element.ALIGN_BOTTOM);
                tabela.addCell(cabecalhoTabela);

                //adiciona o Document
                tabela.setTotalWidth(page.getWidth() - oat.leftMargin() - oat.rightMargin());
                tabela.writeSelectedRows(0, -1, oat.leftMargin(), oat.bottomMargin(), pw.getDirectContent());

                oat.addAuthor("Filipi Souza");
                oat.add(logo);
                oat.add(titulo);
                oat.add(separador1);
                oat.add(oatParagraph);
                oat.add(cliente);
                oat.add(separador2);
                oat.add(satEdata);
                oat.add(nomeSolicitante);
                oat.add(numerosDeSeries);
                oat.add(separador2);
                oat.add(problemaTitulo);
                oat.add(problema);
                oat.add(separador2);
                oat.add(servicoTitulo);
                oat.add(servicoExecutado);
                oat.add(separador2);

                oat.close();
                os.close();

                //Abrir o arquivo criado
                String caminho = System.getProperty("user.home") + "\\Desktop" + "\\oat-" + oatCliente.getCodOAT() + "-" + oatCliente.getCodClienteSolicit() + ".pdf";
                Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + caminho);

            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!\n" + ex);
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao invocar o PdfWriter!\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fechar o stream do Pdf!\n");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Não há dados para gerar o Pdf!\n");
        }
    }

    private void desabilitaDados() {
        jTDataAbertura.setEditable(false);
        jTDescricaoCliente.setEditable(false);
        jTANumeroSerie.setEditable(false);
        //jTOat.setEditable(false);
        jTProblemaRelatado.setEditable(false);
        jTSat.setEditable(false);
        jTServicoExecutado.setEditable(false);
        jTSolicitante.setEditable(false);
        jTCodigoCliente.setEditable(false);
    }

    private void listaOat() throws SQLException, ParseException {
        Oat oat = new OatDao().getLista(jTPesquisa.getText());
        mostraPesquisa(oat);
    }

    private void mostraPesquisa(Oat oat) {
        try {
            SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
            oatCliente.setCodOAT(oat.getCodOAT());
            oatCliente.setCodSAT(oat.getCodSAT());
            oatCliente.setDataAbertura(oat.getDataAbertura());
            if (oat.getProblema() == null) {
                oatCliente.setProblema("Não especificado!");
            } else {
                oatCliente.setProblema(oat.getProblema());
            }
            oatCliente.setNomeSolicit(oat.getNomeSolicit());
            oatCliente.setCodClienteSolicit(oat.getCodClienteSolicit());
            oatCliente.setFantasiaCliente(oat.getFantasiaCliente());
            //tratando a exibição quando tem subpiece para descricao da maquina
            if (oat.getDescricaoMaquina2() == null && oat.getDescricaoMaquina3() == null && oat.getDescricaoMaquina4() == null) {
                oatCliente.setCodNumSerie(oat.getCodNumSerie() + " - "
                        + oat.getDescricaoMaquina1());
                oat.setDescricaoMaquina2("");
                oat.setDescricaoMaquina3("");
                oat.setDescricaoMaquina4("");
            } else if (oat.getDescricaoMaquina3() == null && oat.getDescricaoMaquina4() == null) {
                oatCliente.setCodNumSerie(oat.getCodNumSerie() + " - "
                        + oat.getDescricaoMaquina1()
                        + " " + oat.getDescricaoMaquina2());
                oat.setDescricaoMaquina3("");
                oat.setDescricaoMaquina4("");
            } else if (oat.getDescricaoMaquina4() == null) {
                oatCliente.setCodNumSerie(oat.getCodNumSerie() + " - "
                        + oat.getDescricaoMaquina1()
                        + " " + oat.getDescricaoMaquina2()
                        + " " + oat.getDescricaoMaquina3());
                oat.setDescricaoMaquina4("");
            } else {
                oatCliente.setCodNumSerie(oat.getCodNumSerie() + " - "
                        + oat.getDescricaoMaquina1()
                        + " " + oat.getDescricaoMaquina2()
                        + " " + oat.getDescricaoMaquina3()
                        + " " + oat.getDescricaoMaquina4());
            }
            if (oat.getServicoExecutado() == null) {
                oatCliente.setServicoExecutado("Não especificado!");
            } else {
                oatCliente.setServicoExecutado(oat.getServicoExecutado());
            }
            jTServicoExecutado.setText(oatCliente.getServicoExecutado());
            jTDescricaoCliente.setText(oatCliente.getFantasiaCliente());
            //Exibe data formatada
            jTDataAbertura.setText(String.valueOf(formataData.format(oatCliente.getDataAbertura())));
            jTANumeroSerie.setText(oatCliente.getCodNumSerie());
            jTSat.setText(String.valueOf(oatCliente.getCodSAT()));
            jTSolicitante.setText(oatCliente.getNomeSolicit());
            jTProblemaRelatado.setText(oatCliente.getProblema());
            jTCodigoCliente.setText(String.valueOf(oatCliente.getCodClienteSolicit()));

        } catch (NullPointerException ex) {
            limparDados();
            JOptionPane.showMessageDialog(null, "Oat não encontarda!\n");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //fazer com que o botão que esteja com o foco se torne o padrão.
                UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);
                new ViewOatCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPdf;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JLabel jLCodigoOat;
    private javax.swing.JLabel jLDataAbertura;
    private javax.swing.JLabel jLDescricaoCliente;
    private javax.swing.JLabel jLNumeroSerie;
    private javax.swing.JLabel jLOat;
    private javax.swing.JLabel jLProblemaRelatado;
    private javax.swing.JLabel jLSat;
    private javax.swing.JLabel jLServicoExecutado;
    private javax.swing.JLabel jLSolicitante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTANumeroSerie;
    private javax.swing.JTextField jTCodigoCliente;
    private javax.swing.JTextField jTDataAbertura;
    private javax.swing.JTextField jTDescricaoCliente;
    private javax.swing.JTextField jTPesquisa;
    private javax.swing.JTextArea jTProblemaRelatado;
    private javax.swing.JTextField jTSat;
    private javax.swing.JTextArea jTServicoExecutado;
    private javax.swing.JTextField jTSolicitante;
    // End of variables declaration                   

    private void limparDados() {
        jTPesquisa.setText("");
        jTServicoExecutado.setText("");
        jTDescricaoCliente.setText("");
        jTDataAbertura.setText("");
        jTANumeroSerie.setText("");
        jTSat.setText("");
        jTSolicitante.setText("");
        jTProblemaRelatado.setText("");
        jTCodigoCliente.setText("");
    }

    private void definirIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logoMenor.jpg")));
    }
}
