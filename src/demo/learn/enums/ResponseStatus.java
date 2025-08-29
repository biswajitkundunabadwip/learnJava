package demo.learn.enums;

public enum ResponseStatus {
	OK(200),NOT_FOUND(404),INTERNAL_SERVER_ERROR(500);
	
	private int code;

	public int getCode() {
		return code;
	}

	private ResponseStatus(int code) {
		this.code = code;
	}
	
	public static ResponseStatus codeValiddation(int code) {
		for(ResponseStatus status : ResponseStatus.values()) {
			if(status.getCode()==code) {
				System.out.println("--->"+status.getCode());
				return status;
			}
		};
		throw new IllegalArgumentException("invalid status code "+code);
	}
	
	public static void main(String[] args) {
		int responseCodeGotFromApiResponse=500;
		ResponseStatus internalServerError = ResponseStatus.INTERNAL_SERVER_ERROR;
		System.out.println("if we do by default call for enum : "+internalServerError);
		ResponseStatus recivedCode = ResponseStatus.codeValiddation(responseCodeGotFromApiResponse);
		
		System.out.println("API code response got from response body of api "+internalServerError);
		System.out.println("API code response got from response body of api "+recivedCode.getCode());
	}
}
