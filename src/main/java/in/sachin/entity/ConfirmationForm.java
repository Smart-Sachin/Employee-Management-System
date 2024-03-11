package in.sachin.entity;

public class ConfirmationForm {
	
	private String confirmation;

	
	public ConfirmationForm() {
		super();
	}

	public ConfirmationForm(String confirmation) {
		super();
		this.confirmation = confirmation;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	@Override
	public String toString() {
		return "ConfirmationForm [confirmation=" + confirmation + "]";
	} 

}
