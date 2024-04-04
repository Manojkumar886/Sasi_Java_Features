package Stream_API.Java_Featurs;

public class Studentclass
{
    private String name;
    private String email;

    @Override
    public String toString() {
        return "Studentclass{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Studentclass(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
