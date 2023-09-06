package etc.api.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class LottoSimulator {

   static Random r = new Random();

   static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
   static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
   static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
   static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
   static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
   static int failCnt = 0; // 당첨 횟수를 세 줄 변수


   public static Set<Integer> createLotto() {
      /*
         - 1~45 범위의 난수 6개를 생성하셔서
         컬렉션 자료형에 모아서 리턴해 주세요.
         무엇을 쓰든 상관하지 않겠습니다.
          중복이 발생하면 안됩니다.
       */

      Set<Integer> set = new HashSet<>();
      
      int lottoNum = 0; //변수 초기화
      while(set.size()!=6) { //set의 크기가 6보다 작을때 실행
         lottoNum = r.nextInt(45)+1; //lottoNum에 랜덤한 숫자 를 대입한다.
         set.add(lottoNum);//set에 31행의 숫자들을 추가한다.
      }
      return set; //리턴값은 set 
   }


   //보너스 번호를 생성하는 메서드
   public static int createBonusNum(Set<Integer> set) {
	   //매개값으로 Set타입의 Integer 의 변수 set 을 대입
	   
      /*
         - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
          당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
          범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
       */
	   
      int bonusNum = 0; //보너스 번호의 변수 초기화
      while(true) { //반복문 실행 
         bonusNum = r.nextInt(45)+1; // 49행의 초기화한 변수에 랜덤한 숫자 하나를 선언
         if(!createLotto().contains(bonusNum)) //만약 20행의 메서드의 매개값과 보너스 넘버가 같지않을때
            break; //종료
      }
      return bonusNum; //리턴값으로 bonusNum을 리턴
   } //createBonusNum(Set<Integer> set)은 보너스값.

   //당첨 등수를 알려주는 메서드
   public static void checkLottoNumber(Set<Integer> lottoSet, Set<Integer> numSet, int bonusNum) {
     
	   /*
         매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
         내 로또 번호와 당첨번호를 비교하여
         일치하는 횟수를 세 주신 후 등수를 판단하세요.
         판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
         6개 일치 -> 1등
         5개 일치 + 보너스번호 일치 -> 2등
         5개 일치 -> 3등
         4개 일치 -> 4등
         3개 일치 -> 5등
         나머지 -> 꽝
       */
     
	   int buyerBonusNum = createBonusNum(numSet);// 40행의 메서드 매개값을 buyerBonusNum변수로 선언 

      int cnt = 0; //cnt 변수 초기화


      for(int i : lottoSet) { //
         if(numSet.contains(i)) {
            cnt++;
         }
      }

      if(cnt == 6) {
         prize1++;
      } else if(cnt == 5) {
         if(buyerBonusNum == bonusNum) {
            prize2++;
         } prize3++;
      } else if(cnt == 4) {
         prize4++;
      } else if(cnt == 3) {
         prize5++;
      } else {
         failCnt++;
      }
      return;
   }

   public static void main(String[] args) {
      //로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
      Set<Integer> lottoSet = createLotto();
      //보너스번호도 하나 고정시키세요.
      int bonusNum = createBonusNum(lottoSet);

      long cost = 0;
      while(true) {
         /*
             - 1등이 당첨 될 때까지 반복문을 돌립니다.
             - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
              반복문을 종료합니다.
             - 로또를 구매하기 위한 금액도 출력하세요. (long)
          */

         checkLottoNumber(lottoSet, createLotto(), bonusNum);
         if(prize1==1) {
            break;
         } 
         cost+=1000;

      }
      System.out.println(lottoSet);
      System.out.println(cost+"원");
      System.out.printf("1등: %d회, 2등: %d회, 3등: %d회, 4등: %d회, 5등: %d회, 꽝: %d회",
            prize1, prize2, prize3, prize4, prize5, failCnt);

   }

}