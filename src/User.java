public class User {
    int id;
    String name;
    String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return "ID: " + id + " | Nome: " + name + " | Email: " + email;
    }
}
