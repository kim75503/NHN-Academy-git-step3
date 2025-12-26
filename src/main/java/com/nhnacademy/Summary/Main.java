//25.12.26

package com.nhnacademy.Summary;


public class Main {
    public static void main( String[] args )
    {
        //###연산결과 타입
        //####정수 연산결과:
        int a = 5;
        int b = 3;
        
        int result1 = a + b;   // int + int = int
        int result2 = a / b;   // int / int = int (1, 소수점 버림)

        //####정수와 실수 혼합 연산:
        /*
        int a = 5;
        double b = 2.0;
        */
        double result = a / b;  // int / double = double (2.5)
        // 더 큰 타입으로 자동 변환 (int → double)
        
        /*
        ####타입 변환 규칙 (자동 승격):

        타입 변환 규칙 (자동 승격):

        연산	         결과 타입	        예시    
        byte + byte	    int	        byte, short는 int로 승격
        short + short	int	        byte, short는 int로 승격
        int + int	    int	        5 + 3 → 8
        float + float	float	    1.5f + 2.5f → 4.0f
        int + double	double	    5 + 3.0 → 8.0
        int / int	    int	        5 / 3 → 1
        int / double	double	    5 / 3.0 → 1.666
        double / int	double	    5.0 / 3 → 1.666
        참고: Java에서 byte, short, char 타입은 산술 연산 시 자동으로 int로 승격됩니다.
         */

        //####명시적 형변환 (캐스팅):

        /*
        int a = 5;
        int b = 3;

        // 정수 나눗셈 → 소수점 버림
        int result1 = a / b;           // 1

        // 형변환으로 실수 나눗셈
        double result2 = (double) a / b;  // 1.666...
        double result3 = a / (double) b;  // 1.666...
        double result4 = (double) (a / b); // 1.0 (이미 1로 계산된 후 변환)
         */

        //####문자열 연결 연산:

        /*
        String name = "Java";
        int version = 21;

        // + 연산자로 문자열 연결
        String result = name + version;  // "Java21"
        String result2 = version + name; // "21Java"

        // 주의: 연산 순서
        System.System.out.println(1 + 2 + "점");   // "3점" (1+2=3, 3+"점")
        System.System.out.println("점수: " + 1 + 2); // "점수: 12" (문자열+1="점수: 1", +"2")
        System.System.out.println("점수: " + (1 + 2)); // "점수: 3" (괄호 먼저)
         */

        //####나머지 연산자 활용:

        /*
        // 짝수/홀수 판별
        int num = 7;
        if (num % 2 == 0) {
        System.System.out.println("짝수");
        } else {
            System.System.out.println("홀수");
        }

        // 배수 판별
        if (num % 3 == 0) {
            System.System.out.println("3의 배수");
        }
         */

        //복합 대입 연산자:

        /*
        연산자	    의미	    예시	      동일한 표현
        +=	    더하고 대입	    a += 3	    a = a + 3
        -=	    빼고 대입	    a -= 3	    a = a - 3
        *=	    곱하고 대입	    a *= 3	    a = a * 3
        /=	    나누고 대입	    a /= 3	    a = a / 3
        %=	    나머지 대입	    a %= 3	    a = a % 3
        Ex) 
        int count = 10;
        count += 5;   // count = 15
        count -= 3;   // count = 12
        count *= 2;   // count = 24
        */

        //####증감 연산자:

        /*
        연산자	위치	의미
        ++	앞	먼저 증가, 후에 사용
        ++	뒤	먼저 사용, 후에 증가
        --	앞	먼저 감소, 후에 사용
        --	뒤	먼저 사용, 후에 감소

        int i = 5;
        System.System.out.println(i++);  // 출력: 5, i는 6이 됨
        System.System.out.println(++i);  // 출력: 7, i는 7이 됨
        System.System.out.println(i--);  // 출력: 7, i는 6이 됨
        System.System.out.println(--i);  // 출력: 5, i는 5가 됨
        */

        //###비교 연산자
        //비교 연산자의 종류:
        /*
        연산자	  의미	    예시	    결과
        ==	    같다	  5 == 5	 true
        !=	    같지않다   5 != 3	  true
        >	    크다	  5 > 3	     true
        <	    작다	  5 < 3	     false
        >=	    크거나 같다	5 >= 5	   true
        <=	    작거나 같다	5 <= 3	   false
         */

        //####비교 연산자 활용:
        /*
        int age = 20;
        int limit = 18;

        boolean isAdult = age >= limit;  // true
        boolean isExact = age == limit;  // false
        boolean isUnder = age < limit;   // false
         */

        //###논리 연산자
        //####논리 연산자 종류:

        /*
        연산자	  의미	        설명
        &&	    AND	    둘 다 true여야 true
        ||	    OR	    하나라도 true면 true
        !	    NOT	    true↔false 반전
         */

        //####AND (&&)연산 :
        /*
        int age = 25;
        boolean hasLicense = true;

        // 둘 다 만족해야 true
        if (age >= 18 && hasLicense) {
        System.System.out.println("운전 가능");
        }

        A	    B	    A && B
        true	true	true
        true	false	false
        false	true	false
        false	false	false

         */

        //####OR (||) 연산 :

        /*
        String input = "quit";

        // 하나라도 만족하면 true
        if (input.equals("q") || input.equals("quit") || input.equals("exit")) {
            System.System.out.println("프로그램 종료");
        }

        A	    B	    A || B
        true	true	true
        true	false	true
        false	true	true
        false	false	false
         */

        //####NOT (!) 연산:

        /*
        boolean isFinished = false;

        if (!isFinished) {  // isFinished가 false이면 true
            System.System.out.println("아직 진행 중");
        }

        A	    !A
        true	false
        false	true

        복합 조건:

        int score = 85;
        int age = 20;

        // AND와 OR 조합 (AND가 OR보다 우선순위 높음)
        if (score >= 80 && age >= 18 || score >= 90) {
            System.System.out.println("합격");
        }

        // 괄호로 우선순위 명확히
        if ((score >= 80 && age >= 18) || score >= 90) {
            System.System.out.println("합격");
        }

        //단락 평가 (Short-circuit Evaluation):

        // && : 앞이 false면 뒤는 평가 안 함
        if (false && someMethod()) {  // someMethod() 실행 안 됨
            // ...
        }

        // || : 앞이 true면 뒤는 평가 안 함
        if (true || someMethod()) {   // someMethod() 실행 안 됨
            // ...
        }

        // null 체크에 유용
        String str = null;
        if (str != null && str.length() > 0) {  // str이 null이면 length() 호출 안 함
            System.System.out.println("문자열 있음");
        }
         */

        //###연산자 우선순위
        //####우선순위 표(높은 순):

        /*
        순위	연산자	            설명
        1	  (), [], .	        괄호, 배열, 멤버접근
        2	  ++, --, !	        단항 연산자
        3	  *, /, %	        곱셈, 나눗셈, 나머지
        4	  +, -	            덧셈, 뺄셈
        5	  <, <=, >, >=	    비교
        6	  ==, !=	        동등 비교
        7	  &&	            논리 AND
        8	  ||	            논리 OR
        9	  =, +=, -=, *=, ..	대입
        */

        //####산술 연산자 우선순위:

        /*
        int result = 2 + 3 * 4;      // 2 + 12 = 14 (곱셈 먼저)
        int result2 = (2 + 3) * 4;   // 5 * 4 = 20 (괄호 먼저)

        int result3 = 10 - 4 / 2;    // 10 - 2 = 8 (나눗셈 먼저)
        int result4 = 10 % 3 + 1;    // 1 + 1 = 2 (나머지 먼저)
         */
        
        //####비교와 논리 연산자:

        /*
        // && 가 || 보다 우선순위 높음
        boolean a = true || false && false;  // true || false = true
        boolean b = (true || false) && false; // true && false = false

        // 비교 연산자는 논리 연산자보다 우선순위 높음
        int x = 5;
        boolean c = x > 3 && x < 10;  // (x > 3) && (x < 10) = true
         */

        //####권장: 괄호 사용:

        /*
        // 우선순위 외우지 말고 괄호로 명확히!
        int score = 85;
        int age = 20;

        // 가독성 좋음
        if ((score >= 80) && (age >= 18)) {
            System.System.out.println("합격");
        }

        // 복잡한 조건도 괄호로 명확히
        if (((score >= 90) || (score >= 80 && age >= 20)) && (!isExpired)) {
            System.System.out.println("통과");
        }
         */

        //###if 문
        //####기본 구조:

        /*
        if (조건) {
            // 조건이 true일 때 실행
        }

        Ex)
        int score = 85;

        if (score >= 80) {
            System.System.out.println("합격입니다.");
        }
         */

        //####조건식에 사용되는 비교 연산자:
        /*
        연산자	  의미	      예시
        ==	    같다	    a == b
        !=	    같지 않다	 a != b
        >	    크다	    a > b
        <	    작다	    a < b
        >=	    크거나 같다	  a >= b
        <=	    작거나 같다	  a <= b
         */        

        //####논리 연산자:
        /*
        연산자	  의미	       예시
        &&	    AND	    a > 0 && b > 0 (둘 다)
        ||	    OR	    a > 0 || b > 0 (하나)
        !	    NOT	    !isFinished (반전)
         */


        //###if-else 문
        //####기본 구조 :
        /*
        if (조건) {
           // 조건이 true일 때 실행
        } else {
            // 조건이 false일 때 실행
        }
        Ex)
        int age = 15;

        if (age >= 18) {
            System.System.out.println("성인입니다.");
        } else {
            System.System.out.println("미성년자입니다.");
        }
        // 출력: 미성년자입니다.    

         */

        //####활용 예시 - 짝수/홀수 판별:
        /*
        int num = 7;

        if (num % 2 == 0) {
            System.System.out.println("짝수입니다.");
        } else {
            System.System.out.println("홀수입니다.");
        }
        // 출력: 홀수입니다.
         */

        //###메뉴 출력 패턴
        //####기본 메뉴 구조:
        /*
        while (true) {
            // 메뉴 출력
            System.System.out.println("=== TODO 관리 ===");
            System.System.out.println("1. 등록");
            System.System.out.println("2. 조회");
            System.System.out.println("0. 종료");
            System.out.print("선택: ");

            String choice = reader.readLine();

            // 선택에 따른 처리
            if ("0".equals(choice)) {
                System.System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 다른 메뉴 처리...
        }
         */
        
        //###if-else if-else 문
        //####기본 구조:
        /*
        if (choice.equals("1")) {
            System.System.out.println("등록을 선택했습니다.");
        } else if (choice.equals("2")) {
            System.System.out.println("조회를 선택했습니다.");
        } else if (choice.equals("0")) {
            System.System.out.println("종료합니다.");
            return;
        } else {
            System.System.out.println("잘못된 입력입니다.");
        }
         */
        
        //####if vs if-else 차이:
        /*
        int score = 85;

        // 독립적인 if문 - 모든 조건 검사
        if (score >= 90) System.System.out.println("A");  // 검사
        if (score >= 80) System.System.out.println("B");  // 검사, 출력
        if (score >= 70) System.System.out.println("C");  // 검사, 출력
        // 출력: B, C

        // if-else if - 첫 번째 참인 조건만 실행
        if (score >= 90) System.System.out.println("A");
        else if (score >= 80) System.System.out.println("B");  // 출력
        else if (score >= 70) System.System.out.println("C");  // 검사 안 함
        // 출력: B
         */

        //####논리 연산자 활용:
        /*
        // AND (&&) - 두 조건 모두 참이어야 참
        if (age >= 18 && hasLicense) {
            System.System.out.println("운전 가능");
        }

        // OR (||) - 하나라도 참이면 참
        if (choice.equals("0") || choice.equals("quit")) {
            System.System.out.println("종료");
        }

        // NOT (!) - 참/거짓 반전
        if (!isCompleted) {
            System.System.out.println("아직 완료되지 않음");
        }
         */

        //####문자열 비교 주의:
        /*
        // ❌ 잘못된 방법
        if (choice == "1")  // 참조 비교 (주소 비교)

        // ✅ 올바른 방법
        if (choice.equals("1"))  // 값 비교

        // ✅ Null-safe 방법
        if ("1".equals(choice))  // choice가 null이어도 안전
         */

        //###switch-case 문
        //####기본 구조:
        /*
        switch (choice) {
            case "1":
                System.System.out.println("등록을 선택했습니다.");
                break;
            case "2":
                System.System.out.println("조회를 선택했습니다.");
                break;
            case "0":
                System.System.out.println("종료합니다.");
                return;
            default:
                System.System.out.println("잘못된 입력입니다.");
        }
         */

        //case에 사용 가능한 타입:
        /*
        타입	                 Java 버전	    예시
        byte, short, int, char	1.0+	 case 1:, case 'A':
        enum	                5+	     case MONDAY:
        String	                7+	     case "hello":

        사용 불가능한 타입: long, float, double, boolean, 일반 객체
         */

        //####⚠️ break 누락 주의 (Fall-through):
        /*
        // break가 없으면 다음 case도 실행됨!
        int num = 1;
        switch (num) {
            case 1:
                System.System.out.println("1");
                // break 없음 - fall-through!
            case 2:
                System.System.out.println("2");  // num=1이어도 실행됨
                break;
            case 3:
                System.System.out.println("3");
                break;
        }
        // 출력: 1, 2
         */

        //####Fall-through 활용 (의도적 사용):
        /*
        int day = 3;  // 수요일
        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.System.out.println("평일입니다.");
                break;
            case 6: case 7:
                System.System.out.println("주말입니다.");
                break;
            default:
                System.System.out.println("잘못된 입력입니다.");
        }
        */

        //###switch vs if-else 선택 기준
        //####switch가 적합한 경우:
        /*
        - 값이 정확히 일치하는 조건
        - 비교할 값이 3개 이상일 때
        - 코드 가독성이 중요할 때

        // switch가 적합
        switch (menuChoice) {
            case "1": handleAdd(); break;
            case "2": handleList(); break;
            case "3": handleEdit(); break;
            case "4": handleDelete(); break;
            case "0": exit(); break;
            default: showError();
        }
        */

        //####if-else가 적합한 경우:
        /*
        - 범위 조건 (x > 10, x >= 0 && x < 100)
        - 복잡한 조건 (&&, || 조합)
        - null 체크가 필요할 때

        // if-else가 적합
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            grade = "F";
        }
         */

        //####선택 가이드:
        /*
        상황	                    권장	       이유
        메뉴 선택 (1, 2, 3...)	    switch	    가독성 좋음
        점수 범위 (90이상, 80이상...) if-else	  switch는 범위 불가
        null 가능성 있음	        if-else	s    witch는 null 불가
        조건이 2개 이하	             if-else	 switch는 과함
         */
        
        //###분기문: break, continue, return
        //####분기문 이란?
        /*
        - 프로그램의 실행 흐름을 점프시키는 문법
        - 반복문이나 메서드를 제어하는 데 사용
         */

        //####3가지 분기문 비교 :
        /*
        키워드	        동작	                    사용 위치
        break	    가장 가까운 반복문/switch 탈출	   반복문, switch
        continue	현재 반복을 건너뛰고 다음 반복	     반복문
        return	    메서드 전체 종료 (값 반환)	       메서드 어디서든
         */

        //####break - 반복문/switch 탈출:
        /*
        // 반복문에서 break
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                break;  // 반복문 탈출
            }
            System.System.out.println(i);
        }
        // 출력: 1, 2, 3, 4

        // switch에서 break
        switch (choice) {
            case "1":
                System.System.out.println("선택 1");
                break;  // switch 탈출
            case "2":
                System.System.out.println("선택 2");
                break;
        }
         */

        //####continue - 현재 반복 건너뛰기:
        /*
        int i = 0;
        while (i < 5) {
            i++;
            if (i == 3) {
                continue;  // 아래 코드 건너뛰고 다음 반복으로
            }
            System.System.out.println(i);
        }
        // 출력: 1, 2, 4, 5  (3은 건너뜀)
         */

        //####return - 메서드 종료:
        /*
        public void processMenu(String choice) {
           if ("0".equals(choice)) {
                System.System.out.println("종료합니다.");
                return;  // 메서드 종료
            }

            System.System.out.println("선택: " + choice);
            // return 이후에는 이 코드가 실행됨
        }
         */

        //####break vs continue vs return 비교:
        /*
        public void compare() {
            int i = 0;
            while (i < 5) {
                i++;
                if (i == 3) {
                    // break;     → 1, 2 출력 후 반복문 탈출, "끝" 출력
                    // continue;  → 1, 2, 4, 5 출력 (3만 건너뜀), "끝" 출력
                    // return;    → 1, 2 출력 후 메서드 종료, "끝" 출력 안 됨
                }
                System.System.out.println(i);
            }
            System.System.out.println("끝");
        }
         */

        //####중첩 반복문에서 break:
        /*
        // break는 가장 가까운 반복문만 탈출
        int i = 0;
        while (i < 3) {
            i++;
            int j = 0;
            while (j < 3) {
                j++;
                if (j == 2) {
                    break;  // 안쪽 while문만 탈출
                }
                System.System.out.println("i=" + i + ", j=" + j);
            }
        }
        // 출력: i=1,j=1 / i=2,j=1 / i=3,j=1
         */
    }
}
