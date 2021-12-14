package cuestion3;

public class Main {

	public static void main(String[] args) {
		String[] Asignatura = new String[4];
		Asignatura[0]= "Lengua";
		Asignatura[1]= "Mate";
		Asignatura[2]= "Historia";
		Asignatura[3]= "Filosofía";
		
		float[] Calificación= new float[4];
		Calificación[0]= 9.25f;
		Calificación[1]= 4.25f;
		Calificación[2]= 7.55f;
		Calificación[3]= 8.25f;
		
		for(int x=0;x<Asignatura.length;x++)
			System.out.println(Asignatura[x]);
	}

	
}
