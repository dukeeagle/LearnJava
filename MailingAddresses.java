class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class MailingAddresses
{
	public static void main(String[] args)
	{
		Address uno, dos, tres, cuatro;
		
		uno = new Address();
		uno.street = "191 Marigold Lane";
		uno.city   = "Miami";
		uno.state  = "FL";
		uno.zip    = 33179;
		
		dos = new Address();
		dos.street = "3029 Losh Lane";
		dos.city   = "Crafton";
		dos.state  = "PA";
		dos.zip    = 15205;
		
		tres = new Address();
		tres.street = "2693 Hannah Street";
		tres.city   = "Hickory";
		tres.state  = "NC";
		tres.zip    = 28601;
		
		cuatro = new Address();
		
		cuatro.street = "501 Big Woods Blvd";
		cuatro.city   = "Chanhassen";
		cuatro.state  = "MN";
		cuatro.zip    = 55317;
		
		System.out.println(uno.street + "\n" + uno.city + ", " + uno.state + " " + uno.zip + "\n");
		System.out.println(dos.street + "\n" + dos.city + ", " + dos.state + " " + dos.zip + "\n" );
		System.out.println(tres.street + "\n" + tres.city + ", " + tres.state + " " + tres.zip + "\n" );
		System.out.println(cuatro.street + "\n" + cuatro.city + ", " + cuatro.state + " " + tres.zip + "\n" );
	}
}