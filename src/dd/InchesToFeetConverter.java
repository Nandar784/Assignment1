package dd;

public class InchesToFeetConverter {
	int i;
	int f;
	public void convert(int inches) {
		i=inches;
		System.out.println(i+"'' equals "+(f=inches/12) + "' "+(i=inches%12)+"''");
		
	}

	

}
