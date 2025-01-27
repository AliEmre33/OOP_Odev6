public class Kullanici {

    private int id;
    private String username;
    private String password;


    public Kullanici(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
