package net.siekiera.natoalphabet;

import javax.persistence.*;

@Entity
@Table(name = "secret_codes")
public class SecretCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String topSecretCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopSecretCode() {
        return topSecretCode;
    }

    public void setTopSecretCode(String topSecretCode) {
        this.topSecretCode = topSecretCode;
    }
}
