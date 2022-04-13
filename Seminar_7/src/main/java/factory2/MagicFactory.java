package factory2;

public class MagicFactory implements IFactory{
    @Override
    public ICostume getCostume() {
        return new MagicCostume();
    }
}
