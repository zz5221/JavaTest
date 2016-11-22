package JavaDesignModel;

/**
 * @author hanshizhe
 * 工厂模式。建造相似的对象
 */
public class FactoryModel {
    public static void main(String[] args) {
        Sender mSender = SendFactory.produceMailSender();
        mSender.send();
        Sender SMSSender = SendFactory.produceSMSSend();
        SMSSender.send();
    }
    
}
