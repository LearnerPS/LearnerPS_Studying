***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package book.vo;

public class BookVo {
	private String isbn, title, publisher, author;
	private int price;
	
	public BookVo() {
	}

	public BookVo(String isbn, String title, String publisher, String author, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVo [" + isbn + ", " + title + ", " + publisher + ", " + author
				+ ", " + price + "]";
	}
	
}

```
