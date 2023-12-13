package Bank.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String firstName;
	String lastName;
	long accountNo;
	String accountType;
	String branchName;
	int ifscCode;
	long phone;
	@Column(unique = true)
	String email;
	String dob;
	String gender;
	String password;
	String address;
	String area;
	String city;
	int pincode;
	String state;
	String country;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Bank(String fistName, String lastName, long accountNo, String accountType, String branchName, int ifscCode,
			long phone, String email, String dob, String gender, String password, String address, String area,
			String city, int pincode, String state, String country) {
		super();
		this.firstName = fistName;
		this.lastName = lastName;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.password = password;
		this.address = address;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}
	
	public Bank() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Bank [id=" + id + ", fistName=" + firstName + ", lastName=" + lastName + ", accountNo=" + accountNo
				+ ", accountType=" + accountType + ", branchName=" + branchName + ", ifscCode=" + ifscCode + ", phone="
				+ phone + ", email=" + email + ", dob=" + dob + ", gender=" + gender + ", password=" + password
				+ ", address=" + address + ", area=" + area + ", city=" + city + ", pincode=" + pincode + ", state="
				+ state + ", country=" + country + "]";
	}

}
