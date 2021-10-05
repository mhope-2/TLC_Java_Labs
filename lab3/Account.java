package lab3;

public class Account {

    private double tradeValue = 0;

    private Trade tradeObjects[];

    public void setTradeObjects(Trade[] tradeObjects) {
        tradeObjects = new Trade[tradeObjects.length];
        for (int i = 0; i < tradeObjects.length; i++){
            tradeObjects[i] = new Trade(tradeObjects[i]);
        }
    }

    public double getTradeValue() {
        return tradeValue;
    }

    public void setTradeValue(double tradeValue) {
        this.tradeValue += tradeValue;
    }

    public Trade[] getTradeObjects() {
        return tradeObjects;
    }
}
