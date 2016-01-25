package Adapter;

public class PayDImpl implements PayD {

	private Integer ccv;
	
	@Override
	public String getCustCardNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCardOwnerName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCardExpMonthDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer getCVVNo() {
		return ccv;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.ccv = cVVNo;

	}

	@Override
	public Double getTotalAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		// TODO Auto-generated method stub

	}

}
