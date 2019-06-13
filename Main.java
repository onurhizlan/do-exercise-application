/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idman_ornek;

import java.util.Scanner;

/**
 *
 * @author onur_
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz");
        String idmanlar = "Burpee\n"
                        + "Pushup\n"
                        + "Situp\n"
                        + "Squat";
        System.out.println(idmanlar);
        System.out.println("Bİr idman oluşturun");
        
        System.out.println("Burpee Sayisi : ");
        int burpee_sayisi = input.nextInt();
        System.out.println("Pushup Sayisi : ");
        int pushup_sayisi = input.nextInt();
        System.out.println("Situp Sayisi : ");
        int situp_sayisi = input.nextInt();
        System.out.println("Squat Sayisi : ");
        int squat_sayisi = input.nextInt();
        input.nextLine();
        
        Idman idman = new Idman(burpee_sayisi, pushup_sayisi, situp_sayisi, squat_sayisi);
        System.out.println("Idmanınız Başlıyor");
        System.out.println("");
        
        while(idman.idmanBittiMi() == false){       
        System.out.println("Hareket Türü(Burpee, Pushup, Situp, Squat)");
        String tur = input.nextLine();
        System.out.println("Bu haraketten kaç tane yapacaksınız: ");
        int sayi = input.nextInt();
        input.nextLine();
        idman.hareketYap(tur, sayi);
        }
        System.out.println("İdman sona ermiştir");
    }
}
