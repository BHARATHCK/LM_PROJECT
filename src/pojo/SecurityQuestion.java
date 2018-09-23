package pojo;

public class SecurityQuestion {
	private int sec_id;
	private String sec_ques;
	private String sec_ans;
	
	/*public SecurityQuestion() {
		System.out.println("SecurityQuestion() ctor...");
	}*/
	
	public int getSec_id() {
		return sec_id;
	}
	public void setSec_id(int sec_id) {
		this.sec_id = sec_id;
	}
	public String getSec_ques() {
		return sec_ques;
	}
	public void setSec_ques(String sec_ques) {
		this.sec_ques = sec_ques;
	}
	public String getSec_ans() {
		return sec_ans;
	}
	public void setSec_ans(String sec_ans) {
		this.sec_ans = sec_ans;
	}

	@Override
	public String toString() {
		return sec_id +"." +sec_ques;
		
	}
	

	
}
