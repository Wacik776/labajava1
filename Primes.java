public class Primes {
    
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++) {
            if(isPrime(i)) System.out.println(i); //вывод простых чисел
        }

    }
    public static boolean isPrime(int n) {//функция на проверку простоты
        for(int i = 2; i < n; i ++){
            if (n % i == 0) { //провекра на простоту
                return false;
            }
        }
        return true;
    }
    }
    