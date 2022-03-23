package lab.jpa.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="author_t")
public class Author {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "author_id")
	private int authorId;
	
	@Column(name= "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "phone_no")
	private Long phoneNo;
	
	public Author() {
		super();
	}

	public Author(int authorId, String firstName, String middleName, String lastName, Long phoneNo) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	
	
	
	public Author(String firstName, String middleName, String lastName, Long phoneNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public int getauthorId() {
		return authorId;
	}

	public void setauthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Author [AuthorID=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", phoneNo=" + phoneNo + "]";
	}		
		
}


