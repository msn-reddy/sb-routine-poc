package narayan.sbroutine.jpacrud.app.dto;

public class AlphaServiceResponse<T> {

	private T data;
	private String errorMsg;
	private boolean hasError;
	
	public AlphaServiceResponse(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public boolean isHasError() {
		return hasError;
	}

	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}

	public static <T> AlphaServiceResponse<T> of(T data) {
		return new AlphaServiceResponse<>(data);
	}

}
