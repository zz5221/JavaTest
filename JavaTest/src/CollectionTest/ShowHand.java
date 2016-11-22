package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class ShowHand {
    // players nums
    private final int PLAY_NUM = 5;
    private String[] types = {"黑桃","红桃","方块","草花"};
    //值
    private String[] values = {"A","1","2","3","4","5","6","7","8","9","J","Q","K"};
    //一局中剩下的牌
    private List<String> cards = new LinkedList<String>();
    //定义所有玩家
    private String[] players = new String[PLAY_NUM];
    //所有玩家手上的扑克牌
    private List<String>[] players_cards = new List[PLAY_NUM];
    
    /**
     * 
     */
    public void initCards(){
        for (int i = 0; i <types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(types[i]+values[j]);
            }
        }
        Collections.shuffle(cards);
    }
    /**
     * 
     */
    public void showAllCards(){
        for(String card:cards){
            System.out.println(card);
        }
    }
    /**
     * 为玩家赋名字
     * @param names
     */
    public void initPlayers(String... names){
        if(names.length>PLAY_NUM || names.length<2){
            System.out.println("玩家数量不对");
            return ;
        }else{
            for (int i = 0; i < names.length; i++) {
                players[i] = names[i];
            }
        }
    }
    /**
     * 初始化每位玩家的牌
     */
    public void initPlayersCards(){
        for (int i = 0; i < players.length; i++) {
            if(players[i]!=null && !players[i].equals("")){
                players_cards[i] = new LinkedList<>();
            }
        }
    }
    /**派送扑克牌
     * @param first
     */
    public void deliverCard(String first){
//        int firstPos = ArrayUtils.;
//        cards.get();
//        String a = cards.remove(firstPos);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        ShowHand showHand= new ShowHand();
        showHand.initCards();
        showHand.showAllCards();
    }
}
