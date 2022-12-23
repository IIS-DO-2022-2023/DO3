package observer2;

import java.util.Observable;
import java.util.Observer;

public class CryptoCurrencyPriceSMS implements Observer {
	private double bitcoinPrice;
	private double ethereumPrice;

	@Override
	public void update(Observable o, Object arg) {
		CryptoCurrencyPrice cryptoCurrencyPrice = (CryptoCurrencyPrice) o;
		this.bitcoinPrice = cryptoCurrencyPrice.getBitcoinPrice();
		this.ethereumPrice = cryptoCurrencyPrice.getEthereumPrice();
		sendSMS();

	}

	public void sendSMS() {
		System.out.println("Bitcoin price is: " + bitcoinPrice);
		System.out.println("Ethereum price is: " + ethereumPrice);
	}

}
