//
//// 추상 클래스로 변경
//abstract class BankAccount {
//
//    public String getOwner() {
//        return owner;
//    }
//
//    public static int getTotalAccount (){
//        return totalAccount;
//    }
//
//    public static void main(String[] args) {
//        //1. 계좌 생성
//        NormalAccount normal = new NormalAccount("1111-2222", "홍길동");
//        // 마이너스 통장 개설 (한도 10만원)
//        MinusAccount minus = new MinusAccount("3333-4444", "김철수", 100000);
//
//        // 2. 입금
//        normal.deposit(50000);
//        minus.deposit(50000);
//
//        System.out.println("=== 일반 계좌 출금 ===");
//        System.out.println("현재 잔액 : " + normal.getBlance());
//
//        // 7만원 출금 시도
//        if (normal.withdraw(70000)) {
//            System.out.println("출금 성공");
//        } else {
//            System.out.println("출금 실패");
//        }
//
//        System.out.println("=== 마이너스 계좌 출금 ===");
//        System.out.println("현재 잔액 : " + normal.getBlance());
//
//        // 7만원 출금 시도
//        if (normal.withdraw(70000)) {
//            System.out.println("출금 성공");
//            System.out.println("현재 잔액 : " + minus.getBlance());
//        } else {
//            System.out.println("출금 실패");
//        }
//    }
//
//    // 필드
//    private String accountNumber; // 계좌번호
//    private String owner; // 예금주
//    protected int balance; // 잔액 (private -> protected 변경 : 자식 메서드에서 사용하기 위해서)
//    private static int totalAccount; // 전체 계좌 수
//
//    // 생성자
//    public BankAccount(String accountNumber, String owner) {
//        this.accountNumber = accountNumber;
//        this.owner = owner;
//        this.balance = 0;
//        totalAccount++;
//    }
//    // 메서드
//    // 1. 입금
//    public void deposit (int amount) {
//        if (amount > 0) {
//            balance += amount;
//        }
//    }
//
//    // 2. 출금 (추상 메서드로 변경 -> 계좌 종류별로 구현을 다르게 하기 위함)
//    abstract boolean withdraw (int amount) ;
//
//    // 3. 잔액 조회
//    }
//
//
//// 일반 계좌
//class NormalAccount extends BankAccount {
//    public NormalAccount(String accountNumber, String owner) {
//        super(accountNumber, owner);
//    }
//
//    @Override
//    boolean withdraw(int amount) {
//        if (amount > 0 && balance >= amount) {
//            balance -= amount;
//            return true;
//        }
//        return false;
//    }
//}
//
//// 마이너스 통장
//class  MinusAccount extends BankAccount {
//
//    private int minusLimit;
//
//    public  MinusAccount(String accountNumber, String owner, int minusLimit) {
//        super(accountNumber, owner);
//        this.minusLimit = minusLimit;
//    }
//
//
//    boolean withdraw(int amount) {
//        // 잔액 + 마이너스 한도액 까지 출금 가능
//        if (amount > 0 && balance + minusLimit >= amount) {
//            balance -= amount;
//            return true;
//        }
//        return false;
//    }
//}