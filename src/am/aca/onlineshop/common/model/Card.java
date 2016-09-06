
public class Card {

	CardType cardType;
	int cardId;
	int userId;
	int number;
		
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Card(CardType cardType, int cardId, int userId, int number) {
		super();
		this.cardType = cardType;
		this.cardId = cardId;
		this.userId = userId;
		this.number = number;
	}
	
}
