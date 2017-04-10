package tugas5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas5 {

    static class identitas {
        int no;
        String nama;
        int umur;
        String jenisKelamin;

        public identitas(int No, String Nama, int Umur, String JenisKelamin) {
            no = No;
            nama = Nama;
            umur = Umur;
            jenisKelamin = JenisKelamin;
        }
        public int getNo(){
            return no;
        }
        public void setNo(int no){
            this.no = no;
        }
        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getUmur() {
            return umur;
        }

        public void setUmur(int umur) {
            this.umur = umur;
        }

        public String getJenisKelamin() {
            return jenisKelamin;
        }

        public void setJenisKelamin(String jenisKelamin) {
            this.jenisKelamin = jenisKelamin;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<identitas> data = new ArrayList<>();
        boolean ulang = true;
        do {
            System.out.println("Kumpulan Identitas Tukang Selingkuh");
            System.out.println("1.Input data\t");
            System.out.println("2.Lihat data\t");
            System.out.println("3.Hapus Data\t");
            System.out.println("4.Exit\t");
            System.out.print("Masukan pilihan anda :\t");
            int pilih = in.nextInt();
            if (pilih == 1) {
                String nama, jk;
                int no,umur;
                System.out.print("Masukan Nomor :\t");
                no = in.nextInt();
                System.out.print("Masukan Nama :\t");
                nama = in.next();
                System.out.print("Masukan Umur :\t");
                umur = in.nextInt();
                System.out.print("Masukan Jenis Kelamin :\t");
                jk = in.next();
                data.add(new identitas(no,nama, umur, jk));
            } else if (pilih == 2) {
                System.out.println("Data Identitas");
                for (int i = 0; i < data.size(); i++) {
                    identitas dataku = data.get(i);
                    System.out.println("No :"+dataku.no);
                    System.out.println("Nama :" + dataku.nama);
                    System.out.println("Umur :" + dataku.umur + " tahun");
                    System.out.println("Jenis Kelamin :" + dataku.jenisKelamin);
                }
            } else if (pilih == 3) {
                System.out.println("List Data Tukang Selingkuh");
                for (int i = 0; i < data.size(); i++) {
                    identitas dataku = data.get(i);
                    System.out.println("No :\t" + dataku.no);
                    System.out.println("Nama :\t" + dataku.nama);
                    System.out.println("Umur :\t" + dataku.umur + " tahun");
                    System.out.println("Jenis Kelamin :\t" + dataku.jenisKelamin);
                }
                System.out.print("Masukan No List yang Mau Di Hapus :\t");
                data.remove(in.nextInt());
            }else{
                ulang=false;
            }
        } while (ulang);

    }

}
