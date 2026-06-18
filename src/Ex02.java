public class Ex02 {
    public static void main(String[] args){
        // for + while
        // fori 후 enter를 입력하면 자동으로 i를 조건으로 하는 for문을 생성
        // 정방향(++)
        for (int i = 1; i <= 9; i++) {
            System.out.println("i = " + i);
        }

        int w = 1;
        while(w <= 9){
            System.out.println("w = " + w++);
        }

        // 역방향(--)
//        for (int i = 1; i <= 9; i--) {// 종료 조건을 못 만나서 무한 반복
        for (int i = 9; i > 0; i--) {
            System.out.println("i = " + i);
        }

        // 이중 for문
        // scope가 달라서 조건문 안에는 같은 변수명을 넣어도 상관 X
        // 이중 for문 안이나 전역 변수를 활용하면 조심해야 됨
        for (int i = 1; i <=9 ; i++) {
            System.out.println("i = " + i);
//            for (int i = 0; i <= 9; i++) { // scope 문제 발생
//            for (int j = 0; j <= 9; i++) { // 증감식 잘못 기록
            for (int j = 0; j <= 9; j++) {
                System.out.println("j = " + j);
                System.out.println(i + " * " + j + " = " + (i * j));
                // 제일 안에 있는 루프가 가장 먼저 종료되고 나서야 다음 루프와 다음 단계로 진행한다.
            }
            
        }

        // 삼중 for문 - 실무적으로는 이런 일이 많이 없고, 알고리즘 적으로는 시간 복잡도 최악
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    System.out.println("k = " + k);
                    System.out.println(i + " * " + j + " * " + k + " = " + (i * j * k));
                }
            }
        }
    }
}
