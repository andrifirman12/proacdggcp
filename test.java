package Day1;

public class VariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// awal kata menggunkan huruf kecil, Gunakan Penulisan CamelCase
		int angka = 10;
		int bilanganPrima = 7;
		// Deklarasi kosong
		String namaku = "";
		int saldoku = 0;

		// mengubah nilai variabel
		angka = 200;
		bilanganPrima = 23;
		namaku = "Andri Firman Nurvianto";
		// untuk angka dibecah agar lebih mudah dilihat
		saldoku = 100_000_000;

		// Cetak Ke Layar Angka | println untuk line breaj dan print biasa untuk biasa
		System.out.print("Angkanya Menjadi : " + angka);
		System.out.println(" | Bilangan Primanya Menjadi : " + bilanganPrima);
		System.out.println("Nama Saya : " + namaku);
		System.out.println("Goal ke depan, Nabung : " + saldoku);

	}

}
