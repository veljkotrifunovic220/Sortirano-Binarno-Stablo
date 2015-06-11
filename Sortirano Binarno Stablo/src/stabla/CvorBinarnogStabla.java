package stabla;

public class CvorBinarnogStabla {

	private int kljuc;
	private String vrednost;
	private CvorBinarnogStabla levo;
	private CvorBinarnogStabla desno;
	
	public CvorBinarnogStabla(int kljuc, String vrednost, CvorBinarnogStabla levo, CvorBinarnogStabla desno) {
		super();
		this.kljuc = kljuc;
		this.vrednost = vrednost;
		this.levo = levo;
		this.desno = desno;
	}
	
	public CvorBinarnogStabla(int kljuc, String vrednost) {
		this(kljuc, vrednost, null, null);
	}

	public int getKljuc() {
		return kljuc;
	}

	public void setKljuc(int kljuc) {
		this.kljuc = kljuc;
	}

	public String getVrednost() {
		return vrednost;
	}

	public void setVrednost(String vrednost) {
		this.vrednost = vrednost;
	}

	public CvorBinarnogStabla getLevo() {
		return levo;
	}

	public void setLevo(CvorBinarnogStabla levo) {
		this.levo = levo;
	}

	public CvorBinarnogStabla getDesno() {
		return desno;
	}

	public void setDesno(CvorBinarnogStabla desno) {
		this.desno = desno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kljuc;
		result = prime * result
				+ ((vrednost == null) ? 0 : vrednost.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CvorBinarnogStabla other = (CvorBinarnogStabla) obj;
		if (kljuc != other.kljuc)
			return false;
		if (vrednost == null) {
			if (other.vrednost != null)
				return false;
		} else if (!vrednost.equals(other.vrednost))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CvorBinarnogStabla [kljuc=" + kljuc + ", vrednost=" + vrednost +"]";
	}
	
	
	
	
	
	
}
