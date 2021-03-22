package test;

import inheritance.Customer;
import inheritance.VIPCustomer;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Leedongjun");
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kimjungtae");
		
		System.out.println(customerLee.showCustomerInfo()); // String return �̱� ������ ��¹� system.out.println �ۼ�
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
