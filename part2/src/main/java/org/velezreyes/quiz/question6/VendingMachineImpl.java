package org.velezreyes.quiz.question6;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {
  
  private int money = 0;
  private Map<String, Drink> drinks = new HashMap<>();

  public VendingMachineImpl() {
    drinks.put("ScottCola", new Drink() {
      @Override
      public String getName() {
        return "ScottCola";
      }

      @Override
      public boolean isFizzy() {
        return true;
      }
    });
    drinks.put("KarenTea", new Drink() {
      @Override
      public String getName() {
        return "KarenTea";
      }

      @Override
      public boolean isFizzy() {
        return false;
      }
    });
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    this.money += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    Drink drink = drinks.get(name);
    if (drink == null) {
      throw new UnknownDrinkException();
    }
    int price = "KarenTea".equals(name) ? 100 : 75;
    if (this.money < price) {
      throw new NotEnoughMoneyException();
    }
    this.money -= price;
    return drink;
  }
}

