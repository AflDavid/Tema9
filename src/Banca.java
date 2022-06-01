import java.util.HashSet;

public class Banca {

	public static void main(String[] args) {

		HashSet<Client> listOfClients = new HashSet<Client>();
		Client c1 = new Client("Cris", "Balaceanu");
		c1.createAccount("9658564254", 132, "LEI");

		System.out.println(c1.toString());
		c1.createAccount("3452874547", 145, "EURO");
		listOfClients.add(c1);
	}

}