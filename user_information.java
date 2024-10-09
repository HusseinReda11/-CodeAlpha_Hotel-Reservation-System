public class user_information {
    private String name;
    private int phone;
    private String email;
    public user_information(String name, int phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "About User{ " +
                "Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Phone number=" + phone +
                " }";
    }
}
