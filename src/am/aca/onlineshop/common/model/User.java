
public class User {
	
	String name;
	int userId;
	Card card;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public User(String name, int userId, Card card) {
		super();
		this.name = name;
		this.userId = userId;
		this.card = card;
	}

}
