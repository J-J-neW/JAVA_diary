import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    private Account loginAcc;

    public void start(){
        //欢迎界面
        while (true){
            System.out.println("===银行ATM===");
            System.out.println("1、账户登录");
            System.out.println("2、账户开户");
            System.out.println("3、退出");
            String index = sc.next();
            switch (index) {
                case "1":
                    //账户登录
                    login();
                    break;
                case "2":
                    //账户开户
                    creatAccount();
                    break;
                case "3":
                    //退出
                    return;
                default:
                    System.out.println("没有此选项哦！");
            }
        }
    }

    private void creatAccount(){
        Account acc = new Account();
        System.out.println("请输入您的姓名：");
        String name = sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请输入您的性别：");
            char sex = sc.next().charAt(0);
            //性别只有两个选项，用if排除掉无关内容
            if(sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;
            }else{
                System.out.println("没有此性别哦！请重新输入：");
            }
        }

        while (true) {
            System.out.println("请输入您的密码：");
            String passWord = sc.next();
            System.out.println("请确认您的密码：");
            String okPassWord = sc.next();
            //equals判断两个字符串是否一致
            if(okPassWord.equals(passWord)){
                acc.setPassWord(okPassWord);
                break;
            }else{
                System.out.println("您确认的密码不正确，请重新输入：");
            }
        }

        System.out.println("请输入您的限额：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        //随机创建一个id
        String cardId = creatCardId();
        acc.setCardId(cardId);

        accounts.add(acc);
        System.out.println("恭喜您 " + acc.getUserName() + " 开户成功！");
        System.out.println("您的卡号是：" + acc.getCardId());
        System.out.println("==================");
    }

    private String creatCardId(){
        while (true) {
            String cardId = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10);
                cardId += data;
            }
            Account acc = getAccountCardId(cardId);
            if(acc == null){
                return cardId;
            }
        }
    }

    //用于查找是否有相同的数值
    private Account getAccountCardId(String cardId){
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null;
    }

    private void login(){
        System.out.println("===银行登录系统===");
        //判断accounts里面是否有账户对象
        if(accounts.size() == 0){
            System.out.println("系统还不存在用户，请先开户！");
            return;
        }
        //判断这个账户是否存在
        while (true) {
            System.out.println("请输入需要登录的卡号：");
            String cardId = sc.next();
            Account acc = getAccountCardId(cardId);
            if(acc == null){
                System.out.println("输入的卡号不存在，请重新输入：");
            }else{
                while (true) {
                    System.out.println("请输入卡号的密码：");
                    String passWord = sc.next();
                    if(acc.getPassWord().equals(passWord)){
                        //密码正确
                        loginAcc = acc;
                        System.out.println(acc.getUserName() + " 登录成功，欢迎您~");
                        shwoAccountUI();
                        return;
                    }else{
                        //密码错误
                        System.out.println("您输入的密码错误，请重新输入：");
                    }
                }
            }
        }
    }

    private void shwoAccountUI(){
        while (true) {
            System.out.println();
            System.out.println(loginAcc.getUserName() + " 可操作信息如下：");
            System.out.println("=======================");
            System.out.println("1、查询账户信息");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转款");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销账户");
            System.out.println("=======================");
            String command = sc.next();
            switch (command){
                case "1":
                    //查询账户
                    checkAccount();
                    break;
                case "2":
                    //存款
                    saveMoney();
                    break;
                case "3":
                    //取款
                    getMoney();
                    break;
                case "4":
                    //转账
                    transferMoney();
                    break;
                case "5":
                    //修改密码
                    revisePassWord();
                    return;
                case "6":
                    //退出
                    System.out.println(loginAcc.getUserName() + " 退出成功~");
                    return;
                case "7":
                    //注销账户
                    if(deleteAccount()){
                        return;
                    }
                    break;
                default:
                    System.out.println("没有此选项，请重新输入：");
            }
        }
    }

    private void checkAccount(){
        while (true) {
            System.out.println("===银行详细信息===");
            System.out.println("卡号：" + loginAcc.getCardId());
            System.out.println("姓名：" + loginAcc.getUserName());
            System.out.println("性别：" + loginAcc.getSex());
            System.out.println("余额：" + loginAcc.getMoney());
            System.out.println("每日限额：" + loginAcc.getLimit());
            System.out.println("----------");
            System.out.println("0、Exit");
            System.out.println("----------");
            int index = sc.nextInt();
            if(index == 0){
                return;
            }else{
                System.out.println("没有此选项哦~");
            }
        }
    }

    private void saveMoney(){
        System.out.println("当前余额为：" + loginAcc.getMoney());
        System.out.println("请输入需要存的金额：");
        double money = sc.nextDouble();
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("存款成功！当前剩余余额为：" + loginAcc.getMoney());
    }

    private void getMoney(){
        if(loginAcc.getMoney() < 100){
            System.out.println("===银行提醒信息===");
            System.out.println("卡里的余额不足100，请先存款！");
            return;
        }

        System.out.println("当前余额为：" + loginAcc.getMoney());
        while (true) {
            System.out.println("请输入需要取走的金额：");
            double money = sc.nextDouble();
            if(loginAcc.getMoney() >= money){
                if(money > loginAcc.getLimit()){
                    System.out.println("需要取走的金额大于每日限额！每次最多可取：" + loginAcc.getLimit());
                }else{
                    loginAcc.setMoney(loginAcc.getMoney() - money);
                    System.out.println("取款成功！剩余金额为：" + loginAcc.getMoney());
                    return;
                }
            }else{
                System.out.println("卡里的余额不足，剩余余额为：" + loginAcc.getMoney());
            }
        }
    }

    private void transferMoney(){
        if(accounts.size() < 2){
            System.out.println("===银行提醒信息===");
            System.out.println("银行系统账户无法满足两个账户，请先开户");
            return;
        }
        if(loginAcc.getMoney() < 100){
            System.out.println("===银行提醒信息===");
            System.out.println("余额不足！无法进行转款操作，当前余额为：" + loginAcc.getMoney());
            return;
        }

        while (true) {
            System.out.println("===银行转款功能===");
            System.out.println("请输入需要转款的卡号：");
            String cardId = sc.next();
            Account acc = getAccountCardId(cardId);
            if(acc == null){
                System.out.println("没有此账户信息，请重新输入：");
            }else{
                String name = "*" + acc.getUserName().substring(1);
                while (true) {
                    System.out.println("您当前要为【" + name + "】转款");
                    System.out.println("请输入其姓氏以确认：");
                    String preName= sc.next();
                    if(acc.getUserName().startsWith(preName)){
                        while (true) {
                            System.out.println("请输入需要转款的金额：");
                            double money = sc.nextDouble();
                            if(loginAcc.getMoney() >= money){
                                loginAcc.setMoney(loginAcc.getMoney() - money);
                                acc.setMoney(acc.getMoney() + money);
                                System.out.println("转款成功！");
                                System.out.println("当前剩余余额为：" + loginAcc.getMoney());
                                return;
                            }else{
                                System.out.println("转款金额不足以满足此次要求，您当前余额为：" + loginAcc.getMoney());
                            }
                        }
                    }else{
                        System.out.println("您输入的姓氏不正确，请重新输入：");
                    }
                }
            }
        }
    }

    private boolean deleteAccount(){
        System.out.println("===银行销户功能===");
        System.out.println("确认销户吗？  y/n");
        String index = sc.next();
        switch (index){
            case "y":
                if(loginAcc.getMoney() == 0){
                    accounts.remove(loginAcc);
                    System.out.println("销户成功！感谢您的支持！");
                    return true;
                }else{
                    System.out.println("账户还有余额，不允许销户！当前余额为：" + loginAcc.getMoney());
                    return false;
                }
            default:
                System.out.println("好的，保留账户！");
                return false;
        }

    }

    private void revisePassWord(){
        while (true) {
            System.out.println("===银行密码系统===");
            System.out.println("请输入当前账户的密码：");
            String passWord = sc.next();
            if(loginAcc.getPassWord().equals(passWord)){
                System.out.println("密码验证成功！");
                while (true) {
                    System.out.println("请输入新的密码：");
                    String newPassWord = sc.next();
                    System.out.println("请确认新的密码：");
                    String okPassWord = sc.next();
                    if(newPassWord.equals(okPassWord)){
                        loginAcc.setPassWord(okPassWord);
                        System.out.println("密码修改成功！");
                        return;
                    }else{
                        System.out.println("确认密码不正确，请重新输入：");
                    }
                }
            }else{
                System.out.println("输入的密码不正确，请重新输入：");
            }
        }
    }

}
