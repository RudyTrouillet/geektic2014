package user;

import javax.persistence.*;


@Entity(name="User")
@SequenceGenerator(name="USER_SEQ", sequenceName="user_seq")
public class user {

   
    @JoinTable(name = "GEEKTIC",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_interest"))
   

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="USER_SEQ")
    private Long id_geek;
    private String nom;
    private String prenom;
    private String mail;
    private String sexe;

    public user(Long id_geek, String nom, String prenom, String mail, String sexe) {
        this.id_geek = id_geek;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.sexe = sexe;
    }

    public user() {
        this.nom = "";
        this.prenom = "";
        this.mail = "";
        this.sexe = "";
    }

    public Long getId() {
        return id_geek;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getSexe() {
        return sexe;
    }
}
