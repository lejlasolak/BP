package etf.unsa.ba.FileManagementSystem.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.Date;
import java.util.List;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FMS_FILE")
public class FMS_File {

	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "FileID")
    @SequenceGenerator(name = "FileID", sequenceName = "FileID")
    private Long id;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "file_size")
    private Long file_size;

	@Column(name = "is_deleted")
    private Boolean is_deleted;
	
	@Column(name = "created_at")
    private Date created_at;
	
	@Column(name = "expiry_date")
    private Date expiry_date;
	
	@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "created_by", nullable = false)
	private Person person;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id", nullable = true)
		private FMS_File parent;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "file_type_id", nullable = false)
		private File_Type file_type;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "file")
    private List<File_Access_Log> logs;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "parent")
    private List<FMS_File> files;
    
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "file")
    private List<File_Access_Token> tokens;
	
	public FMS_File() {
		
	}
}
