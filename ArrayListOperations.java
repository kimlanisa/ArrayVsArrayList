import java.util.ArrayList;
import java.util.Collections;

// Kelas ini menangani berbagai operasi dasar pada struktur data ArrayList
public class ArrayListOperations {
    // Deklarasi atribut list sebagai ArrayList bertipe Integer
    private ArrayList<Integer> list;

    // Konstruktor: menginisialisasi objek list sebagai ArrayList kosong
    public ArrayListOperations() {
        list = new ArrayList<>();
    }

    // Menampilkan isi ArrayList
    public void traverse() {
        System.out.println("ArrayList Traversal: " + list);
    }

    // Melakukan pencarian elemen dan mengembalikan indeksnya
    // Jika tidak ditemukan, akan mengembalikan -1
    public int search(int value) {
        return list.indexOf(value);
    }

    // Menambahkan elemen ke dalam ArrayList lalu mengurutkannya
    public void insert(int value) {
        list.add(value);               // Menambahkan elemen
        Collections.sort(list);       // Mengurutkan list setelah penambahan
    }

    // Menghapus elemen dari ArrayList
    public void delete(int value) {
        list.remove(Integer.valueOf(value)); // Menghapus berdasarkan nilai, bukan indeks
    }

    // Mengurutkan seluruh elemen dalam ArrayList
    public void sort() {
        Collections.sort(list);
    }
}