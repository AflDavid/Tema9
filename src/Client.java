import java.util.HashSet;
import java.util.Objects;

public class Client {

	protected String nume;
	protected String adresa;

	public Client(String nume, String adresa) {
		this.nume = nume;
		this.adresa = adresa;
	}

	HashSet<SumaTotala> list = new HashSet<SumaTotala>();

	public ContBancar createAccount(String numarCont, float suma, String currenty) {
		if (currenty == "Lei") {
			return new ContLei(numarCont, suma);
		} else {
			return new ContEuro(numarCont, suma);
		}
	}

	public int hashCode() {
		return Objects.hash(adresa, list, nume);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(adresa, other.adresa) && Objects.equals(list, other.list)
				&& Objects.equals(nume, other.nume);
	}

	public String toString() {
		return "Client [nume=" + nume + ", adresa=" + adresa + ", list=" + list + "]";
	}
}