package Uas;//inheritance
public class HajiDetail extends Haji{
     //overriding
    public HajiDetail(String noreg, String nama) {
        super(noreg, nama);
    }
    
    public String getTempatLahir(){
        String kodeKabupaten = getNoreg().substring(0, 4);
        //seleksi swicth
        switch(kodeKabupaten) {
            case "0011":
                return "Kandangan";
            case "0022":
                return "Banjar";
            case "0033":
                return "Banjarmasin";
            default:
                return "Jamaah Haji Daerah Lain";
        }
    }
    
    public int getNoKloter(){
          return Integer.parseInt(getNoreg().substring(4,12));   
    }
    
    public String getKategori(){
        String urutankategori = getNoreg().substring(12,14);
        //seleksi swicth
        switch(urutankategori) {
            case "01":
                return "Balita";
            case "02":
                return "Anak Anak";
            case "03":
                return "Dewasa";
            case "04":
                return "Lansia";
            default:
                return "Dan Seterusnya";
         }
    }
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nKabupaten = "+getTempatLahir()+
            "\nNoKloter = "+getNoKloter()+
            "\nUrutan Kategori = "+getKategori();
        }
    }