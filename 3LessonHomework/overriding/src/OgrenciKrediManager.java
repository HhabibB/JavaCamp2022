public class OgrenciKrediManager extends BaseKrediManager{
    @Override
    public double hesabla(double tutar) {
        return tutar * 1.10;
    }
}
