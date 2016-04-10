package Adapter;

public class XpaytoPayDAdapter implements Xpay {

	private PayD payD = new PayDImpl();
	String expYear = null;
	
	@Override
	public String getCreditCardNo() {
		return payD.getCustCardNo();
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		payD.setCustCardNo(creditCardNo);
	}

	@Override
	public String getCustomerName() {
		return payD.getCardOwnerName();
	}

	@Override
	public void setCustomerName(String customerName) {
		payD.setCardOwnerName(customerName);
	}

	@Override
	public String getCardExpMonth() {
		return payD.getCardExpMonthDate();
	}

	@Override
	public void setCardExpMonth(String cardExpMonth) {
		payD.setCardExpMonthDate(cardExpMonth);
	}

	@Override
	public String getCardExpYear() {
		return expYear;
	}

	@Override
	public void setCardExpYear(String cardExpYear) {
		this.expYear = cardExpYear;
	}

	@Override
	public Short getCardCVVNo() {
		return Short.parseShort(Integer.toString(payD.getCVVNo()));
	}

	@Override
	public void setCardCVVNo(Short cardCVVNo) {
		Integer cvv = Integer.parseInt(Short.toString(cardCVVNo));
		payD.setCVVNo(cvv);
	}

	@Override
	public Double getAmount() {
		return payD.getTotalAmount();
	}

	@Override
	public void setAmount(Double amount) {
		payD.setTotalAmount(amount);

	}

}
