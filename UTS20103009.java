/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pkg20103009;

import java.util.Scanner;

/**
 *
 * @author Ni Kadek Dwi Lestari (20103009)
 */
public class UTS20103009 {

    /**
     * @param args the command line arguments
     */
    
    public String[] list;
    
    public String[] getList(){
        String[] returnList = {};
        if(this.list != null){
            if(this.list.length > 0){
                returnList = this.list;
            }
        }
        
        return returnList;
    }
    
    public String addList(UTS20103009 hw,String value){  
        String arrNew[] = new String[hw.getList().length + 1];
        int i;
        for(i = 0; i < hw.getList().length; i++) {
            arrNew[i] = this.list[i];
        }
        arrNew[i] = value;
        
        this.list = new String[arrNew.length];
        for(i = 0; i < arrNew.length; i++) {
            this.list[i] = arrNew[i];
        }
        
        return value;
    }
    
    static void aksi(UTS20103009 hw){
        System.out.println("### Daftar Pengunjung Kebun Binatang ###");
        System.out.println("1. Tampilkan pengunjung");
        System.out.println("2. Isi data pengunjung");
        System.out.println("##############################################");
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih menu : ");
        int menu = sc.nextInt();
    
        if(menu == 1){
            if(hw.getList().length > 0){
                for(int a = 0; a < hw.getList().length; a++){
                    System.out.println(a+1 + ". "+hw.getList()[a]);    
                }
            }else{
                System.out.println("Tidak ada pengunjung");
            }
        }else if(menu == 2){
            System.out.print("Masukkan nama pengunjung : ");
            Scanner sca = new Scanner(System.in);
            String nama = sca.nextLine();
            hw.addList(hw,nama);
        }else{
            System.out.println("Menu tidak ditemukan");
        }
        
        System.out.println("Tekan enter enter untuk melanjutkan");
    }
    
    public static void main(String[] args) {
        UTS20103009 hw = new UTS20103009();
        aksi(hw);
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) {
            if (readString.isEmpty()) {
                aksi(hw);
            }
    
            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }
        }
    }
}

