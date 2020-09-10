package kakao.codingtest;

public class StringCompress {
   // 카카오 코딩테스트 2020년 1번문제
   // https://programmers.co.kr/learn/courses/30/lessons/60057
   
   public static void main(String[] args) {
      String s = "abcabcdede";
      int result = 0;
      int answer = s.length();
      for(int block=1; block<=s.length()/2; ++block) {
         int pos=0;
         int cnt=0;
         result = s.length();
         for(; pos<s.length()-block ;) {
            if(pos+block+block > s.length()) break;
            String unit = s.substring(pos,pos+block);
            String compareUnit = s.substring(pos+block, pos+block+block);
            if(unit.equals(compareUnit)) {
               result -= block;
               ++cnt;
               if(s.length() == pos+block+block) {
                  result+=1;
               }
            } else {
               if(cnt!=0) {
                  if(cnt<9) result += 1;
                  else if (cnt<99) result += 2;
                  else if (cnt<999) result += 3;
               }
               cnt=0;
            }
            pos+=block;
         }
         answer = Math.min(answer, result);
         
      }
      System.out.println(answer);
      
   }
}