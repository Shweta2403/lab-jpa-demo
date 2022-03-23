package lab.jpa.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity
	@Table(name="book_table")
	public class Book {
		
		@Id
		//@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "ISBN")
		private int isbn;
		
		@Column(name= "Title")
		private String title;
		
		@Column(name = "Price")
		private Double price;
	
		public Book() {
			super();
		}

		public Book(int isbn, String title, Double price) {
			super();
			this.isbn = isbn;
			this.title = title;
			this.price = price;
		}
		
		public int getIsbn() {
			return isbn;
		}

		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		
		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}
		
		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
		}
		
		
}
