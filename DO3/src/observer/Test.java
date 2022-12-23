package observer;

public class Test {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		CryptoCurrencyPriceSMS cryptoCurrencyPriceSMS = new CryptoCurrencyPriceSMS();

		cryptoCurrencyPrice.addObserver(cryptoCurrencyPriceSMS);

		cryptoCurrencyPrice.setBitcoinPrice(50000);
		cryptoCurrencyPrice.setEthereumPrice(5000);

	}

}
