import java.util.LinkedList;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah laptop: ");
        int jumlahLaptop = scanner.nextInt();

        System.out.print("Masukkan jumlah printer: ");
        int jumlahPrinter = scanner.nextInt();

        LinkedList<String> namaBarang = new LinkedList<>();
        LinkedList<Integer> hargaBarang = new LinkedList<>();

        for (int i = 0; i < jumlahLaptop; i++) {
            System.out.print("Masukkan nama laptop ke-" + (i + 1) + ": ");
            namaBarang.add(scanner.next());
            System.out.print("Masukkan harga laptop ke-" + (i + 1) + ": ");
            hargaBarang.add(scanner.nextInt());
        }

        for (int i = 0; i < jumlahPrinter; i++) {
            System.out.print("Masukkan nama printer ke-" + (i + 1) + ": ");
            namaBarang.add(scanner.next());
            System.out.print("Masukkan harga printer ke-" + (i + 1) + ": ");
            hargaBarang.add(scanner.nextInt());
        }

        System.out.println("Daftar Barang:");
        for (int i = 0; i < namaBarang.size(); i++) {
            System.out.println(namaBarang.get(i) + " - Rp" + hargaBarang.get(i));
        }

        int totalHarga = 0;
        for (int i = 0; i < hargaBarang.size(); i++) {
            totalHarga += hargaBarang.get(i);
        }

        System.out.println("Total harga: Rp" + totalHarga);
    }
}