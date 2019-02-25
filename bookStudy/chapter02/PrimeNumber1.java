package algorithm.bookStudy.chapter02;

// 1000 이하의 소수를 보여줍니다
public class PrimeNumber1 {

    static void primeNumberV1() { // 모든 수를 확인하는 방법
        int counter = 0; // 나눗셈의 횟수
        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) // 나누어떨어지면 소수가 아님
                    break;
            }
            if (n == i)
                System.out.println(n);
        }
        System.out.println("나눗셈을 수행한 수 : " + counter); // 알고리즘 = 78,022
    }
    
    static void primeNumberV2() { // 소수로만 확인하는 방법
        int counter = 0; // 나눗셈의 횟수
        int ptr = 0; // 찾은 소수의 갯수
        int[] prime = new int[500]; // 소수를 저장할 배열
        
        prime[ptr++] = 2; // 2는 소수임
        
        for (int n = 3; n <= 1000; n+=2) { // 대상은 홀수만
            int i;
            for (i = 1; i < ptr; i++) { // 이미 찾은 소수로 나누어 봄
                counter++;
                if (n % prime[i] == 0) // 나누어떨어지면 소수가 아님
                    break; // 더 이상의 반복은 불필요
            }
            if (ptr == i) // 마지막까지 나누어 떨어지지 않음
                prime[ptr++] = n; // 소수라고 배열에 저장
        }
        
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈을 수행한 수 : " + counter); // 알고리즘 개선전 = 78,022 / 개선후 = 14,622
    }
    
    static void primeNumberV3() { // 제곱근으로 확인하는 방법
        int counter = 0; // 나눗셈의 횟수
        int ptr = 0; // 찾은 소수의 갯수
        int[] prime = new int[500]; // 소수를 저장할 배열
        
        prime[ptr++] = 2; // 2는 소수임
        prime[ptr++] = 3; // 3은 소수임
        
        for (int n = 5; n <= 1000; n+=2) { // 대상은 홀수만
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) // 나누어떨어지면 소수가 아님
                    flag = true;
                break; // 합성수이므로 더 이상의 반복은 불필요
            }
            if (!flag) { // 마지막까지 나누어 떨어지지 않음
                prime[ptr++] = n; // 소수라고 배열에 저장
                counter++;
            }
        }
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈을 수행한 수 : " + counter); // 알고리즘 개선전 = 78,022 / 개선후 = 14,622 / 개선후 = 1324
    }
    public static void main(String[] args) {

        primeNumberV1(); // 모든 수를 확인하는 방법 = 78,022
        primeNumberV2(); // 소수로만 확인하는 방법 = 14,622
        primeNumberV3(); // 제곱근으로 확인하는 방법 = 1,324
        
    }

}
