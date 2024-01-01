
package Giris;
import javax.swing.*;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        String userName , password ;
        int degisim;
        System.out.print("Lütfen kullanıcı adını giriniz = ");
        userName = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz =");
        password = input.nextLine();

        if (userName.equals("Metehan Avcı")){
            if (password.equals("159753852m")) {
                System.out.print("Sisteme hoşgeldiniz");
            }else
                System.out.print("Şifrenizi hatalı değiştirmek ister misiniz Evet ise 1 ,Hayır ise 2 basınız");
            degisim = input.nextInt();

            switch (degisim){

                case 1 :
                    System.out.print("Lütfen yeni şifrenizi giriniz =");
                    input.nextLine();
                    password = input.nextLine();
                    if (password.equals("159753852m")){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }else
                        System.out.println("Şifre oluşturuldu");
                    break;
                case 2 :
                    System.out.print("İyi günler dileriz.");
                    break;
            }


        }else
            System.out.print("Lütfen kullanıcı adınızı kontrol ediniz.");


    }
}
