package SoccerApp.entities;

import SoccerApp.utility.enums.EMevki;
import java.util.Optional;

public class Futbolcu extends Insan{
	private int formaNumarasi;
	private String bonservis;
	private EMevki mevki;
	private int yetenekPuani;
	private String kulupId;
	//TODO Sözleşme bitiş zamanı eklenebilir
	//CONSTRUCTORS
	
	
	public Optional<String> getKulupId() {
		return Optional.ofNullable(kulupId);
	}
	
	public void setKulupId(String kulupId) {
		this.kulupId = kulupId;
	}
	
	public Futbolcu() { //TODO futbolcu üretildiğinde (ve değiştirildiğinde) bin dosyasını güncelle
	}
	
	
	{
		kulupId = "-1";
	}
	
	
	public int getFormaNumarasi() {
		return formaNumarasi;
	}
	
	public String getBonservis() {
		return bonservis;
	}
	
	public void setBonservis(String bonservis) {
		this.bonservis = bonservis;
	}
	
	public void setFormaNumarasi(int formaNumarasi) {
		this.formaNumarasi = formaNumarasi;
	}
	
	public EMevki getMevki() {
		return mevki;
	}
	
	public void setMevki(EMevki mevki) {
		this.mevki = mevki;
	}
	
	public int getYetenekPuani() {
		return yetenekPuani;
	}
	
	public boolean setYetenekPuani(int yetenekPuani) {
		if(yetenekPuani >= 0 && yetenekPuani <= 100 ){
			this.yetenekPuani = yetenekPuani;
			return true;
		} else
		return false;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Futbolcu{" + "formaNumarasi=" + getFormaNumarasi() + ", bonservis='" + getBonservis() + '\'' + ", mevki=" + getMevki() + ", yetenekPuani=" + getYetenekPuani() + ", kulupId='" + getKulupId().get() + '\'' + ", ad='" + getAd() + '\'' + ", soyad='" + getSoyad() + '\'' + ", dogumTarihi=" + getDogumTarihi() + ", uyruk=" + getUyruk() + ", maas='" + getMaas() + '\'' + ", id='" + getId() + '\'' + '}';
	}
}