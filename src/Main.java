import model.fintech.*;
import services.fintech.Report;

public class Main {
    public static void main(String[] args) {

        Address address = new Address(1121, "65634478", "Beco do Crime", "Gotham");
        System.out.println(address.getId());

        User user = new User("Midoria", "midoria@gmail.com", "18/10/1990","M", address);
        System.out.println("Usuário: "+ user.getName());
        Transaction moneyInOne = new MoneyIn("Job", 15500, "25/08/2024", "trampo");
        Transaction moneyInTwo = new MoneyIn("Feela", 200.22, "25/08/2024", "trampo 2");
        Category categoryOne = new Category(Category.Type.DIVERSAO);
        Category categoryTwo = new Category(Category.Type.FREELANCE);
        Transaction moneyOutOne = new MoneyOut(1800, "18/03/2020", "Comprar ps5", categoryOne);
        Transaction moneyOutTwo = new MoneyOut(1500, "18/03/2020", "comprar note", categoryTwo);
        user.addTransaction(moneyInOne);
        user.addTransaction(moneyInTwo);
        user.addTransaction(moneyOutOne);
        user.addTransaction(moneyOutTwo);
        System.out.println("Dinheiro entrando: "+ user.calculateTotalMoneyIn());
        System.out.println("Dinheiro saindo: "+user.calculateTotalMoneyOut());
        Report report = new Report(user);
        System.out.println(report.TotalMoney());
    }
}