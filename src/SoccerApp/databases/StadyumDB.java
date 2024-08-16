package SoccerApp.databases;

import SoccerApp.entities.Hakem;
import SoccerApp.entities.Stadyum;
import SoccerApp.utility.DatabaseManager;
import SoccerApp.utility.enums.EKokart;
import SoccerApp.utility.enums.EUyruk;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class StadyumDB extends DatabaseManager<Stadyum> {
	public boolean yaratStadyum(int tempKapasite,String tempAd) {
		Stadyum newStadyum = new Stadyum(tempKapasite, tempAd, getNextId());
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\JavaDersleri\\NewStarSoccer" +
				                                                                          "\\src\\SoccerApp\\build" +
				                                                                          "\\stadyumlar.bin"))) {
			veriListesi.add(newStadyum);
			oos.writeObject(veriListesi);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}