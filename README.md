Sure! Here's the English version of your `README.md`:

---

# 📚 Array vs ArrayList in Java

This project demonstrates the use and performance comparison between **Array** and **ArrayList** in Java. It includes basic operations such as traversal, search, insertion, deletion, and sorting. Additionally, it provides an analysis of execution time between the two data structures.

---

## 🔧 How to Run

### **Compile and Run the Project**

Navigate to your project directory and run:

```bash
javac *.java
java Main
```

---

## 📂 Project Structure

- `Main.java` → The main program class
- `ArrayOperations.java` → Contains operations using basic arrays
- `ArrayListOperations.java` → Contains operations using ArrayList
- `Comparison.java` → Contains execution time comparisons between Array and ArrayList

---

## 🎯 Project Objective

This project aims to compare two commonly used data structures in Java: **Array** and **ArrayList**, focusing on:

- Ease of use
- Search performance
- Insertion and deletion behavior

---

## ✅ Output

Here’s an example output when running the program:

```
📦 Traversal pada Array:
Array Traversal: [10, 20, 30, 40, 50]

📦 Traversal pada ArrayList:
ArrayList Traversal: [10, 20, 30, 40, 50]

🔍 == Pencarian ==
🔎 Array: 2
🔎 ArrayList: 2

➕ == Penyisipan ==
📦 Array setelah penyisipan:
Array Traversal: [10, 20, 25, 30, 40, 50]
📦 ArrayList setelah penyisipan:
ArrayList Traversal: [10, 20, 25, 30, 40, 50]

🗑️ == Penghapusan ==
📦 Array setelah penghapusan:
Array Traversal: [10, 25, 30, 40, 50]
📦 ArrayList setelah penghapusan:
ArrayList Traversal: [10, 25, 30, 40, 50]

⚖️ == Perbandingan Kinerja ==
🔍 Pencarian 500 dalam Array: Ditemukan di indeks 500
⏱️ Waktu eksekusi pencarian pada Array: 0.005125 ms
🔍 Pencarian 500 dalam ArrayList: Ditemukan di indeks 500
⏱️ Waktu eksekusi pencarian pada ArrayList: 0.055458 ms
```

---

## 📌 Conclusion

- **Array** is faster for simple operations and uses less memory.
- **ArrayList** is more flexible (resizable) and easier to work with, but slower when inserting or removing elements in the middle.
- This comparison is useful for understanding when to use each data structure based on performance and usability.

---