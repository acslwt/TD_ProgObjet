public class ManipulationChats {

  public static void main (String[] args) {

    Couleur[] c1 ={Couleur.bleu,Couleur.blanc};

    PelageChat pelageAz = new PelageChat(c1,true,"RAS");

    PelageChat pelageGros = new PelageChat(c1,false,"RAS");

    Chat az = new Chat("Azrael",pelageAz,true,2006,false);

    Chat gros = new Chat("Grominet",pelageGros,false,2008,false);

    System.out.println(az.toString());

    System.out.println(gros.toString());

	}

}
