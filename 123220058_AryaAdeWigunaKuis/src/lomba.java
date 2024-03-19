/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab Informatika
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lomba extends JFrame {
    private String namah;
    private String asalh;
    
    

     
   
 public lomba() {
        setTitle("lomba kerja asli");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Frame 1: Pilihan Kendaraan
        JPanel panel1 = new JPanel();
        JButton AnimasiButton = new JButton("animasi");
        JButton MenulisButton = new JButton("menulis");

        
        panel1.add(AnimasiButton);
        panel1.add(MenulisButton);

        add(panel1);
        // ------------------------------
        AnimasiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lombaAnimasi();
            }
        });
        MenulisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lombaMenulis();
            }
        });
        
        ;
        add(panel1);
        
       setVisible(true);
    }
 
     private void lombaMenulis() {
        
        JFrame MenulisFrame = new JFrame("lolololomba mememenulis");
        MenulisFrame.setSize(400, 300);
        MenulisFrame.setLocationRelativeTo(null);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(8, 1));

        JLabel nama = new JLabel("Nama :");
        JTextField namaField = new JTextField(20);
        JLabel asal = new JLabel("asal sekolah");
        JTextField asalField = new JTextField(20);
        
        JLabel struktur = new JLabel("struktur surat");
        JTextField strukturField = new JTextField(20);
        JLabel isi = new JLabel("isi surat");
        JTextField isiField = new JTextField(20);
        JLabel kreativitas2 = new JLabel("kreativitas");
        JTextField kreativitas2Field = new JTextField(20);
        JLabel penerapan = new JLabel("penerapan kaidah bahasa");
        JTextField penerapanField = new JTextField(20);
        JLabel space = new JLabel( "  ");
        JLabel space2 = new JLabel( "  ");
        JLabel space3 = new JLabel( "  ");
        JButton saveButton = new JButton("Selesai");
       
       // panel2.add(nameLabel);
       panel2.add(nama);
       panel2.add(namaField);
       panel2.add(asal);
       panel2.add(asalField);
       panel2.add(space);
       panel2.add(space2);
       
       panel2.add(struktur);
       panel2.add(strukturField);
       panel2.add(isi);
       panel2.add(isiField);
       panel2.add(kreativitas2);
       panel2.add(kreativitas2Field);
       panel2.add(penerapan);
       panel2.add(penerapanField);
       panel2.add(space3);
       panel2.add(saveButton);
       
       namah = namaField.getText();
       asalh = asalField.getText();
       
       saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hasilNulis();
            }
        });
       
       MenulisFrame.add(panel2);
       MenulisFrame.setVisible(true);
    }
    
private void lombaAnimasi() {
        
        JFrame AnimasiFrame = new JFrame("mba nulis");
        AnimasiFrame.setSize(400, 300);
        AnimasiFrame.setLocationRelativeTo(null);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(8, 1));

        JLabel nama = new JLabel("Nama :");
        JTextField namaField = new JTextField(20);
        JLabel asal = new JLabel("asal sekolah");
        JTextField asalField = new JTextField(20);
        JLabel alur = new JLabel("alur cerita");
        JTextField alurField = new JTextField(20);
        JLabel konten = new JLabel("konten");
        JTextField kontenField = new JTextField(20);
        JLabel kreativitas = new JLabel("kreativitas");
        JTextField kreativitasField = new JTextField(20);
        JLabel sinematografi = new JLabel("sinematografi");
        JTextField sinematografiField = new JTextField(20);
        JLabel space = new JLabel( "  ");
        JLabel space2 = new JLabel( "  ");
        JLabel space3 = new JLabel( "  ");
        JButton saveButton = new JButton("Selesai");
        
       // panel2.add(nameLabel); Animasi
       panel3.add(nama);
       panel3.add(namaField);
       panel3.add(asal); 
       panel3.add(asalField);
       panel3.add(space);
       panel3.add(space2);
       
       panel3.add(alur);
       panel3.add(alurField);
       panel3.add(konten);
       panel3.add(kontenField);
       panel3.add(kreativitas);
       panel3.add(kreativitasField);
       panel3.add(sinematografi);
       panel3.add(sinematografiField);
       panel3.add(space3);
       panel3.add(saveButton);
       
       namah = namaField.getText();
       asalh = asalField.getText();
       
       saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hasilani();
            }
        });
       
       AnimasiFrame.add(panel3);
       AnimasiFrame.setVisible(true);
    }

 private void hasilNulis(){
    JFrame nulisFrame = new JFrame("mba nulis");
    nulisFrame.setSize(400, 300);
    nulisFrame.setLocationRelativeTo(null);
    
    
    
    
    JPanel panel5 = new JPanel();
    panel5.setLayout(new GridLayout(9, 1));
    
    JLabel hnama = new JLabel("nama : " + namah);
    JLabel hasal = new JLabel("asal : " + asalh);
    JLabel hstruk = new JLabel("struktur : " + asalh);
    JLabel hisi = new JLabel("isi : " + asalh);
    JLabel hkrea2 = new JLabel("kreativitas : " + asalh);
    JLabel hpene = new JLabel("hpene : " + asalh);
    
    JButton finishButton = new JButton("Selesai");

        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
    
    
    panel5.add(hnama);
    panel5.add(hasal);
    
    panel5.add(hstruk);
    panel5.add(hisi);
    panel5.add(hkrea2);
    panel5.add(hpene);
    panel5.add(finishButton);
    nulisFrame.add(panel5);
    nulisFrame.setVisible(true);
    }
 
 private void hasilani(){
    JFrame aFrame = new JFrame("hasil animasi ");
    aFrame.setSize(400, 300);
    aFrame.setLocationRelativeTo(null);
    
    
    
    
    JPanel panel4 = new JPanel();
    panel4.setLayout(new GridLayout(9, 1));
    
    JLabel hnama = new JLabel("nama : " + namah);
    JLabel hasal = new JLabel("asal : " + asalh);
    JLabel hstruk = new JLabel("sinematografi : " + asalh);
    JLabel hisi = new JLabel("kekerenan : " + asalh);
    JLabel hkrea2 = new JLabel("kreativitas : " + asalh);
    JLabel hpene = new JLabel("makna dan esensi : " + asalh);
    
    JButton finishButton = new JButton("Selesai");

        finishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
    
    
    panel4.add(hnama);
    panel4.add(hasal);
    
    panel4.add(hstruk);
    panel4.add(hisi);
    panel4.add(hkrea2);
    panel4.add(hpene);
    panel4.add(finishButton);
    aFrame.add(panel4);
    aFrame.setVisible(true);
    }
     
     
    public static void main(String[] args) {
        new lomba();
    }
}

