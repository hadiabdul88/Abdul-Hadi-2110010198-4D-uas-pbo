# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data haji menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan noReg, dan memberikan output berupa informasi detail dari NoReg tersebut seperti Kabupaten, NoKloter, Kategori.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Haji`, `HajiBeraksi`, dan `HajiDetail` adalah contoh dari class.

```bash
public class Haji {
    ...
}

public class HajiDetail extends Haji {
    ...
}

public class HajiBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `haji[i] = new HajiDetail(nama, noreg);` adalah contoh pembuatan object.

```bash
mhs[i] = new HajiDetail(nama, noreg);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `noreg` adalah contoh atribut.

```bash
String nama;
String noreg;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Haji` dan `HajiDetail`.

```bash
public Haji(String nama, String noreg) {
    this.nama = nama;
    this.noreg = noreg;
}

public HajiDetail(String nama, String noreg) {
    super(nama, noreg);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNoReg` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNpm(String noreg) {
    this.noreg = noreg;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNoreg`.

```bash
public String getNama() {
    return nama;
}

public String getNoReg() {
    return noreg;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `noreg` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String noreg;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `HajiDetail` mewarisi `Haji` dengan sintaks `extends`.

```bash
public class HajiDetail extends Haji {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo() {
        return "Noreg = "+getNoreg()+ "\nNama = "+getNama();
    }

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `case` dalam method `getTempatLahir` dan seleksi `switch` dalam method `getNoKloter`.

```bash
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

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < haji.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Masukkan NOREG "+(i+1)+" = ");
        String noreg = scanner.nextLine();
        System.out.print(" Masukkan NAMA  "+(i+1)+" = ");
        String nama = scanner.nextLine();

        //System.out.println(haji.displayInfo());
        //System.out.println(haji.displayInfo("Banjar"));
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `HajiDetail[] mahasiswas = new HajiDetail[2];` adalah contoh penggunaan array.

```bash
 HajiDetail[] haji= new HajiDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Abdul Hadi
NPM: 2110010198
