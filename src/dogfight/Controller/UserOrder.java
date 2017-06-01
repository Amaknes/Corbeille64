package dogfight.Controller;

public class UserOrder {
//ATTRIBUTES
private int player;
private Order order;
//CONSTRUCTOR
UserOrder(int player, Order order)
{
	this.player=player;
	this.order=order;
}
//METHODS
public int getPlayer() {
	return player;
}
public Order getOrder() {
	return order;
}
}
