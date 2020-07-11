package net.siekiera.natoalphabet;

import javax.persistence.*;

@Entity
@Table(name = "alphabet")
public class NatoAlphabet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Character letter;
    private String phoneticAlphabet;
    private String topSecretCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    public String getPhoneticAlphabet() {
        return phoneticAlphabet;
    }

    public void setPhoneticAlphabet(String phoneticAlphabet) {
        this.phoneticAlphabet = phoneticAlphabet;
    }

    public String getTopSecretCode() {
        return topSecretCode;
    }

    public void setTopSecretCode(String topSecretCode) {
        this.topSecretCode = topSecretCode;
    }
}
