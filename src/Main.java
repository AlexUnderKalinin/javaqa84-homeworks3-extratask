public class Main {

    public static void main(String[] args) {

        //Формула расчета аннуитетного платежа ЕП = С × ПС × (1 + ПС)ⁿ / ((1 + ПС)ⁿ – 1)
        //где, ЕП – размер ежемесячного платежа,
        //ПС – вычисляется по формуле: годовая ставка / 12 мес. / 100%
        //n - срок кредита в месяцах

Creditcalcservice service =new Creditcalcservice();
System.out.println("При сумме кредита 1 000 000 руб. на срок 1 год");
System.out.println("ежемесячный платеж равен " + service.payment (1000000, 12));
    }
}