/*package tn.playhouse2.model;

import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name="uploadFile")
public class UploadFile {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@Lob
	private byte[] data;
	
	
    @OneToOne
    @MapsId
    private User user;
    
	
	@Transient
	private String dataValue;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDataValue() {
		return Base64.getEncoder().encodeToString(this.data);
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
	
	
	
}*/