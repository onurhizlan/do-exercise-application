/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idman_ornek;

/**
 *
 * @author onur_
 */
public class Idman {
 
        private int burpee_sayisi;
        private int pushup_sayisi;
        private int situp_sayisi;
        private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    
    public void hareketYap(String hareket_ismi, int sayi){
        
        if (hareket_ismi.equals(burpee_sayisi)) {
            burpeeYap(sayi);
            
        }else if (hareket_ismi.equals(pushup_sayisi)) {
            pushupYap(sayi);
            
        }else if (hareket_ismi.equals(situp_sayisi)) {
            situpYap(sayi);
            
        }else if (hareket_ismi.equals(squat_sayisi)) {
             squatYap(sayi);
            
        }else{
            System.out.println("Geçersiz Hareket!");
        }
    }
    public void burpeeYap(int sayi){
        
        if (burpee_sayisi == 0) {
            System.out.println("Yapaacak Burpee kalmadı");
        }
        if (burpee_sayisi - sayi < 0) {
            System.out.println("Tebrikler, hedeflenen burpeeyi geçtiniz");
            int burpee_sayisi = 0;
            System.out.println("Kalan burpee sayisi : " +  burpee_sayisi);
        }else{
            burpee_sayisi -= sayi;
            System.out.println("Kalan burpee sayisi:" + burpee_sayisi);
        }
    }
    public void pushupYap(int sayi){
        
        if (pushup_sayisi == 0) {
            System.out.println("Yapaacak Burpee kalmadı");
        }
        if (pushup_sayisi - sayi < 0) {
            System.out.println("Tebrikler, hedeflenen burpeeyi geçtiniz");
            int pushup_sayisi = 0;
            System.out.println("Kalan burpee sayisi : " +  pushup_sayisi);
        }else{
            pushup_sayisi -= sayi;
            System.out.println("Kalan burpee sayisi:" + pushup_sayisi);
        }
    }
       public void situpYap(int sayi){
        
        if (situp_sayisi == 0) {
            System.out.println("Yapaacak Burpee kalmadı");
        }
        if (situp_sayisi - sayi < 0) {
            System.out.println("Tebrikler, hedeflenen burpeeyi geçtiniz");
            int situp_sayisi = 0;
            System.out.println("Kalan burpee sayisi : " +  situp_sayisi);
        }else{
            situp_sayisi -= sayi;
            System.out.println("Kalan burpee sayisi:" + situp_sayisi);
        }
    }
       public void squatYap(int sayi){
        
        if (squat_sayisi == 0) {
            System.out.println("Yapaacak Burpee kalmadı");
        }
        if (squat_sayisi - sayi < 0) {
            System.out.println("Tebrikler, hedeflenen burpeeyi geçtiniz");
            int squat_sayisi = 0;
            System.out.println("Kalan burpee sayisi : " +  squat_sayisi);
        }else{
            squat_sayisi -= sayi;
            System.out.println("Kalan burpee sayisi:" + squat_sayisi);
        }
    }
       public boolean idmanBittiMi(){
           return (burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
       }
       
}
