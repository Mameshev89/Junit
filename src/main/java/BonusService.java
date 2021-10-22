public class BonusService {
    public long calculate(long amount,boolean registed){
        int percent=registed ? 3:1;
        long bonus=percent*amount/100/100;
        long limit=500;
        if(bonus>limit){
            bonus=limit;
        }
        return  bonus;
    }
}
