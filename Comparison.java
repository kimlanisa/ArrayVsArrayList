// Kelas ini digunakan untuk membandingkan kinerja antara Array dan ArrayList
public class Comparison {

    // Metode statis untuk menjalankan perbandingan
    public static void compare() {
        // Membuat objek ArrayOperations dengan kapasitas 1000
        ArrayOperations arrayOps = new ArrayOperations(1000);

        // Membuat objek ArrayListOperations
        ArrayListOperations arrayListOps = new ArrayListOperations();

        // Menyisipkan 1000 elemen ke dalam Array dan ArrayList
        for (int i = 0; i < 1000; i++) {
            arrayOps.insert(i);           // Menyisipkan elemen ke array dan langsung mengurutkan
            arrayListOps.insert(i);       // Menyisipkan elemen ke array list dan langsung mengurutkan
        }

        // Mengukur waktu pencarian (linear) pada Array
        long start = System.nanoTime();                         // Catat waktu mulai
        int indexArray = arrayOps.linearSearch(500);           // Cari elemen 500 di array
        long end = System.nanoTime();                           // Catat waktu selesai
        System.out.println("🔍 Pencarian 500 dalam Array: Ditemukan di indeks " + indexArray);
        System.out.println("⏱️ Waktu eksekusi pencarian pada Array: " + (end - start) / 1e6 + " ms");

        // Mengukur waktu pencarian (indexOf) pada ArrayList
        start = System.nanoTime();                              // Catat waktu mulai
        int indexList = arrayListOps.search(500);              // Cari elemen 500 di ArrayList
        end = System.nanoTime();                                // Catat waktu selesai
        System.out.println("🔍 Pencarian 500 dalam ArrayList: Ditemukan di indeks " + indexList);
        System.out.println("⏱️ Waktu eksekusi pencarian pada ArrayList: " + (end - start) / 1e6 + " ms");
    }
}