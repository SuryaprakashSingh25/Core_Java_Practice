package GPTPractiseSet.Map.Transaction;

class Transaction {
    private int transactionId;
    private int customerId;
    private double amount;

    public Transaction(int transactionId, int customerId, double amount) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.amount = amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", customerId=" + customerId +
                ", amount=" + amount +
                '}';
    }
}