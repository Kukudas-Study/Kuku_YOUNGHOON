import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            // Arrays.copyOfRange(원본배열, 시작인덱스, 끝인덱스)
            int[] copy = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(copy);
            answer[i] = copy[commands[i][2]-1];
        }

        return answer;
    }
}