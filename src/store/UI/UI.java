/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.UI;

import static java.lang.System.out;
import store.User;
import store.files.FileLoader;

/**
 *
 * @author araceliteruel
 */
public class UI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileLoader files=new FileLoader();
        User[] users=files.readUsers();
        if(users!=null){
            for(int i=0;i<users.length;i++){
                out.println(users[i].getName()+" ; "+users[i].getPassword());
            }
        }
        else
            out.println("ES NULO");
    }
    
}
