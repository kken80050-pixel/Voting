package voting;

import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.*;
import java.awt.event.ItemEvent;
import javax.swing.UIManager;

public class Vote extends javax.swing.JFrame {
    private String name;
    private String voterid;
    private String age;
    private String address;
    public Vote(String votersname, String voterid, String age, String address){
        this.name = votersname;
        this.voterid = voterid;
        this.age = age;
        this.address = address;
        loadDataFile();
        voterdata.loadvoter();
        initComponents();
        
    }
    private static int votechair2 = 0;
    private static int votechair3 = 0;
    private static int votetrea1 = 0;
    private static int votetrea3 = 0;
    private static int votesec1 = 0;
    private static int votesec2 = 0;
    private static int votekg1 = 0;
    private static int votekg2 = 0;
    private static int votekg3 = 0;
    private static int votekg4 = 0;
    private static int votekg5 = 0;
    private static int votekg6 = 0;
    private static int votekg7 = 0;
    private static int votekg8 = 0;
    private static int votekg9 = 0;
    private static int votekg10 = 0;
    private static int votekg11 = 0;
    private static int votekg12 = 0;
    private static int votekg13 = 0;
    private static int votekg14 = 0;
    
    private static List<String> voters = new ArrayList<>();
    
    private static final String VOTERS = "votersname.txt";
    //chairperson
    private static final String carlos = "voter/Carlos.txt";
    private static final String maria = "voter/Maria.txt";
    //treasurer
    private static final String mark = "voter/Mark.txt";
    private static final String romeo = "voter/Romeo.txt";
    //secretary
    private static final String kristine = "voter/Kristine.txt";
    private static final String michaela = "voter/Michaela.txt";
    //kagawad
    private static final String miguel = "voter/Miguel.txt";
    private static final String jomar = "voter/Jomar.txt";
    private static final String paulo = "voter/Paulo.txt";
    private static final String rina = "voter/Rina.txt";
    private static final String gabriel = "voter/Gabriel.txt";
    private static final String marco = "voter/Marco.txt";
    private static final String daniela = "voter/Daniela.txt";
    private static final String patricia = "voter/Patricia.txt";
    private static final String rafael = "voter/Rafael.txt";
    private static final String liza = "voter/Liza.txt";
    private static final String jericho = "voter/Jericho.txt";
    private static final String leah = "voter/Leah.txt";
    private static final String althea = "voter/Althea.txt";
    private static final String carlo = "voter/Carlo.txt";
    
    public Vote() {
        super("E-Voting");
        initComponents();
    }
    private static void loadDataFile(){
        try{
            if(Files.exists(Paths.get(VOTERS))){
                voters = Files.readAllLines(Paths.get(VOTERS));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        //chairperson
        votechair2 = loadvotecount(carlos);
        votechair3 = loadvotecount(maria);
        //treasurer
        votetrea1 = loadvotecount(mark);
        votetrea3 = loadvotecount(romeo);
        //secretary
        votesec1 = loadvotecount(kristine);
        votesec2 = loadvotecount(michaela);
        //kagawad
        votekg1 = loadvotecount(miguel);
        votekg2 = loadvotecount(jomar);
        votekg3 = loadvotecount(paulo);
        votekg4 = loadvotecount(rina);
        votekg5 = loadvotecount(gabriel);
        votekg6 = loadvotecount(marco);
        votekg7 = loadvotecount(daniela);
        votekg8 = loadvotecount(patricia);
        votekg9 = loadvotecount(rafael);
        votekg10 = loadvotecount(liza);
        votekg11 = loadvotecount(jericho);
        votekg12 = loadvotecount(leah);
        votekg13 = loadvotecount(althea);
        votekg14 = loadvotecount(carlo);
    }
    
    private static int loadvotecount( String filename){
        try {
            if (Files.exists(Paths.get(filename))){
                String content = Files.readString(Paths.get(filename)).trim();
                if (content.isEmpty()) return 0;
                String[] parts =content.split(",");
                if(parts.length == 2){
                    return Integer.parseInt(parts[1].trim());
                }
            }
        } catch (IOException | NumberFormatException e){
            e.printStackTrace();
        }
        return 0;
    }
    
    private static void savevotecount(String filename, String name, int count){
        String content = name + "," + count;
        try {
            Files.writeString(Paths.get(filename), content);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    private int kagawadvote(){
        int count = 0;
        if (jRadioButton1.isSelected()) count++;
        if (jRadioButton5.isSelected()) count++;
        if (jRadioButton7.isSelected()) count++;
        if (jRadioButton8.isSelected()) count++;
        if (jRadioButton9.isSelected()) count++;
        if (jRadioButton10.isSelected()) count++;
        if (jRadioButton11.isSelected()) count++;
        if (jRadioButton12.isSelected()) count++;
        if (jRadioButton13.isSelected()) count++;
        if (jRadioButton14.isSelected()) count++;
        if (jRadioButton15.isSelected()) count++;
        if (jRadioButton18.isSelected()) count++;
        if (jRadioButton19.isSelected()) count++;
        if (jRadioButton20.isSelected()) count++;
        return count;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jRadioButton19 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(426, 1000));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(874, 750));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(426, 1200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SK VOTING");

        jLabel3.setText("<html> <b>Instruction:<b> "
            + "<br/>Click Circle to Vote.<html>" + "<br/>Click the names to view PartyList members");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("for Chairperson");

        jLabel6.setText("Maria Santos");

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Carlos Antonio Reyes");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("SUBMIT VOTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("for Treasurer");

        jLabel11.setText("Mark Villanueva");

        jLabel13.setText("Romeo Alcantara");

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joshua\\Documents\\NetBeansProjects\\Voting\\image_2025-11-24_220753951-removebg-preview (1).png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("for Kagawad (7 only)");

        jLabel5.setText("Miguel Santos");

        jLabel12.setText("Jomar Dela Cruz");

        jLabel15.setText("Paulo Ramirez");

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel16.setText("Rina Mendoza");

        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        jLabel17.setText("Gabriel Navarro");

        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        jLabel18.setText("Marco Fernando");

        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        jLabel19.setText("Daniela Reyes");

        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jLabel20.setText("Patricia Lim");

        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        jLabel21.setText("Rafael Cruz");

        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        jLabel22.setText("Liza Bautista");

        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("for Secretary");

        jLabel25.setText("Kristine Alvarado");

        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });

        jLabel26.setText("Michaela Robles");

        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });

        jLabel23.setText("Jericho Ramirez");

        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        jLabel27.setText("Leah Bondoc");

        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });

        jLabel28.setText("Althea Dela Cruz");

        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        jLabel29.setText("Carlo Mendozo");

        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton17))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel6)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addComponent(jLabel13))
                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton3)
                                        .addComponent(jRadioButton4)
                                        .addComponent(jRadioButton16))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(195, 195, 195)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel18)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jRadioButton10))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel17)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jRadioButton9)))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel19)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jRadioButton11))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel22)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton14))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel20)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jRadioButton12))))))
                                            .addComponent(jLabel2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(11, 11, 11)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel12)))
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jRadioButton1)
                                                    .addComponent(jRadioButton7)
                                                    .addComponent(jRadioButton5)
                                                    .addComponent(jRadioButton8)
                                                    .addComponent(jRadioButton13)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton19)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel29))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton15)
                                                                .addGap(78, 78, 78)
                                                                .addComponent(jLabel27)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jRadioButton18)
                                                            .addComponent(jRadioButton20))))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel24)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(129, 130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButton4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jRadioButton16))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jRadioButton17))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel9)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jRadioButton9)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jRadioButton5)
                            .addComponent(jLabel18)
                            .addComponent(jRadioButton10))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jRadioButton7)
                            .addComponent(jLabel19)
                            .addComponent(jRadioButton11))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jLabel16)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jRadioButton12))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jRadioButton13))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton14)
                                    .addGap(4, 4, 4)))
                            .addComponent(jLabel22))))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton18)
                    .addComponent(jLabel27))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton20)
                    .addComponent(jLabel29))
                .addGap(66, 66, 66)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        voterdata.loadvoter();
        try {
            List<String> lines = Files.readAllLines(Paths.get("voter/voted.txt"));
             for (String line : lines){
            String[] parts = line.split(",");    
                String savedid = parts[1].trim();
                if(savedid.equals(voterid)){
                    JOptionPane.showMessageDialog(this, "You Already Voted");
                    return;
                    }  
            }
        } catch (Exception e){
            
        }
       
        boolean votechair = jRadioButton2.isSelected() || jRadioButton3.isSelected();
        boolean votetrea = jRadioButton4.isSelected() || jRadioButton6.isSelected();
        boolean votesec = jRadioButton16.isSelected() || jRadioButton17.isSelected();
        int votekg = kagawadvote();
        
        if (!votechair || !votetrea || !votesec){
            JOptionPane.showMessageDialog(this, "Please Vote Properly");
            return;
        }
        if (votekg != 7){
            return;
        }
        if (jRadioButton2.isSelected()){
            votechair2++;
            savevotecount(carlos, "Carlos Antonio Reyes", votechair2);

        }
        
        if (jRadioButton3.isSelected()){
            votechair3++;
            savevotecount(maria,"Maria Santos", votechair3);

        }
        
        
        if (jRadioButton4.isSelected()){
            votetrea1++;
            savevotecount(mark,"Mark Villanueva", votetrea1);

        }  
        if (jRadioButton6.isSelected()){
            votetrea3++;
            savevotecount(romeo,"Romeo Alcantara", votetrea3);

        }
        if (jRadioButton16.isSelected()){
            votesec1++;
            savevotecount(kristine,"Kristine Alvarado", votesec1);
        }
        if (jRadioButton17.isSelected()){
            votesec2++;
            savevotecount(michaela,"Michaela Robles", votesec2);
        }
        if (jRadioButton1.isSelected()){
            votekg1++;
            savevotecount(miguel, "Miguel Santos", votekg1);
        }
        if (jRadioButton5.isSelected()){
            votekg2++;
            savevotecount(jomar, "Jomar Dela Crus", votekg2);
        }
        if (jRadioButton7.isSelected()){
            votekg3++;
            savevotecount(paulo, "Paulo Ramirez", votekg3);
        }
        if (jRadioButton8.isSelected()){
            votekg4++;
            savevotecount(rina, "Rina Mendoza", votekg4);
        }
        if (jRadioButton9.isSelected()){
            votekg5++;
            savevotecount(gabriel, "Gabriel Navarro", votekg5++);
        }
        if (jRadioButton10.isSelected()){
            votekg6++;
            savevotecount(marco, "Marco Fernando", votekg6);
        }
        if (jRadioButton11.isSelected()){
            votekg7++;
            savevotecount(daniela, "Daniela Reyes", votekg7);
        }
        if (jRadioButton12.isSelected()){
            votekg8++;
            savevotecount(patricia, "Patricia Lim", votekg8);
        }
        if (jRadioButton13.isSelected()){
            votekg9++;
            savevotecount(rafael, "Rafael Cruz", votekg9);
        }
        if (jRadioButton14.isSelected()){
            votekg10++;
            savevotecount(liza, "Liza Bautista", votekg10);
        }
        if (jRadioButton15.isSelected()){
            votekg11++;
            savevotecount(jericho, "Jericho Ramirez", votekg11);
        }
        if (jRadioButton18.isSelected()){
            votekg12++;
            savevotecount(leah, "Leah Bondoc", votekg12);
        }
        if (jRadioButton19.isSelected()){
            votekg13++;
            savevotecount(althea, "Althea Dela Cruz", votekg13);
        }
        if (jRadioButton20.isSelected()){
            votekg14++;
            savevotecount(carlo, "Carlo Mendoza", votekg14);
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("voter/voted.txt", true))){
        bw.write(name + "," + voterid + "," + age + "," + address);
        bw.newLine();
        bw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        //chairperson
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        //treasurer
        jRadioButton4.setSelected(false);
        jRadioButton6.setSelected(false);
        //secretary
        jRadioButton16.setSelected(false);
        jRadioButton17.setSelected(false);
        //kagawad
        jRadioButton1.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton7.setSelected(false);
        jRadioButton8.setSelected(false);
        jRadioButton9.setSelected(false);
        jRadioButton10.setSelected(false);
        jRadioButton11.setSelected(false);
        jRadioButton12.setSelected(false);
        jRadioButton13.setSelected(false);
        jRadioButton14.setSelected(false);
        jRadioButton15.setSelected(false);
        jRadioButton18.setSelected(false);
        jRadioButton19.setSelected(false);
        jRadioButton20.setSelected(false);

        
        JOptionPane.showMessageDialog(this, "Vote Submitted");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(jRadioButton3.isSelected()){
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()){
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
       if(jRadioButton4.isSelected()){
            jRadioButton6.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        if(jRadioButton6.isSelected()){
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String[] names = {"Chairperson - Carlos Antonio Reyes", "Treasure - Mark Villanueva", "Secretary - Kristine Alverado"};
        String partylist1 = String.join("\n", names);
        JOptionPane.showMessageDialog(this, partylist1, "List of the Partylist Members", 
                JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        if(jRadioButton16.isSelected()){
            jRadioButton17.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        if (jRadioButton17.isSelected()){
            jRadioButton16.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected() && kagawadvote() > 7){
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if (jRadioButton5.isSelected() && kagawadvote() > 7){
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        if (jRadioButton7.isSelected() && kagawadvote() > 7){
            jRadioButton7.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        if (jRadioButton8.isSelected() && kagawadvote() > 7){
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        if (jRadioButton13.isSelected() && kagawadvote() > 7){
            jRadioButton13.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        if (jRadioButton9.isSelected() && kagawadvote() > 7){
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        if (jRadioButton10.isSelected() && kagawadvote() > 7){
            jRadioButton10.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        if (jRadioButton11.isSelected() && kagawadvote() > 7){
            jRadioButton11.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        if (jRadioButton12.isSelected() && kagawadvote() > 7){
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        if (jRadioButton14.isSelected() && kagawadvote() > 7){
            jRadioButton14.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        if (jRadioButton15.isSelected() && kagawadvote() > 7){
            jRadioButton15.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        if (jRadioButton18.isSelected() && kagawadvote() > 7){
            jRadioButton18.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        if (jRadioButton19.isSelected() && kagawadvote() > 7){
            jRadioButton19.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        if (jRadioButton20.isSelected() && kagawadvote() > 7){
            jRadioButton20.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}