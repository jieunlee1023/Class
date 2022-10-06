package ch13;

public class VIPCustomer extends Customer {

	private int agentId;
	double salesRatio;

	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	public int getAgentId() {
		return agentId;
	}

}
