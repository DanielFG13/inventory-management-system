package Modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class GitConnect {

    public static String getVersion(java.net.URL url, String username, String password) {
        try {
            url = new java.net.URL("https://raw.githubusercontent.com/danielcode66/Gestor-Inventario/main/Version.txt");           
            java.net.URLConnection uc;
            uc = url.openConnection();
            String file = "";

            uc.setRequestProperty("X-Requested-With", "Curl");
            java.util.ArrayList<String> list = new java.util.ArrayList<String>();
            String userpass = username + ":" + password;
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()));//needs Base64 encoder, apache.commons.codec
            uc.setRequestProperty("Authorization", basicAuth);

            BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null)
                file = file + line;
            return file;

        } catch (IOException e) {
            System.out.println("Wrong username and password");
            return "Error";
        }
       
    }
    
}