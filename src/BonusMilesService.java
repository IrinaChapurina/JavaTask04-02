public class BonusMilesService {
    public int calculate(int price) {
        int priceBonus = 20;// Стоимость одной мили
        int result = price / priceBonus;//Расчет количества миль
        return result;
    }
}
