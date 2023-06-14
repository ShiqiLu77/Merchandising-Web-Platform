package neu.edu.controller.response;

public class GenericResponse {
	
	private boolean status;
	
	
	// Constructors
	public GenericResponse() {
		
	}
	
	public GenericResponse(boolean status) {
		super();
		this.status = status;
	}


	// Setter and Getter
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
