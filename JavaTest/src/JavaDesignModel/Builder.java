package JavaDesignModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanshizhe
 * 建造者模式，批量生产对象。
 */
public class Builder {
    private List<Sender> senderList = new ArrayList<Sender>();
    
    public List<Sender> produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            senderList.add(new MailSend());
        }
        return senderList;
        
    }
    
    public List<Sender> produceSNSSend(int count){
        for (int i = 0; i < count; i++) {
            senderList.add(new SMSSend());
        }
        return senderList;
    }
    
}
