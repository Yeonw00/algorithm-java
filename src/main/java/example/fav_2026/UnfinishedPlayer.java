package example.fav_2026;

import java.util.HashMap;

public class UnfinishedPlayer {
    public static void main(String[] args) {
        UnfinishedPlayer up = new UnfinishedPlayer();
        String[] p = {"Benedict", "Sophie", "Daphne"};
        String[] c = {"Benedict", "Sophie"};
        System.out.println("완주하지 못한 선수: " + up.checkPlayers(p, c));
    }

    public String checkPlayers(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String p: participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c: completion) {
            map.put(c, map.get(c) -1);
        }

        for(String key: map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
    return answer;
    }
}
