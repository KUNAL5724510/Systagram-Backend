package structagram.com.structagram.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.IdClass;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity
@Table(name = "users")
public class Users {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "username", nullable = false, unique = true)
    private String username;

    @Column(name= "password", nullable = false)
    private String password;

    @Column(name= "email", nullable = false, unique = true)
    private String email;

    @Column(name= "profile_image_url", nullable =true, unique = false)
    private String profileImageUrl;
    
    @Lob
    @Column(name= "bio", nullable =true, unique = false)
    private String bio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

}
