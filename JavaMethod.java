public class JavaMethod {
    
    // if else input nilai

    static int daftarNilai (int nilai){
        if (nilai >= 80){
            System.out.println(nilai +" Nilai A");
        }
        else if (nilai >= 61){
            System.out.println(nilai +" Nilai B");
        }
        else if (nilai >= 41){
            System.out.println(nilai +" Nilai C");
        }
        else if (nilai >= 21){
            System.out.println(nilai +" Nilai D");;
        }
        else {
            System.out.println(nilai +" Nilai E");;
        }
        return nilai;
    }
    public static void main(String[] args) {
        daftarNilai(55);
    }
}
