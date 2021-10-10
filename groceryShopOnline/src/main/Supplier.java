public class Supplier {
    private String companyName;
    private String address;
    private long taxID;

    public Supplier(String companyName, String address, long taxID) {
        this.companyName = companyName;
        this.address = address;
        this.taxID = taxID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTaxID() {
        return taxID;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", taxID=" + taxID +
                '}';
    }
}
