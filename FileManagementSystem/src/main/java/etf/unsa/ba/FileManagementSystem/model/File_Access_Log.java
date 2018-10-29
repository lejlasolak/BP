package etf.unsa.ba.FileManagementSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FILE_ACCESS_LOG")
public class File_Access_Log {

	@Id
	@Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "FileAccessLogID")
    @SequenceGenerator(name = "FileAccessLogID", sequenceName = "FileAccessLogID")
    private Long id;
	
	@Column(name = "operation")
    private String operation;
	
	@Column(name = "access_time")
    private Date access_time;
	
	@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "user_id", nullable = false)
	private Person person;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "file_id", nullable = true)
		private FMS_File file;
	
	public File_Access_Log() {
		
	}
}
