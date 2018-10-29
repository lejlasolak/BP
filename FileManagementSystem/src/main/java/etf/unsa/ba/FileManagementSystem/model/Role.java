package etf.unsa.ba.FileManagementSystem.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
public class Role {

	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "RoleID")
    @SequenceGenerator(name = "RoleID", sequenceName = "RoleID")
    private Long id;
	
	@Column(name = "name")
    private String name;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "role")
    private List<User_Role> users;
	
	public Role() {
		
	}
}
