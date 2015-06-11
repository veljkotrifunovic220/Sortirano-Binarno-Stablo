package stabla;

public class SortiranoBinarnoStablo {
	
	private CvorBinarnogStabla koren;
	
	public CvorBinarnogStabla getKoren() {
		return koren;
	}

	public void setKoren(CvorBinarnogStabla koren) {
		this.koren = koren;
	}

	public SortiranoBinarnoStablo(CvorBinarnogStabla koren) {
		super();
		this.koren = koren;
	}

	public SortiranoBinarnoStablo() {
		koren = null;
	}
	
	public boolean praznoStablo() {
		if (koren == null) {
			return true;
		}
		return false;
	}
	
	public void ubaciUStablo(int kljuc, String vrednost) {
		ubaci(koren, kljuc, vrednost);
	}
	
	private void ubaci(CvorBinarnogStabla tekuci, int kljuc, String vrednost) {
		if ( praznoStablo() ) {
			koren = new CvorBinarnogStabla(kljuc, vrednost);
		}
		else {
			if (kljuc < tekuci.getKljuc()) {
				if (tekuci.getLevo() != null) {
					ubaci(tekuci.getLevo(), kljuc, vrednost);
				}
				else {
					tekuci.setLevo(new CvorBinarnogStabla(kljuc, vrednost));
				}
			}
			else if (kljuc < tekuci.getKljuc()) {
				if (tekuci.getDesno() != null) {
					ubaci(tekuci.getDesno(), kljuc, vrednost);
				}
				else {
					tekuci.setDesno(new CvorBinarnogStabla(kljuc, vrednost));
				}
			}
		}
	}
	
	String pronadjiRekurzivno(CvorBinarnogStabla tekuci, int kljuc) {
		if ( (tekuci == null) || tekuci.getKljuc() == kljuc) {
			return tekuci.getVrednost();
		}
		
		if (kljuc < tekuci.getKljuc()) {
			return pronadjiRekurzivno(tekuci.getLevo(), kljuc);
		}
		else {
			return pronadjiRekurzivno(tekuci.getDesno(), kljuc);
		}
		
	}

}
	

