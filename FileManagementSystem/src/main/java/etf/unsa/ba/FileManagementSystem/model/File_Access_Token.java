package etf.unsa.ba.FileManagementSystem.model;

import java.util.Date;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name="FILE_ACCESS_TOKEN")
public class File_Access_Token {

	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "FileAccessTokenID")
    @SequenceGenerator(name = "FileAccessTokenID", sequenceName = "FileAccessTokenID")
    private Long id;
	
	@Column(name = "token")
    private String token;
	
	@Column(name = "expiry_date")
    private Date expiry_date;
	
	@Column(name = "num_reads")
    private int num_reads;
	
	@Column(name = "num_writes")
    private int num_writes;
	
	@Column(name = "num_reads_left")
    private int num_reads_left;
	
	@Column(name = "num_writes_left")
    private int num_writes_left;
	
	@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "file_id", nullable = false)
	private FMS_File file;
	
	public File_Access_Token() {
		
	}
}
