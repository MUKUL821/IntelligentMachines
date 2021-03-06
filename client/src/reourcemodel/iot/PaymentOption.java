package reourcemodel.iot;

public class PaymentOption
{

	private ID _id;
	
	private String plan;
	 
	private String billDate;
	 
	private String amount;
	
	private CardDetails cardDetails;
	
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getBillDate() {
		return billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public CardDetails getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(CardDetails cardDetails) {
		this.cardDetails = cardDetails;
	}	 
	public ID get_id() {
		return _id;
	}
	public void set_id(ID _id) {
		this._id = _id;
	}

}
