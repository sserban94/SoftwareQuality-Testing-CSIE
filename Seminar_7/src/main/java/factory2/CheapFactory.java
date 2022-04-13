package factory2;

public class CheapFactory implements IFactory{
    @Override
    public ICostume getCostume() {
        return new CheapCostume();
    }
}
