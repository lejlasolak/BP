package etf.unsa.ba.FileManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "CONFIG")
public class Config {

	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ConfigID")
    @SequenceGenerator(name = "ConfigID", sequenceName = "ConfigID")
    private Long id;
	
	@Column(name = "root_dir")
    private String root_dir;

	@Column(name = "active")
    private Boolean active;
	
	public Config() {
		
	}
}
