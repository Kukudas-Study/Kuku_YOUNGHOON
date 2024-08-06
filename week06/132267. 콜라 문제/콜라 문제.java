class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int newCola = (n / a) * b; // 교환으로 받은 새 콜라 수
            answer += newCola;
            n = (n % a) + newCola; // 남은 빈 병 수 계산
        }

        return answer;
    }
}