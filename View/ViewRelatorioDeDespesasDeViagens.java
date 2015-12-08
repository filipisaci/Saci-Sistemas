package view;

import dao.RelatorioDespesasViagensDao;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.RelatorioDespesasViagens;
import modelo.RelatorioDespesasViagensTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * @author -Filipi
 */
public class ViewRelatorioDespesasViagens extends javax.swing.JFrame {

    private List<RelatorioDespesasViagens> lista;
    private RelatorioDespesasViagensTableModel tabelaModelo;
    private TableRowSorter<RelatorioDespesasViagensTableModel> organizaTabela;
    DecimalFormat decimal = new DecimalFormat("###,###.###");
    SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

    public ViewRelatorioDespesasViagens() {
        initComponents();
        desabilitaDados();
        definirIcone();
        setSize(getResolucao().width, getResolucao().height - 40);
        this.getRootPane().setDefaultButton(jBConsultar);
        filtraAutomatico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTTotalGasto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTTotalHospedagem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTTotalRefeicoes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTTotalTransporte = new javax.swing.JTextField();
        jBConsultar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBXls = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTFiltro = new javax.swing.JTextField();
        jTDataFinal = new javax.swing.JFormattedTextField();
        jTDataInicial = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTTotalOutrasDespesas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTTotalTelefonema = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Despesas por Período");

        jLabel1.setText("Data Inicial: ");

        jLabel2.setText("Data Final: ");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Total Gasto:");

        jTTotalGasto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTTotalGasto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Hospedagem:");

        jTTotalHospedagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTTotalHospedagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Refeições:");

        jTTotalRefeicoes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTTotalRefeicoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Transporte:");

        jTTotalTransporte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTTotalTransporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBXls.setText("XLS");
        jBXls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBXlsActionPerformed(evt);
            }
        });

        jLabel7.setText("Filtro: ");

        try {
            jTDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jTDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Outras Despesas:");

        jTTotalOutrasDespesas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTTotalOutrasDespesas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Telefonema:");

        jTTotalTelefonema.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTTotalTelefonema.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jBConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBXls))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTotalGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTotalHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTotalRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTotalTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTotalOutrasDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTTotalTelefonema, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBXls)
                        .addComponent(jBLimpar)
                        .addComponent(jBConsultar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jTTotalTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTotalHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTTotalGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTTotalRefeicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTTotalOutrasDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTTotalTelefonema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {                                         
        limparDados();
    }                                        

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        pesquisa();
    }                                           

    private void jBXlsActionPerformed(java.awt.event.ActionEvent evt) {                                      
        exportaXLS();
    }                                     

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRelatorioDespesasViagens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBXls;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jTDataFinal;
    private javax.swing.JFormattedTextField jTDataInicial;
    private javax.swing.JTextField jTFiltro;
    private javax.swing.JTextField jTTotalGasto;
    private javax.swing.JTextField jTTotalHospedagem;
    private javax.swing.JTextField jTTotalOutrasDespesas;
    private javax.swing.JTextField jTTotalRefeicoes;
    private javax.swing.JTextField jTTotalTelefonema;
    private javax.swing.JTextField jTTotalTransporte;
    private javax.swing.JTable tabela;
    // End of variables declaration                   

    private void desabilitaDados() {
        jTTotalGasto.setEditable(false);
        jTTotalHospedagem.setEditable(false);
        jTTotalRefeicoes.setEditable(false);
        jTTotalTransporte.setEditable(false);
        jTTotalOutrasDespesas.setEditable(false);
        jTTotalTelefonema.setEditable(false);
    }

    private void limparDados() {
        jTTotalGasto.setText("");
        jTTotalHospedagem.setText("");
        jTTotalRefeicoes.setText("");
        jTTotalTransporte.setText("");
        jTTotalTelefonema.setText("");
        jTTotalOutrasDespesas.setText("");
        jTDataFinal.setText("");
        jTDataInicial.setText("");
        jTFiltro.setText("");
        tabela.setModel(new DefaultTableModel());
        lista = null;
    }

    private void definirIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logoMenor.jpg")));
    }

    private void filtraAutomatico() {
        //atvida digitação e já vai filtrando
        jTFiltro.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent arg0) {
                String filtro = jTFiltro.getText().trim();
                //somente para nao dar erro quando não há nada para filtrar!!
                try {
                    organizaTabela.setRowFilter(RowFilter.regexFilter("(?i)" + filtro));
                } catch (NullPointerException ex) {
                    System.out.println("Estão tentando filtrar null\n" + ex);
                }
                if (organizaTabela == null) {
                    organizaTabela = new TableRowSorter<>(tabelaModelo);
                    tabela.setRowSorter(organizaTabela);
                }
            }
        });
    }

    private void ordena() {
        if (organizaTabela == null) {
            organizaTabela = new TableRowSorter<>(tabelaModelo);
            tabela.setRowSorter(organizaTabela);
        }
    }

    private Dimension getResolucao() {
        Dimension resolucaoAtual = Toolkit.getDefaultToolkit().getScreenSize();
        return resolucaoAtual;
    }

    private void populaTabela() {
        tabelaModelo = new RelatorioDespesasViagensTableModel(lista);
        tabela.setModel(tabelaModelo);
        ordena();

        //define largura fixa para as colunas
        tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(25);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(25);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(250);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(7).setPreferredWidth(25);
    }

    private void pesquisa() {
        try {
            RelatorioDespesasViagensDao dao = new RelatorioDespesasViagensDao();
            this.lista = dao.getLista(jTDataInicial.getText(), jTDataFinal.getText());
            populaTabela();
            jTTotalGasto.setText("R$ " + decimal.format(dao.getValorTotalGeral()));
            jTTotalHospedagem.setText("R$ " + decimal.format(dao.getValorTotalHospedagem()));
            jTTotalRefeicoes.setText("R$ " + decimal.format(dao.getValorTotalRefeicoes()));
            jTTotalTransporte.setText("R$ " + decimal.format(dao.getValorTotalTransporte()));
            jTTotalOutrasDespesas.setText("R$ " + decimal.format(dao.getValorTotalOutrasDespesas()));
            jTTotalTelefonema.setText("R$ " + decimal.format(dao.getValorTotalTelefonema()));
            //Ativa opção para organizar tabela acendente ou descendente
            this.organizaTabela = new TableRowSorter<>(tabelaModelo);
            this.tabela.setRowSorter(organizaTabela);
        } catch (IllegalArgumentException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar a data!\n" + ex);
        }
    }

    private void exportaXLS() {
        Row linha = null;
        Cell celula = null;
        String caminho = System.getProperty("user.home") + "\\Relatorio-de-Despesas.xls";

        RelatorioDespesasViagensDao dao = new RelatorioDespesasViagensDao();
        this.lista = dao.getLista(jTDataInicial.getText(), jTDataFinal.getText());
        
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pesquise algo antes de exportar!\n");
        } else {
            try {
                FileOutputStream out = new FileOutputStream(caminho);
                Workbook planilha = new HSSFWorkbook();
                Sheet guia = planilha.createSheet();
                Row cabecalho = guia.createRow((short) 0);

                DataFormat formatoData = planilha.createDataFormat();
                DataFormat formatoMoeda = planilha.createDataFormat();

                //Cria estilos
                CellStyle EstiloNegrito = planilha.createCellStyle();
                CellStyle EstiloData = planilha.createCellStyle();
                CellStyle EstiloMoeda = planilha.createCellStyle();

                Font font1 = planilha.createFont();
                font1.setBoldweight(Font.BOLDWEIGHT_BOLD);

                EstiloNegrito.setFont(font1);
                //EstiloData.setDataFormat(formatoData.getFormat("#,##0.0"));
                EstiloData.setDataFormat(formatoData.getFormat("dd/MM/yyyy"));
                //EstiloMoeda.setDataFormat(formatoMoeda.getFormat("[$R$-416] #.##0,00;([$R$-416] #.##0,00)"));
                EstiloMoeda.setDataFormat(formatoMoeda.getFormat("[$R$-416] 0.00"));

                //seta nome para guia 0
                planilha.setSheetName(0, "Plan 1");
                //define os valores de forma manual para o cabeçalho
                celula = cabecalho.createCell((short) 0);
                celula.setCellValue("Número Relatório");
                celula.setCellStyle(EstiloNegrito);
                celula = cabecalho.createCell((short) 1);
                celula.setCellValue("Sequência do Lançamento da Despesa");
                celula.setCellStyle(EstiloNegrito);
                celula = cabecalho.createCell((short) 2);
                celula.setCellValue("Tipo da Despesa");
                celula.setCellStyle(EstiloNegrito);
                celula = cabecalho.createCell((short) 3);
                celula.setCellValue("Data da Despesa");
                celula.setCellStyle(EstiloNegrito);
                celula = cabecalho.createCell((short) 4);
                celula.setCellValue("Número do Documento");
                celula.setCellStyle(EstiloNegrito);
                celula = cabecalho.createCell((short) 5);
                celula.setCellValue("Histórico da Despesa");
                celula.setCellStyle(EstiloNegrito);
                celula = cabecalho.createCell((short) 6);
                celula.setCellValue("Dias Hospedados");
                celula.setCellStyle(EstiloNegrito);
                celula = cabecalho.createCell((short) 7);
                celula.setCellValue("Valor da Despesa");
                celula.setCellStyle(EstiloNegrito);

                //instancia uma nova linha
                int numeroDaLinha = 1;
                for (RelatorioDespesasViagens relatorio : lista) {
                    linha = guia.createRow(numeroDaLinha);
                    //instancia numero de linhas
                    short numeroDaColuna = 0;
                    //cria a celula de acordo com o numero da coluna naquela linha
                    celula = linha.createCell(numeroDaColuna);
                    celula.setCellValue(relatorio.getCodRelatorio());
                    celula = linha.createCell(numeroDaColuna + 1);
                    celula.setCellValue(relatorio.getCodDespesa());
                    celula = linha.createCell(numeroDaColuna + 2);
                    celula.setCellValue(Double.valueOf(relatorio.getCodTipoDespesa()));
                    celula = linha.createCell(numeroDaColuna + 3);
                    celula.setCellValue(relatorio.getDataDocumento());
                    celula.setCellStyle(EstiloData);
                    celula = linha.createCell(numeroDaColuna + 4);
                    celula.setCellValue(relatorio.getDocumentDespesa());
                    celula = linha.createCell(numeroDaColuna + 5);
                    celula.setCellValue(relatorio.getHistorico());
                    celula = linha.createCell(numeroDaColuna + 6);
                    celula.setCellValue(Double.valueOf(relatorio.getDiasHospedagem()));
                    celula = linha.createCell(numeroDaColuna + 7);
                    celula.setCellValue(relatorio.getValorDespesa());
                    celula.setCellStyle(EstiloMoeda);
                    numeroDaColuna++;
                    numeroDaLinha++;
                }

                //Abrir o arquivo criado
                Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + caminho);

                planilha.write(out);
                out.close();

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo!\n" + ex);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao fechar e salvar o arquivo!\n" + ex);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao pesquisar!\n" + ex);
            } catch (IndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro!\n" + ex);
            }
        }
    }
}
