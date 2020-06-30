/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.log4j.BasicConfigurator;

/**
 *
 *  @author Dhiazmi <dhiazmie@gmail.com>
 */
public class WriteDocx {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BasicConfigurator.configure();
//        Properties prop = new Properties();
//        prop.setProperty("log4j.rootLogger", "WARN");
        
        String teks = " it to make a only five centuries, but als,"
                + "type specimen book. It has survived not i"
                + " been the industry'.";

        XWPFDocument documentDocx = new XWPFDocument();

        // write document
        String outDocxEn = "D://writedocx.docx";
        //create paragraph
        try (FileOutputStream outDocx = new FileOutputStream(new File(outDocxEn))) {
            //create paragraph
            XWPFParagraph paragraphDocx = documentDocx.createParagraph();
            XWPFRun runDocx = paragraphDocx.createRun();
            runDocx.setText(teks);
            
            documentDocx.write(outDocx);
        }
        System.out.println("Write docx successfully");
    }
}
