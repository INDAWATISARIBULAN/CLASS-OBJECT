
public class allmain {

		public static void main(String[] args) {
			kotak kotakHitam = new kotak();
			
			kotakHitam.setPanjang(20);
			kotakHitam.setLebar(10);
			
			kotakHitam.hitungLuas();
			kotakHitam.hitungKeliling();
		
			System.out.println("Panjang : " + kotakHitam.getPanjang());
			System.out.println("Lebar : " + kotakHitam.getLebar());
			System.out.println("LuasKotak : " + kotakHitam.getLuas());
			System.out.println("KelilingKotak " + kotakHitam.getKeliling());
			System.out.println("___________________________________________");
					
			{
				//Hasil Mahasiswa
				mahasiswa mhs1 = new mahasiswa();
				mhs1.setNama("Inda wati saribulan");
				mhs1.setNim("D0217513");
				mhs1.setAlamat("Pambusuang");
				mhs1.setGolonganDarah("o");
				mhs1.setStatus("Mahasiswa");
				mhs1.setTinggiBadan(165);
				mhs1.setBeratBadan(53);
				
				System.out.println("Nama : " + mhs1.getNama());
				System.out.println("Nim : " + mhs1.getNim());
				System.out.println("Alamat : " + mhs1.getAlamat());
				System.out.println("GolonganDarah : " + mhs1.getGolonganDarah());
				System.out.println("Status : " + mhs1.getStatus());
				System.out.println("TinggiBadan : " + mhs1.getTinggiBadan());
				System.out.println("BeratBadan : " + mhs1.getBaratBadan());
				System.out.println("---------------------------------------------");

				System.out.println("------Object Kelas node------");
				//membuat object darikelas node
				node node = new node();
				
				//method setter node
				node.label = "donat";
				node.Value =2;
				
				//method getter node
				System.out.println("Nama Label : " + node.getlabel());
				System.out.println("jumlah label : " + node.getValue());
				
				
				//membuat object darikelas stack
				stack stack = new stack();
				System.out.println("------Object Kelas stack------");
				stack.value[0] = "layla";
				stack.value[1] = "lesley";
				stack.value[2]= "irhitel";
				stack.value[3]= "saber";
				stack.value[4]= "afif";
				stack.value[5]= "afif";
				stack.value[6]= "afif";
				stack.value[7]= "afif";
				stack.value[8]= "afif";
				stack.value[9]= "afif";
				stack.value[10]= "afif";
				stack.value[11]= "afif";
				stack.value[12]= "afif";
				stack.value[13]= "afif";
				stack.value[14]= "afif";
				stack.value[15]= "afif";
				stack.value[16]= "afif";
				stack.value[17]= "afif";
				stack.value[18]= "afif";
				stack.value[19]= "saber";
				stack.value[20]= "afif";
				stack.value[21]= "afif";
				stack.value[22]= "afif";
				stack.value[23]= "afif";
				stack.value[24]= "afif";
				stack.value[25]= "afif";
				stack.value[26]= "afif";
				stack.value[27]= "afif";
				stack.value[28]= "afif";
				stack.value[29]= "afif";
				stack.value[29]= "afif";
				stack.value[30]= "afif";
				stack.value[31]= "afif";
				stack.value[32]= "afif";
				stack.value[33]= "afif";
				stack.value[34]= "saber";
				stack.value[35]= "afif";
				stack.value[36]= "afif";
				stack.value[37]= "afif";
				stack.value[38]= "afif";
				stack.value[39]= "afif";
				stack.value[40]= "afif";
				stack.value[41]= "afif";
				stack.value[42]= "afif";
				stack.value[43]= "afif";
				stack.value[44]= "afif";
				stack.value[45]= "afif";
				stack.value[46]= "afif";
				stack.value[47]= "afif";
				stack.value[48]= "afif";
				stack.value[49]= "afif";
				stack.value[50]= "afif";
				stack.value[51]= "afif";
				stack.value[52]= "saber";
				stack.value[53]= "afif";
				stack.value[54]= "afif";
				stack.value[55]= "afif";
				stack.value[56]= "afif";
				stack.value[57]= "afif";
				stack.value[58]= "afif";
				stack.value[59]= "afif";
				stack.value[60]= "afif";
				stack.value[61]= "afif";
				stack.value[62]= "afif";
				stack.value[63]= "afif";
				stack.value[64]= "afif";
				stack.value[65]= "afif";
				stack.value[66]= "afif";
				stack.value[67]= "afif";
				stack.value[68]= "afif";
				stack.value[69]= "afif";
				stack.value[70]= "afif";
				stack.value[71]= "afif";
				stack.value[72]= "afif";
				stack.value[73]= "afif";
				stack.value[74]= "afif";
				stack.value[75]= "saber";
				stack.value[76]= "afif";
				stack.value[77]= "afif";
				stack.value[78]= "afif";
				stack.value[79]= "afif";
				stack.value[80]= "afif";
				stack.value[81]= "afif";
				stack.value[82]= "afif";
				stack.value[83]= "afif";
				stack.value[84]= "afif";
				stack.value[85]= "afif";
				stack.value[86]= "afif";
				stack.value[87]= "afif";
				stack.value[88]= "afif";
				stack.value[89]= "afif";
				stack.value[90]= "afif";
				stack.value[91]= "afif";
				stack.value[92]= "afif";
				stack.value[93]= "afif";
				stack.value[94]= "afif";
				stack.value[95]= "afif";
				stack.value[96]= "afif";
				stack.value[97]= "afif";
				stack.value[98]= "afif";
				stack.value[99]= "afif";
				
				
				for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};
			}
	}
	}

