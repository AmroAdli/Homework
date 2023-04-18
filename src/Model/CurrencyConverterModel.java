/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 97059
 */
public class CurrencyConverterModel {
    private double exchangeRate; // exchange rate between dollars and shekels

    public CurrencyConverterModel() {
        // Set the initial exchange rate (for example)
        exchangeRate = 3.5;
    }

    public double convertToShekels(double dollars) {
        return dollars * exchangeRate;
    }

    public double convertToDollars(double shekels) {
        return shekels / exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
