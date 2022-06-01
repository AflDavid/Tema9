import java.util.Objects;

public class ContEuro extends ContBancar {
	private String numarCont;
	private float suma;

	public ContEuro(String numarCont, float suma) {
		super(numarCont, suma);
		this.numarCont = numarCont;
		this.suma = suma;
	}

	public String getNumarCont() {
		return numarCont;
	}

	public void setNumarCont(String numarCont) {
		this.numarCont = numarCont;
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}

	public String toString() {
		return "ContEuro [numarCont=" + numarCont + ", suma=" + suma + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numarCont, suma);
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContEuro other = (ContEuro) obj;
		return Objects.equals(numarCont, other.numarCont)
				&& Float.floatToIntBits(suma) == Float.floatToIntBits(other.suma);
	}

	public float getSumaTotala() {
		return 0;
	}
}