package cafeteria;

public class LyyraCard {
    double balance;
    
    public LyyraCard(double startBalance){
        this.balance = startBalance;}
    
    public String toString(){
        return "The card has " + balance + " euros";}
    
    public void payEconomical(){
        if(balance>=2.5){
            balance -= 2.50;}}
    
    public void payGourmet(){
        if(balance>=4){
            balance -= 4;}}
    
    public void loadMoney(double amount){
        if(amount>=0){
            balance += amount;
            if(balance>150) balance = 150;}}
}
