/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.err;
import static java.lang.System.out;
import store.User;


/**
 *
 * @author araceliteruel
 */
public class FileLoader {
    public User[] readUsers(){
        BufferedReader br;
        User[] users=null;
        int contador=0;
        String cadena;
        String[] separador;
        try(FileReader rd=new FileReader("users.txt")){
            br=new BufferedReader(rd);
            cadena=br.readLine();
            while (cadena!=null){
                separador=cadena.split(";");
                users[contador].setName(separador[0]);
                users[contador].setPassword(separador[1]);
                contador++;
                out.println(cadena);
                cadena=br.readLine();
            }
            out.println(cadena);
            br.close();
        } catch (FileNotFoundException ex) {
            err.println("ERROR; "+ex.getMessage());
        } catch (IOException e){
            err.println("ERROR FATAL: "+e.getMessage());
        } finally{
            return users;
        }
    }
}
