class Solution {
    public int solution(int order) {
        // 3, 6, 9 가 몇번 들어있는지 담을 변수를 0으로 초기화한다.
        int answer = 0;
        // int를 String으로 변환하기
        String temp = Integer.toString(order);
        for(int i = 0 ; i < temp.length() ; i++){
            // 문자열의 i번째 문자를 변수 ch에 저장한다.
            char ch = temp.charAt(i);
            // 변수 ch가 '3', '6', '9' 중 하나인지 확인한다.
            if(ch == '3' || ch == '6' || ch == '9'){
                // answer을 1 증가시킨다.
                answer++;
            }
        }
        return answer;
    }
}