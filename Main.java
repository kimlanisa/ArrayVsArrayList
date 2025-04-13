public class Main {
    public static void main(String[] args) {
        // Membuat instance dari ArrayOperations dengan kapasitas 10
        ArrayOperations arrayOps = new ArrayOperations(10);
        arrayOps.insert(10);
        arrayOps.insert(20);
        arrayOps.insert(30);
        arrayOps.insert(40);
        arrayOps.insert(50);

        // Menampilkan isi array
        System.out.println("📦 Traversal pada Array:");
        arrayOps.traverse();

        // Membuat instance dari ArrayListOperations
        ArrayListOperations arrayListOps = new ArrayListOperations();
        arrayListOps.insert(10);
        arrayListOps.insert(20);
        arrayListOps.insert(30);
        arrayListOps.insert(40);
        arrayListOps.insert(50);

        // Menampilkan isi ArrayList
        System.out.println("\n📦 Traversal pada ArrayList:");
        arrayListOps.traverse();

        // Melakukan pencarian elemen 30
        System.out.println("\n🔍 == Pencarian ==");
        System.out.println("🔎 Array: " + arrayOps.linearSearch(30));
        System.out.println("🔎 ArrayList: " + arrayListOps.search(30));

        // Menyisipkan elemen 25 ke dalam array dan ArrayList
        System.out.println("\n➕ == Penyisipan ==");
        arrayOps.insert(25);
        arrayListOps.insert(25);
        System.out.println("📦 Array setelah penyisipan:");
        arrayOps.traverse();
        System.out.println("📦 ArrayList setelah penyisipan:");
        arrayListOps.traverse();

        // Menghapus elemen 20 dari array dan ArrayList
        System.out.println("\n🗑️ == Penghapusan ==");
        arrayOps.delete(20);
        arrayListOps.delete(20);
        System.out.println("📦 Array setelah penghapusan:");
        arrayOps.traverse();
        System.out.println("📦 ArrayList setelah penghapusan:");
        arrayListOps.traverse();

        // Membandingkan kinerja antara Array dan ArrayList
        System.out.println("\n⚖️ == Perbandingan Kinerja ==");
        Comparison.compare();
    }
}