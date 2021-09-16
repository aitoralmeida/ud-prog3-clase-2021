package es.deusto.prog3.cap01;


class Padre {
    void DiAlgo()
    {
        System.out.println("Soy el padre");
    }
}
  

class Hijo extends Padre {
    @Override
    void DiAlgo()
    {
        System.out.println("Soy el hijo");
    }
}

public class EjemploOverride {
	    public static void main(String[] args)
	    {
	    	Padre obj1 = new Padre();
	        obj1.DiAlgo();
	  

	        Padre obj2 = new Hijo();
	        obj2.DiAlgo();
	    }
}
