package com.encapsulation;

public class Test_Account {
    public static void main(String[] args) {
        Account account=new Account();
        account.setAccount_no(1691500882);
        account.setName("Ashok Reddy");
        account.setEmail("ashokreddy0441@gmail.com");
        account.setAddress("2-91, Polepalle Village, Durgi Mandal, Palnadu District, 522612");
        account.setAmount(100000f);

        System.out.println(account.getAccount_no()+" "+account.getName()+" "+account.getEmail()+" "+account.getAmount());
        System.out.println(account.getName());
        System.out.println(account.getAccount_no());
        System.out.println(account.getEmail());
        System.out.println(account.getAmount());
        System.out.println(account.getAddress());

    }
}
