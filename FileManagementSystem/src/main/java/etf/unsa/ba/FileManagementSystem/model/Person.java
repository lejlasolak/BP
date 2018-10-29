package etf.unsa.ba.FileManagementSystem.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name="PERSON")
public class Person {
	
	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "UserID")
    @SequenceGenerator(name = "UserID", sequenceName = "UserID")
    private Integer id;
	
	@Column(name = "username")
    private String username;
	
	@Column(name = "password")
    private String password;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "person")
    private Set<FMS_File> files;
    
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "person")
    private Set<File_Access_Log> logs;
    
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "person")
    private Set<User_Role> roles;
	
	public Person() {
		
	}
	
	public Integer getID() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}
