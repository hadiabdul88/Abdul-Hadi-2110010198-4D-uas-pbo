package Uas;
import java.util.Scanner;
public class HajiBeraksi {
    public static void main(String[] args) {
        //objek
        //DataJamaahHaji haji = new DataJamaahHaji("2110010198","Abdul");
        
        //System.out.println(haji.displayInfo());
        //System.out.println(haji.displayInfo("Banjar"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       HajiDetail[] haji= new HajiDetail[2];
        
        //perulangan
        for(int i =0; i<haji.length;i++){  
        System.out.print(" Masukkan NOREG "+(i+1)+" = ");
        String noreg = scanner.nextLine();
        System.out.print(" Masukkan NAMA  "+(i+1)+" = ");
        String nama = scanner.nextLine();
        
        //objek
        haji[i] = new HajiDetail(noreg,nama);
        }
        
        //perulangan
        for(HajiDetail data : haji) {
            System.out.println("====================");
            System.out.println("Data Jamaah Haji= ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NOREG"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}
    
