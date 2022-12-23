package observer2;

import java.util.Observable;

public class CryptoCurrencyPrice extends Observable {
	private double bitcoinPrice;
	private double ethereumPrice;

	public double getBitcoinPrice() {
		return bitcoinPrice;
	}

	public double getEthereumPrice() {
		return ethereumPrice;
	}

	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		setChanged();
		notifyObservers();
	}

	public void setEthereumPrice(double ethereumPrice) {
		this.ethereumPrice = ethereumPrice;
		setChanged();
		notifyObservers();
	}

}
