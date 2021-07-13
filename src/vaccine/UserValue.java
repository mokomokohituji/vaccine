package vaccine;

import java.io.Serializable;

public class UserValue implements Serializable {
	private String result;

	public UserValue() {	
	}
	public UserValue(String result) {
		this.result = result;
	}
	/**
	 * @return result
	 */
	public String getResult() {
		return this.result;
	}

	/**
	 * @param result セットする result
	 */
	public void setResult(String result) {
		this.result = result;
	}

}
