import java.util.Arrays;

// Kelas ini menangani berbagai operasi dasar pada struktur data Array (static array)
public class ArrayOperations {
    private int[] array; // Array utama untuk menyimpan data
    private int size;    // Jumlah elemen yang aktif dalam array

    // Konstruktor: menginisialisasi array dengan kapasitas tertentu
    public ArrayOperations(int capacity) {
        array = new int[capacity]; // Alokasi memori untuk array
        size = 0;                  // Awalnya belum ada elemen
    }

    // Menampilkan elemen-elemen array yang aktif (tidak termasuk nilai default)
    public void traverse() {
        System.out.println("Array Traversal: " + Arrays.toString(Arrays.copyOf(array, size)));
    }

    // Melakukan pencarian linear (berurutan) terhadap elemen dalam array
    public int linearSearch(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) return i; // Jika ditemukan, kembalikan indeksnya
        }
        return -1; // Jika tidak ditemukan
    }

    // Melakukan pencarian biner (array harus terurut)
    public int binarySearch(int value) {
        return Arrays.binarySearch(Arrays.copyOf(array, size), value);
    }

    // Menyisipkan elemen baru ke array lalu mengurutkannya
    public void insert(int value) {
        if (size >= array.length) {
            System.out.println("Array is full!"); // Cegah overflow
            return;
        }
        array[size++] = value;                 // Tambahkan elemen baru di posisi akhir
        Arrays.sort(array, 0, size);           // Urutkan array dari indeks 0 sampai elemen terakhir
    }

    // Menghapus elemen dari array dan menggeser elemen setelahnya
    public void delete(int value) {
        int index = linearSearch(value);       // Cari indeks elemen
        if (index == -1) return;               // Jika tidak ditemukan, tidak melakukan apapun
        // Geser elemen setelahnya ke kiri
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--; // Kurangi ukuran karena satu elemen telah dihapus
    }
}