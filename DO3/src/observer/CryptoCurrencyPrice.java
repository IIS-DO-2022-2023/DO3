package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CryptoCurrencyPrice implements Observable {
	private double bitcoinPrice;
	private double ethereumPrice;

	private List<Observer> observers;

	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		notifyObservers();
	}

	public void setEthereumPrice(double ethereumPrice) {
		this.ethereumPrice = ethereumPrice;
		notifyObservers();
	}

	public CryptoCurrencyPrice() {
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext())
			it.next().update(bitcoinPrice, ethereumPrice);
	}

}
