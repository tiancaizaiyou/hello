package cn.anygloble.doudizhu;

import java.util.*;

public class DouDiZhu {
    public static void main(String[] args) {
        /*
        准备牌
         */
        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokeIndex = new ArrayList<>();
        List<String> huase = new ArrayList<>();
        List<String> num = new ArrayList<>();
        Collections.addAll(huase,"♥","♣","♦","♠");
        Collections.addAll(num,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int index = 0;
        poker.put(index,"大王");
        pokeIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokeIndex.add(index);
        index++;
        for (String s : num) {
            for (String s1 : huase) {
                pokeIndex.add(index);
                poker.put(index,s+s1);
                index++;
            }
        }

        //Map.Entry<Integer,String> entry = Map.entry(1,"22");

        System.out.println(pokeIndex);
        Collections.shuffle(pokeIndex);
        System.out.println(pokeIndex);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for(int i = 0 ; i<pokeIndex.size() ;i++){
            int in = pokeIndex.get(i);
            if(i>=51){
                dipai.add(in);
            }else if (i%3==0){
                player1.add(in);
            }else if (i%3==1){
                player2.add(in);
            }else if (i%3==2){
                player3.add(in);
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);

        /*
        看牌
         */
        look("玩家一",player1,poker);
        look("玩家二",player2,poker);
        look("玩家三",player3,poker);
        look("底牌",dipai,poker);

    }

    private static void look(String player,ArrayList<Integer> playerDe,HashMap<Integer,String> poker) {
        System.out.print(player + ": ");
        for (Integer integer : playerDe) {
            System.out.print(poker.get(integer)+" ");
        }
        System.out.println();
    }
}
