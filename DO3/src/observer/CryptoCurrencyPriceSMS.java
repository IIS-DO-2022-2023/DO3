package observer;

public class CryptoCurrencyPriceSMS implements Observer {
	private double bitcoinPrice;
	private double ethereumPrice;

	@Override
	public void update(double bitcoinPrice, double ethereumPrice) {
		this.bitcoinPrice = bitcoinPrice;
		this.ethereumPrice = ethereumPrice;
		sendSMS();

	}

	public void sendSMS() {
		System.out.println("Bitcoin price is: " + bitcoinPrice);
		System.out.println("Ethereum price is: " + ethereumPrice);
	}

}
