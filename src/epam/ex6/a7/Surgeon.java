package epam.ex6.a7;

public abstract class Surgeon implements Doctor {

	protected String name;

	public Surgeon(String name) {
		this.name = name;
	}

	protected String diagnos;
	protected String patientName;



	@Override
	public void setDiagnos(String patientName, int analysis) {
		this.patientName = patientName;
		if (analysis > 10) {
			diagnos = "Bad";
		} else
			diagnos = "Norm";
	}

	@Override
	public void treat() {
		if (diagnos.equals("Bad")) {
			System.out.println(patientName + " was treated");
		} else {
			System.out.println(patientName + "  normal");
		}
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiagnos() {
		return diagnos;
	}

}
