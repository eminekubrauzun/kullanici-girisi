/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanici_girisi;
import java.util.Scanner;
/**
 *
 * @author MONSTER
 */
public class Kullanici_Girisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userName,password,sıfırlama,yeniSifre;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kullanıcı Adınız:");
        userName=inp.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        password=inp.nextLine();
        
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Yaptınız!");
        } else {
            
            System.out.print("Yanlış şifre girdiniz. Şifrenizi sıfırlamak ister misiniz?");
            sıfırlama=inp.nextLine();
            
            if (sıfırlama.equals("evet")) {
                System.out.print("Yeni şifreyi giriniz:");
                yeniSifre=inp.nextLine();
                
                if (password.equals(yeniSifre)) 
                    System.out.print("Şifre Oluşturuldu.");
                else 
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                
                
            } else {
                System.out.print("Tekrar Deneyiniz!!");
            }
                
                
            
            
            
        }
                
        
        
    }
    
}
