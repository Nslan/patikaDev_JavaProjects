package InsuranceManagementSystem;

import java.util.ArrayList;
import java.util.Date;

public class User {

    private String name ,  lastName , email , password , job  , membership ;
    private int age;

    private Address address ;
    private Insurance insurance ;
    private ArrayList<Address> addressList = new ArrayList<>();
    private ArrayList<Insurance> insuranceList = new ArrayList<>();
    private Date lastLoginDate;


    public User(String name,String lastName,String email,String password,String job,int age,Address address,String membership){
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.job=job;
        this.age=age;
        this.address=address;
        this.addressList.add(address);
        this.lastLoginDate =new Date(System.currentTimeMillis());
        this.membership=membership;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(Address addressList) {
        this.addressList.add(addressList);
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(Insurance insurance) {
        this.insuranceList.add(insurance);
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
