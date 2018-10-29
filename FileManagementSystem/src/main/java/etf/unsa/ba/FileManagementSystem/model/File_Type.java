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
@Table(name="FILE_TYPE")
public class File_Type {

	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "FileTypeID")
    @SequenceGenerator(name = "FileTypeID", sequenceName = "FileTypeID")
    private Long id;
	
	@Column(name = "type")
    private String type;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "file_type")
    private List<FMS_File> files;
	
	public File_Type() {
		
	}
}
