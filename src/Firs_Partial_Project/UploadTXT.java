package Firs_Partial_Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UploadTXT {

    public String readFile() {
        File f;
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        j.showOpenDialog(j);
        String path = j.getSelectedFile().getAbsolutePath();
        String lectura = "";
        f = new File(path);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String aux;
            while ((aux = br.readLine()) != null){
                lectura = lectura + aux + "\n";
            }
        }catch (IOException ignored){}
        return lectura.toLowerCase();
    }



}
